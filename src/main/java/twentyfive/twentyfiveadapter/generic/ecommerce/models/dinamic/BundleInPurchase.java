package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BundleInPurchase {
    private String bundleId; // L'ID del bundle
    private int quantity; // La quantità di bundle
    private double totalPrice;
}
