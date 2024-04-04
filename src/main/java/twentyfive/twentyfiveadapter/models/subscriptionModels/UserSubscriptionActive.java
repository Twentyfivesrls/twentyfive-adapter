package twentyfive.twentyfiveadapter.models.subscriptionModels;

import org.springframework.data.mongodb.core.mapping.Document;
import twentyfive.twentyfiveadapter.dto.subscriptionDto.UserSubscription;

@Document(collection = "user_subscriptions")
public class UserSubscriptionActive extends UserSubscription {
}
