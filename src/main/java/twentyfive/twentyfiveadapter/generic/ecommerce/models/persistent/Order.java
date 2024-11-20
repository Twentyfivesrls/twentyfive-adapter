package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.AppliedCoupon;
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
public class Order {
    private String id;
    private String customerId;
    private boolean unread = true; // boolean to check if an order is read or not
    private List<ProductInPurchase> productsInPurchase;
    private List<BundleInPurchase> bundlesInPurchase;
    private LocalDateTime createdDate;
    private LocalDate pickupDate;
    private LocalTime pickupTime;
    private double totalPrice;
    private String note;
    private String paymentId;
    private AppliedCoupon appliedCoupon;
    private OrderStatus status; // Assuming OrderStatus is an Enum
    private CustomInfo customInfo; // admin can choose customInfo for order and not himself from idCustomer

}
