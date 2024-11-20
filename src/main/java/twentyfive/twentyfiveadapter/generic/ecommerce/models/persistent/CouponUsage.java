package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;

@Data
@NoArgsConstructor
@AllArgsConstructor
@CompoundIndexes({
        @CompoundIndex(name = "unique_coupon_customer", def = "{'idCoupon': 1, 'idCustomer': 1}", unique = true)
})
public class CouponUsage {

    private String idCoupon;
    private String idCustomer;
    private int usageCount;
}
