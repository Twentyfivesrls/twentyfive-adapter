package twentyfive.twentyfiveadapter.request.msUserBusinessRequests;

import lombok.Data;

@Data
public class AddRealmReq {
    private String name;
    private String clientId;
    private String clientSecret;
    private String grantType;
    private String username;
    private String password;
}
