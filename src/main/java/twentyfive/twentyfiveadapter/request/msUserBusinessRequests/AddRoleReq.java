package twentyfive.twentyfiveadapter.request.msUserBusinessRequests;

import lombok.Data;

@Data
public class AddRoleReq {
    private String name;
    private String keycloakRole;
    private Boolean assignable;
}
