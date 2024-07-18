package twentyfive.twentyfiveadapter.dto.groypalDaemon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaypalCredentials {
    private String clientId;
    private String clientSecret;
}
