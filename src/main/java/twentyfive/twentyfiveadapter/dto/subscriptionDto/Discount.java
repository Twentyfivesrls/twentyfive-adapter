package twentyfive.twentyfiveadapter.dto.subscriptionDto;

import twentyfive.twentyfiveadapter.generic.ecommerce.utils.DateRange;

import java.time.LocalDate;

public class Discount {
    private boolean permanent;
    private LocalDate until;
    private DateRange dateRange;
    private double rate;
}
