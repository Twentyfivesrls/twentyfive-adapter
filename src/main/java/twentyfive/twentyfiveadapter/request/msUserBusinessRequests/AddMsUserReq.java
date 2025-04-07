package twentyfive.twentyfiveadapter.request.msUserBusinessRequests;

import lombok.Data;

@Data
public class AddMsUserReq {
    private String firstName;
    private String role;
    private String lastName;
    private String email;
}
