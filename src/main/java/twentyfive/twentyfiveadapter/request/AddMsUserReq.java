package twentyfive.twentyfiveadapter.request;

import lombok.Data;

@Data
public class AddMsUserReq {
    private String firstName;
    private String roleName;
    private String lastName;
    private String email;
}
