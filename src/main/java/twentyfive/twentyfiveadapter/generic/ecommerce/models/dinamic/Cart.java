package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    private List<ProductInPurchase> productsByWeight = new ArrayList<>(); // Assumiamo che "Pip (al KG)" si riferisca ai prodotti venduti al peso
    private List<BundleInPurchase> bundles = new ArrayList<>(); // Assumiamo che "PipBundle" si riferisca a un raggruppamento di prodotti venduti al pezzo, qui rappresentati come "BundleInPurchase"
}
