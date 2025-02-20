package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

@Data
public class TimeSlot {
    private String id;
    private Map<LocalDate, Map<LocalTime, Integer>> numSlotsMap; // Changes from Boolean to Integer

    public TimeSlot() {
        this.numSlotsMap = new TreeMap<>();
    }

    public void initializeDay(LocalDate date, Map<LocalTime, Integer> slotsPerHour) {
        // Directly put the provided map into the slotsMap for the given date
        numSlotsMap.put(date, new TreeMap<>(slotsPerHour));
    }
    public void removeDay(LocalDate date){
        numSlotsMap.remove(date);
    }

    public void clear(){
        numSlotsMap=new TreeMap<>();
    }

    /**
     * Finds times across all dates where at least a certain number of slots are available.
     *
     * @param numSlotsRequired the number of slots required.
     * @return a map of dates to a list of times where the required number of slots are available.
     */
    public Map<LocalDate, List<LocalTime>> findTimeForNumSlots(
            LocalDateTime startingDate,
            int numSlotsRequired,
            Set<LocalDate> inactivityDays) {  // Aggiungi un parametro per i giorni di inattività
        Map<LocalDate, List<LocalTime>> result = new HashMap<>();
        boolean[] firstSlotFound = new boolean[]{false};
        this.numSlotsMap.entrySet().stream()
                .filter(dayEntry -> {
                    LocalDate day = dayEntry.getKey();
                    // Escludi giorni antecedenti alla data di partenza e quelli presenti in inactivityDays
                    return !day.isBefore(startingDate.toLocalDate()) && !inactivityDays.contains(day);
                })
                .forEach(dayEntry -> {
                    this.processDay(dayEntry, startingDate, numSlotsRequired, result, firstSlotFound);
                });
        return result;
    }

    private void processDay(Map.Entry<LocalDate, Map<LocalTime, Integer>> dayEntry, LocalDateTime startingDate, int numSlotsRequired, Map<LocalDate, List<LocalTime>> result, boolean[] firstSlotFound) {
        LocalDate date = dayEntry.getKey();
        List<LocalTime> dayResult = new ArrayList<>();

        // Iteriamo su ogni orario di quella data
        dayEntry.getValue().entrySet().stream()
                .filter(hourEntry -> !date.atTime(hourEntry.getKey()).isBefore(startingDate))  // Considera solo orari dopo il startingDate
                .forEach(hourEntry -> {
                    if (!firstSlotFound[0]) {
                        evaluateTime(dayEntry.getValue(), hourEntry, numSlotsRequired, dayResult);
                        if (!dayResult.isEmpty()) {
                            firstSlotFound[0] = true;  // Segnala che abbiamo trovato il primo slot utile
                        }
                    } else {
                        // Dopo aver trovato il primo orario utile, continuiamo a processare quelli successivi
                        evaluateTime(dayEntry.getValue(), hourEntry, numSlotsRequired, dayResult);
                    }
                });

        if (!dayResult.isEmpty()) {
            result.put(date, dayResult);  // Aggiungi il risultato se ci sono orari validi
        }
    }



    private void evaluateTime(Map<LocalTime, Integer> hoursMap, Map.Entry<LocalTime, Integer> hourEntry, int numSlotsRequired, List<LocalTime> dayResult) {
        // Se ci sono abbastanza slot in questo orario, lo aggiungiamo subito
        if (hourEntry.getValue() >= numSlotsRequired) {
            dayResult.add(hourEntry.getKey());
        } else {
            // Se non ci sono abbastanza slot, verifichiamo se combinando slot precedenti soddisfiamo la richiesta
            boolean enoughSlots = checkForHoles(hoursMap, hourEntry.getKey(), numSlotsRequired);
            if (enoughSlots) {
                dayResult.add(hourEntry.getKey());
            }
        }
    }


    private boolean checkForHoles(Map<LocalTime, Integer> hoursMap, LocalTime time, int numSlotsRequired) {
        int slotsCount = 0;
        NavigableMap<LocalTime, Integer> navigableMap = new TreeMap<>(hoursMap);

        // Considera solo gli orari precedenti o uguali all'ora specificata
        NavigableMap<LocalTime, Integer> precedingMap = navigableMap.headMap(time, true);  // Include gli orari fino a 'time'

        // Iteriamo sugli orari precedenti (in ordine decrescente)
        for (Map.Entry<LocalTime, Integer> subEntry : precedingMap.descendingMap().entrySet()) {
            int availableSlots = subEntry.getValue();

            // Escludiamo gli orari che hanno 0 slot disponibili
            if (availableSlots > 0) {
                slotsCount += availableSlots;
            }

            // Se abbiamo raggiunto o superato il numero di slot richiesti, consideriamo validi
            if (slotsCount >= numSlotsRequired) {
                return true;  // Abbiamo trovato abbastanza slot
            }
        }

        return false;  // Non ci sono abbastanza slot
    }





    public boolean reserveTimeSlots(LocalDateTime pickupDate, int numSlots) {
        LocalDate date = pickupDate.toLocalDate();
        Map<LocalTime, Integer> dailySlots = this.numSlotsMap.get(date);

        if (dailySlots == null) {
            return false; // Se non ci sono slot disponibili per la data selezionata
        } else {
            LocalTime time = pickupDate.toLocalTime();
            LocalTime now = LocalTime.now();

            // Controllo per evitare di prenotare slot passati solo se la data è oggi
            if (date.equals(LocalDate.now())) {
                // Se l'orario di pickup è uguale o successivo all'ora corrente
                if (time.isBefore(now.withMinute(0).withSecond(0).withNano(0))) {
                    return false;  // Non è possibile prenotare in orari già passati
                }

                // Filtriamo per considerare solo gli slot fino all'orario scelto e dopo l'orario attuale
                dailySlots = dailySlots.entrySet().stream()
                        .filter(entry -> entry.getKey().isAfter(now) || entry.getKey().equals(now))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, TreeMap::new));
            }

            // Controlliamo se ci sono abbastanza slot disponibili, considerando solo gli slot precedenti o uguali
            if (!this.checkForHoles(dailySlots, time, numSlots)) {
                return false;
            } else {
                int slotsToReserve = numSlots;

                // Usare headMap per considerare solo gli orari precedenti o uguali al pickup time
                NavigableMap<LocalTime, Integer> subMap = new TreeMap<>(dailySlots).headMap(time, true).descendingMap();
                for (Map.Entry<LocalTime, Integer> entry : subMap.entrySet()) {
                    int availableSlots = entry.getValue();

                    if (slotsToReserve > 0 && availableSlots > 0) {
                        int slotsDeducted = Math.min(availableSlots, slotsToReserve);
                        dailySlots.put(entry.getKey(), availableSlots - slotsDeducted);
                        slotsToReserve -= slotsDeducted;
                    }

                    if (slotsToReserve <= 0) {
                        break;  // Abbiamo prenotato tutti gli slot necessari
                    }
                }

                // Se abbiamo prenotato con successo tutti gli slot
                return slotsToReserve == 0;
            }
        }
    }



    public boolean freeNumSlot(LocalDateTime selectedDate, int numSlots, Map<LocalTime, Integer> maxPerHour) {
        LocalDate date = selectedDate.toLocalDate();
        LocalTime time = selectedDate.toLocalTime();

        Map<LocalTime, Integer> daySlots = numSlotsMap.get(date);
        if (daySlots == null) {
            return false; // No slots available for this day
        }

        NavigableMap<LocalTime, Integer> subMap = new TreeMap<>(daySlots).headMap(time, true).descendingMap();
        int slotsNeeded = numSlots;

        // Temporary map to hold the changes until we are sure we can commit them
        Map<LocalTime, Integer> tempChanges = new TreeMap<>();

        // Check if redistribution is possible without exceeding maxPerHour for each hour
        for (Map.Entry<LocalTime, Integer> entry : subMap.entrySet()) {
            LocalTime currentHour = entry.getKey();
            int availableSlots = entry.getValue();
            Integer maxSlotsForThisHour = maxPerHour.getOrDefault(currentHour, Integer.MAX_VALUE);
            int possibleAdditions = Math.min(slotsNeeded, maxSlotsForThisHour - availableSlots);

            if (possibleAdditions > 0) {
                tempChanges.put(currentHour, availableSlots + possibleAdditions);
                slotsNeeded -= possibleAdditions;
            }

            if (slotsNeeded == 0) {
                break; // We've successfully found enough slots
            }
        }

        // If we were able to allocate all required slots, commit the changes
        if (slotsNeeded == 0) {
            for (Map.Entry<LocalTime, Integer> change : tempChanges.entrySet()) {
                daySlots.put(change.getKey(), change.getValue());
            }
            return true;
        }

        // Not enough slots could be redistributed
        return false;
    }



    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TimeSlotMap Details:\n");

        for (Map.Entry<LocalDate, Map<LocalTime, Integer>> dayEntry : numSlotsMap.entrySet()) {
            sb.append("Date: ").append(dayEntry.getKey()).append("\n");
            for (Map.Entry<LocalTime, Integer> timeEntry : dayEntry.getValue().entrySet()) {
                sb.append("  Time: ").append(timeEntry.getKey())
                        .append(" - Available Slots: ").append(timeEntry.getValue()).append("\n");
            }
            sb.append("\n"); // Add a blank line after each day for better readability
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        TimeSlot ts = new TimeSlot();

        // Initialize a day with time slots
        Map<LocalTime, Integer> slotsPerHour = new HashMap<>();
        slotsPerHour.put(LocalTime.of(9, 0), 2);
        slotsPerHour.put(LocalTime.of(10, 0), 2);
        slotsPerHour.put(LocalTime.of(11, 0), 2);
        slotsPerHour.put(LocalTime.of(12, 0), 1);
        slotsPerHour.put(LocalTime.of(13, 0), 1);

        ts.initializeDay(LocalDate.now(), slotsPerHour);

        System.out.println(ts);

        // Test finding time slots available from a specific start time
        LocalDateTime startTime = LocalDateTime.now().withHour(9).withMinute(0).withSecond(0).withNano(0);
        Map<LocalDate, List<LocalTime>> availableSlots = ts.findTimeForNumSlots(startTime, 6,new HashSet<>());
        System.out.println("Available slots from " + startTime + ": " + availableSlots);

        // Test reserving slots
        boolean reservationSuccess = ts.reserveTimeSlots(LocalDateTime.now().withHour(11), 6);
        System.out.println("Reservation at 10 AM successful: " + reservationSuccess);

        // Check availability after reservation
        availableSlots = ts.findTimeForNumSlots(startTime, 6,new HashSet<>());
        System.out.println("Available slots after reservation from " + startTime + ": " + availableSlots);



        System.out.println(ts);

    }
}
