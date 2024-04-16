package twentyfive.twentyfiveadapter.dto.keycloakDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.keycloak.representations.account.UserRepresentation;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeycloakUser extends UserRepresentation {

    private String email;
    private String username;
}
