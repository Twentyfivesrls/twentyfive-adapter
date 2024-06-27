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
    private List<Customization> customization = new ArrayList<>(); // Una mappa degli ingredienti personalizzati, dove la chiave è l'ID dell'ingrediente
    private String attachment; // Un allegato, presumibilmente un URL a un'immagine o a un documento
    private LocalDate deliveryDate; // La data di consegna del prodotto

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductInPurchase that = (ProductInPurchase) o;
        return Double.compare(that.weight, weight) == 0 && this.getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), weight);
    }
}
