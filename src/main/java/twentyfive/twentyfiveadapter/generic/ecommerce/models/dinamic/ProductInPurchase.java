package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductInPurchase extends ItemInPurchase{
    private double weight; // Il peso del prodotto
    private String shape; // La forma del prodotto, potrebbe essere meglio come Enum se le forme sono predefinite
    private List<Customization> customization; // Una mappa degli ingredienti personalizzati, dove la chiave è l'ID dell'ingrediente
    private List<String> allergenNames; // Utilizzo un enum per gli allergeni, che dovrai definire
    private String attachment; // Un allegato, presumibilmente un URL a un'immagine o a un documento
    private LocalDate deliveryDate; // La data di consegna del prodotto

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false; // Check superclass fields (assuming ItemInPurchase has fields to compare)

        ProductInPurchase that = (ProductInPurchase) o;
        return Double.compare(that.weight, weight) == 0 &&
                Objects.equals(shape, that.shape) &&
                listsAreEqual(customization, that.customization) && // Compare customization lists
                Objects.equals(attachment, that.attachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight, shape, customization, attachment);
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
