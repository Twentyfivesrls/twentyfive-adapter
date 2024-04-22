package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemInPurchase {
    private String itemId;
    private int quantity;
    private double totalPrice;
    private String notes;
}
