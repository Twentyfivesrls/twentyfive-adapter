package twentyfive.twentyfiveadapter.dto.subscriptionDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.LocalDateRange;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Discount {
    private boolean permanent;
    private LocalDate until;
    private LocalDateRange dateRange;
    private double rate;
}
