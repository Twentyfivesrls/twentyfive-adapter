package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemInPurchase {
    private String id;
    private int quantity;
    private double totalPrice;
    private boolean toPrepare = false; //Variabile di appoggio per il pasticcere
    private String location; //Dove viene messo il prodotto?
    private String counterNote; //Nota da bancone, se disponibile

    public boolean equalsSameId(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ItemInPurchase that = (ItemInPurchase) o;

        return Objects.equals(id, that.id);
    }

    public int hashCodeSameId() {
        return Objects.hash(id);
    }
}
