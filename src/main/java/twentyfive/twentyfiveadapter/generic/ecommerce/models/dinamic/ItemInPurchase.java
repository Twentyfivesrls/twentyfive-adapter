package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemInPurchase {
    private String id;
    private int quantity;
    private double totalPrice;
    private String notes;
    private String location; //Dove viene messo il prodotto?
}
