package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
    private List<String> allergenNames; // Utilizzo un enum per gli allergeni, che dovrai definire

    // Implementazione di equals e hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BundleInPurchase that = (BundleInPurchase) o;
        return Double.compare(that.getMeasure().getWeight(), this.measure.getWeight()) == 0 && this.getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.measure.getWeight());
    }
}
