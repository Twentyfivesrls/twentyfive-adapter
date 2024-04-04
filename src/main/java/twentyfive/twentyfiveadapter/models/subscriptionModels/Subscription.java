package twentyfive.twentyfiveadapter.models.subscriptionModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subscription {
    @Id
    private String id;
    @Indexed(unique = true)
    private String customId;
    private List<String> appIds;
    private String roleName; // Keycloak rolename to add
    private Long duration; // day duration of the subscription
    private boolean active;
}
