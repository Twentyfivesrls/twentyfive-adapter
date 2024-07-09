package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.Allergen;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.Measure;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BundleInPurchase extends ItemInPurchase {
    private Measure measure;
    private double totalWeight;
    private List<PieceInPurchase> weightedProducts = new ArrayList<>();
    private List<Allergen> allergens; // Utilizzo un enum per gli allergeni, che dovrai definire

    // Implementazione di equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equalsSameId(o)) return false; // Check superclass fields (assuming ItemInPurchase has fields to compare)
        BundleInPurchase that = (BundleInPurchase) o;
        return Double.compare(that.getMeasure().getWeight(), this.measure.getWeight()) == 0 &&
                this.getId().equals(that.getId()) &&
                listsAreEqual(weightedProducts, that.weightedProducts) &&
                listsAreEqual(allergens, that.allergens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCodeSameId(), measure,totalWeight,weightedProducts,allergens);
    }

    private boolean listsAreEqual(List<?> list1, List<?> list2) {
        if (list1 == null && list2 == null) {
            return true;
        }
        if (list1 == null || list2 == null || list1.size() != list2.size()) {
            return false;
        }
        return list1.equals(list2);
    }
}
