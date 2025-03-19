package twentyfive.twentyfiveadapter.request.msUserBusinessRequests;

import lombok.Data;

@Data
public class AddExistingUserReq {
    private String email;
    private String role;
}
