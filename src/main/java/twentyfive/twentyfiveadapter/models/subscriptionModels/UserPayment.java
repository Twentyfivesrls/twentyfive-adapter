package twentyfive.twentyfiveadapter.models.subscriptionModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import twentyfive.twentyfiveadapter.dto.subscriptionDto.UserSubscription;

import java.time.LocalDateTime;
import java.util.Map;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPayment {
    @Id
    private String id;
    private LocalDateTime paymentDate; //Time when the payment is done
    private String userSubscriptionId; //per riflettere potenziali modifiche alla userSubsctiption sul payment associato
    private Map<String,Object> paymentData; // todo currently saved as Map because we don't know all the data about the payments
}
