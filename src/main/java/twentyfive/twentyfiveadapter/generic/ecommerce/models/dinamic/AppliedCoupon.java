package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppliedCoupon {
    private String code;
    private String value;
    private String discountValue;
    private String description;
    private boolean totalOrderDiscount;
}
