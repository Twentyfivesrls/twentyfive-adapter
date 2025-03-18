package twentyfive.twentyfiveadapter.response;

import lombok.Data;

@Data
public class GetInfoMsUserRes {

    private String email;
    private String firstName;
    private String lastName;
    private String role;
}
