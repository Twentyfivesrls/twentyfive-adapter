package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.BundleInPurchase;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.ProductInPurchase;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.OrderStatus;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String id;
    private String customerId;
    private List<ProductInPurchase> productsInPurchase;
    private List<BundleInPurchase> bundlesInPurchase;
    private LocalDate pickupDate;
    private LocalTime pickupTime;
    private double totalPrice;
    private String decorationText;
    private String note;
    private OrderStatus status; // Assuming OrderStatus is an Enum
}
