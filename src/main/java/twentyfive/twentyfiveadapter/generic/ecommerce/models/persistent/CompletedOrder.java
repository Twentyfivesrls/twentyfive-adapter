package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.ProductInPurchase;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.OrderStatus;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompletedOrder {
    private String id;
    private String customerId;
    private List<ProductInPurchase> productsInPurchase;
    private LocalDate pickupDate;
    private double totalPrice;
    private String note;
    private OrderStatus status; // Assuming OrderStatus is an Enum
}
