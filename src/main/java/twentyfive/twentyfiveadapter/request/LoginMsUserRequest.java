package twentyfive.twentyfiveadapter.request;

import lombok.Data;

@Data
public class LoginMsUserRequest {
    private String username;
    private String password;
    private String appName;
}
