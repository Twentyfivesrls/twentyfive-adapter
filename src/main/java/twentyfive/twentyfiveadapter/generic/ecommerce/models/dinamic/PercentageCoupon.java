package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent.Coupon;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PercentageCoupon extends Coupon {
    private int percentage;
}
