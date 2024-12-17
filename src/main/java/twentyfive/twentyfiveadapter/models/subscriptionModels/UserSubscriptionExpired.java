package twentyfive.twentyfiveadapter.models.subscriptionModels;

import org.springframework.data.mongodb.core.mapping.Document;
import twentyfive.twentyfiveadapter.dto.subscriptionDto.UserSubscription;

@Document(collection = "user_subscriptions_expired")
public class UserSubscriptionExpired extends UserSubscription {
    public UserSubscriptionExpired(UserSubscriptionActive userSubscriptionActive){
        super(userSubscriptionActive.getId(), userSubscriptionActive.getPaymentId(), userSubscriptionActive.getUserId(),userSubscriptionActive.getStartDate(),
                userSubscriptionActive.getSubscriptionData(), userSubscriptionActive.getDeactivationRanges(), userSubscriptionActive.getReadAt(), userSubscriptionActive.getOrderData(),userSubscriptionActive.getOrderItemData(),userSubscriptionActive.getDuration(),
                userSubscriptionActive.isGifted());
    }
}
