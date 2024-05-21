package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.Measure;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BundleInPurchase extends ItemInPurchase {
    private Measure measure;
    private List<PieceInPurchase> weightedProducts;
}
