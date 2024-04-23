package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class TimeSlot {
    private Map<LocalDate, Map<LocalTime, Integer>> numSlotsMap; // Changes from Boolean to Integer

    public TimeSlot() {
        this.numSlotsMap = new HashMap<>();
    }

    public void initializeDay(LocalDate date, Map<LocalTime, Integer> slotsPerHour) {
        // Directly put the provided map into the slotsMap for the given date
        numSlotsMap.put(date, new HashMap<>(slotsPerHour));
    }
    public void removeDay(LocalDate date){
        numSlotsMap.remove(date);
    }

    /**
     * Finds times across all dates where at least a certain number of slots are available.
     *
     * @param num_slots the number of slots required.
     * @return a map of dates to a list of times where the required number of slots are available.
     */
    public Map<LocalDate, List<LocalTime>> findTimeForSlots(LocalDateTime starting_date, int num_slots) {
        Map<LocalDate, List<LocalTime>> availableSlots = new HashMap<>();

        for (Map.Entry<LocalDate, Map<LocalTime, Integer>> dayMap : numSlotsMap.entrySet()) {
            List<LocalTime> times = new ArrayList<>();
            if(!dayMap.getKey().isBefore(starting_date.toLocalDate())) {//se la data è successiva
                for (Map.Entry<LocalTime, Integer> hourMap : dayMap.getValue().entrySet()) {
                    if (!hourMap.getKey().isBefore(starting_date.toLocalTime())) {
                        //un'ora è disponibile se ha sufficienti slot in se
                        //oppure se ci sono abbastanza buchi nelle ore passate del giorno
                        //per ricoprire quell'ordine
                        if (hourMap.getValue() >= num_slots) {
                            times.add(hourMap.getKey());
                        } else {
                            int count_holes = 0;
                            for (Map.Entry<LocalTime, Integer> possibleHolesMap : dayMap.getValue().entrySet()) {
                                if (!possibleHolesMap.getKey().isAfter(hourMap.getKey())) {
                                    count_holes += possibleHolesMap.getValue();
                                    if (count_holes >= num_slots) {
                                        times.add(hourMap.getKey());
                                        break;
                                    }
                                }
                            }
                        }
                    }

                    if (!times.isEmpty()) {
                        availableSlots.put(dayMap.getKey(), times);
                    }
                }
                }
            }

        return availableSlots;
    }

    public boolean reserveSlots(LocalDate date, LocalTime time, int num_slots) {
        Map<LocalTime, Integer> dailySlots = numSlotsMap.get(date);
        if (dailySlots == null) {
            return false; // No slots available for this day
        }
        Integer currentSlots = dailySlots.get(time);
        if (currentSlots == null) {
            return false; // Not enough slots available or time not initialized
        }

        if(currentSlots >= num_slots)
            dailySlots.put(time, currentSlots - num_slots); // Decrement the available slots
        else{//se gli slot per quell'ora non sono sufficienti potrei comunque prenotare ricoprendo buchi passati


            Map<LocalTime,Integer>dayMap=numSlotsMap.get(date);
            int count_holes=0;

            for (Map.Entry<LocalTime, Integer> possibleHolesMap : dayMap.entrySet()) {
                if (!possibleHolesMap.getKey().isAfter(time)) {
                    count_holes += possibleHolesMap.getValue();
                    if (count_holes > num_slots) {
                        break;
                    }
                }
            }
            if (count_holes >= num_slots) {
                dailySlots.put(time, currentSlots - num_slots);
                int slotLeft= num_slots- currentSlots;
                dailySlots.put(time, 0);

                for (Map.Entry<LocalTime, Integer> possibleHolesMap : dayMap.entrySet()) {
                    if (possibleHolesMap.getKey().isBefore(time)) {

                        if (slotLeft > 0) {
                            int currentHoles = possibleHolesMap.getValue();
                            int erasableHoles = Math.min(currentHoles, slotLeft);
                            dailySlots.put(possibleHolesMap.getKey(), currentHoles - erasableHoles);
                            slotLeft -= erasableHoles;

                        } else break;
                    }
                }
            }
            else return false;

        }
        return true;
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
        slotsPerHour.put(LocalTime.of(9, 0), 5);
        slotsPerHour.put(LocalTime.of(10, 0), 2);
        slotsPerHour.put(LocalTime.of(11, 0), 3);
        slotsPerHour.put(LocalTime.of(12, 0), 1);

        ts.initializeDay(LocalDate.now(), slotsPerHour);

        System.out.println(ts);

        // Test finding time slots available from a specific start time
        LocalDateTime startTime = LocalDateTime.now().withHour(9).withMinute(0).withSecond(0).withNano(0);
        Map<LocalDate, List<LocalTime>> availableSlots = ts.findTimeForSlots(startTime, 5);
        System.out.println("Available slots from " + startTime + ": " + availableSlots);

        // Test reserving slots
        boolean reservationSuccess = ts.reserveSlots(LocalDate.now(), LocalTime.of(10, 0), 5);
        System.out.println("Reservation at 10 AM successful: " + reservationSuccess);

        // Check availability after reservation
        availableSlots = ts.findTimeForSlots(startTime, 5);
        System.out.println("Available slots after reservation from " + startTime + ": " + availableSlots);

        System.out.println(ts);

    }
}
