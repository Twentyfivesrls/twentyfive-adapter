package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

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
    public Map<LocalDate, List<LocalTime>> findTimeForNumSlots(LocalDateTime startingDate, int numSlotsRequired) {
        Map<LocalDate, List<LocalTime>> result = new HashMap<>();

        //per ogni giorno successivo a starting date faccio processDay per prendermi le ore di quel giorno che sono valide
        //per effettuare quell'ordine di n slot
        numSlotsMap.entrySet().stream()
                .filter(dayEntry -> !dayEntry.getKey().isBefore(startingDate.toLocalDate()))
                .forEach(dayEntry -> processDay(dayEntry, startingDate, numSlotsRequired, result));

        return result;
    }

    private void processDay(Map.Entry<LocalDate, Map<LocalTime, Integer>> dayEntry, LocalDateTime startingDate, int numSlotsRequired, Map<LocalDate, List<LocalTime>> result) {
        LocalDate date = dayEntry.getKey();
        List<LocalTime> dayResult = new ArrayList<>();

        //per ogni ora lavorativa in quel giorni faccio evaluateHour per vedere se quell'ora va bene per quell'ordine di n slot
        dayEntry.getValue().entrySet().stream()
                .filter(hourEntry -> !date.atTime(hourEntry.getKey()).isBefore(startingDate))
                .forEach(hourEntry -> evaluateTime(dayEntry.getValue(), hourEntry, numSlotsRequired, dayResult));

        if (!dayResult.isEmpty()) {
            result.put(date, dayResult);
        }
    }

    private void evaluateTime(Map<LocalTime, Integer> hoursMap, Map.Entry<LocalTime, Integer> hourEntry, int numSlotsRequired, List<LocalTime> dayResult) {
        //l'ora va bene se o ci sono abbastanza slot, oppure, guardando alle ore precedenti di quel giorno ho abbastanza buchi per
        //ricoprire il numero di slot richiesto dall'ordine
        if (hourEntry.getValue() >= numSlotsRequired) {
            dayResult.add(hourEntry.getKey());
        } else {
            if (checkForHoles(hoursMap, hourEntry.getKey(), numSlotsRequired)) {
                dayResult.add(hourEntry.getKey());
            }
        }
    }

    private boolean checkForHoles(Map<LocalTime, Integer> hoursMap, LocalTime time, int numSlotsRequired) {
        int slotsCount = 0;
        NavigableMap<LocalTime, Integer> navigableMap = new TreeMap<>(hoursMap);

        // Filtro per considerare solo orari successivi a 'time'
        NavigableMap<LocalTime, Integer> subMap = navigableMap.tailMap(time, true);

        LocalTime now = LocalTime.now();  // Ora corrente

        Iterator<Map.Entry<LocalTime, Integer>> iterator = subMap.entrySet().iterator();

        // Iteriamo sugli orari disponibili
        while (iterator.hasNext()) {
            Map.Entry<LocalTime, Integer> subEntry = iterator.next();
            LocalTime slotTime = subEntry.getKey();

            // Controlla se l'orario è successivo all'ora corrente, ignorando l'intera ora corrente
            if (slotTime.isAfter(now.withMinute(0).withSecond(0).withNano(0))) {
                slotsCount += subEntry.getValue();
            }

            if (slotsCount >= numSlotsRequired) {
                return true; // Abbiamo trovato abbastanza slot
            }
        }

        return false; // Non ci sono abbastanza slot
    }


    public boolean reserveTimeSlots(LocalDateTime pickupDate, int numSlots) {
        LocalDate date = pickupDate.toLocalDate();
        Map<LocalTime, Integer> dailySlots = numSlotsMap.get(date);
        if (dailySlots == null) {
            return false; // No slots available for this day
        }
        LocalTime time= pickupDate.toLocalTime();

        if (checkForHoles(dailySlots, time, numSlots)) {
            int slotsToReserve = numSlots;
            // Reversed subMap to prioritize earlier times for slot deduction
            NavigableMap<LocalTime, Integer> subMap = new TreeMap<>(dailySlots).headMap(time, true).descendingMap();

            for (Map.Entry<LocalTime, Integer> entry : subMap.entrySet()) {
                int availableSlots = entry.getValue();
                if (slotsToReserve > 0 && availableSlots > 0) {
                    int slotsDeducted = Math.min(availableSlots, slotsToReserve);
                    dailySlots.put(entry.getKey(), availableSlots - slotsDeducted);
                    slotsToReserve -= slotsDeducted;
                }
                if (slotsToReserve <= 0) {
                    break;
                }
            }
            return true;
        }

        return false;
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
        Map<LocalDate, List<LocalTime>> availableSlots = ts.findTimeForNumSlots(startTime, 6);
        System.out.println("Available slots from " + startTime + ": " + availableSlots);

        // Test reserving slots
        boolean reservationSuccess = ts.reserveTimeSlots(LocalDateTime.now().withHour(11), 6);
        System.out.println("Reservation at 10 AM successful: " + reservationSuccess);

        // Check availability after reservation
        availableSlots = ts.findTimeForNumSlots(startTime, 6);
        System.out.println("Available slots after reservation from " + startTime + ": " + availableSlots);



        System.out.println(ts);

    }
}
