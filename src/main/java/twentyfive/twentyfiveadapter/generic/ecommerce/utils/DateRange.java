package twentyfive.twentyfiveadapter.generic.ecommerce.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
class DateRange {
    private LocalTime startTime;
    private LocalTime endTime;
}
