package twentyfive.twentyfiveadapter.dto.keycloakDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.keycloak.representations.idm.RoleRepresentation;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeycloakRole {

    private String id;
    private String role;
    private String client;
    private String clientId;
    private String description;

    public RoleRepresentation toRoleRepresentation() {
        RoleRepresentation roleRepresentation = new RoleRepresentation();
        roleRepresentation.setId(this.id);
        roleRepresentation.setName(this.role);
        roleRepresentation.setDescription(this.description);
        return roleRepresentation;
    }
}