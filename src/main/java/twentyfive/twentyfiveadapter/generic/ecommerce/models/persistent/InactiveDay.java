package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class InactiveDay {
    private String id;
    private LocalDate date;
    private boolean fullDay;
    private LocalTime startTime;
    private LocalTime endTime;
}
