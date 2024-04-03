package twentyfive.twentyfiveadapter.dto.keycloakDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.keycloak.representations.idm.CredentialRepresentation;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasswordUpdateKeycloak extends CredentialRepresentation {
    private String type;
    private String value;
}
