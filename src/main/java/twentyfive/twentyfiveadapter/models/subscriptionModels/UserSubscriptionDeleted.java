package twentyfive.twentyfiveadapter.models.subscriptionModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import twentyfive.twentyfiveadapter.dto.subscriptionDto.UserSubscription;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user_subscriptions_deleted")
public class UserSubscriptionDeleted extends UserSubscription {
    public UserSubscriptionDeleted(UserSubscriptionActive userSubscriptionActive){
        super(userSubscriptionActive.getId(), userSubscriptionActive.getPaymentId(), userSubscriptionActive.getUserId(),userSubscriptionActive.getStartDate(),
                userSubscriptionActive.getSubscriptionData(), userSubscriptionActive.getDeactivationRanges(), userSubscriptionActive.getReadAt(), userSubscriptionActive.getOrderData(),userSubscriptionActive.getOrderItemData(),userSubscriptionActive.getDuration(),
                userSubscriptionActive.isGifted());
    }
    private Date suspendendTime;
}
