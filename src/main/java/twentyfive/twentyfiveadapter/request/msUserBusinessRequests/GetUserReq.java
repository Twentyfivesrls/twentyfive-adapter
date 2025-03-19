package twentyfive.twentyfiveadapter.request.msUserBusinessRequests;

import lombok.Data;

@Data
public class GetUserReq {

    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String status;
}
