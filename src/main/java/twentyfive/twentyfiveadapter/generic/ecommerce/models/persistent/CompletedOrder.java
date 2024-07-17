package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.BundleInPurchase;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.CustomInfo;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.ProductInPurchase;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompletedOrder {
    private String id;
    private String customerId;
    private List<ProductInPurchase> productsInPurchase;
    private List<BundleInPurchase> bundlesInPurchase;
    private LocalDate pickupDate;
    private LocalTime pickupTime;
    private LocalDateTime createdDate;
    private double totalPrice;
    private String note;
    private String paymentId;
    private OrderStatus status; // Assuming OrderStatus is an Enum
    private CustomInfo customInfo; // admin can choose customInfo for order and not himself from idCustomer

}
