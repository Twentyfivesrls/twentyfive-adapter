package twentyfive.twentyfiveadapter.request;

import lombok.Data;

@Data
public class AddRoleReq {
    private String name;
    private String keycloakRole;
    private Boolean assignable;
}
