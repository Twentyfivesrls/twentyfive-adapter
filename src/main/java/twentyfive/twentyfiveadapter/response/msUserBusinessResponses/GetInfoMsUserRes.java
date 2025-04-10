package twentyfive.twentyfiveadapter.response.msUserBusinessResponses;

import lombok.Data;

@Data
public class GetInfoMsUserRes {

    private String email;
    private String firstName;
    private String lastName;
    private String role;
    private String activeBusiness;
}
