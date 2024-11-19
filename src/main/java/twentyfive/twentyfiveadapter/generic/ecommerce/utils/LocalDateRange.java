package twentyfive.twentyfiveadapter.generic.ecommerce.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocalDateRange {
    private LocalDate startDate;
    private LocalDate endDate;
}
