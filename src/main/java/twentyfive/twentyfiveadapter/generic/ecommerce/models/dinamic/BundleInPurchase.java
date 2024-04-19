package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.Measure;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BundleInPurchase {
    private String bundleId; // L'ID del bundle
    private int quantity; // La quantità di bundle
    private Measure measure;
    private double totalPrice;
    private List<ProductInPurchase> weightedProducts;
}
