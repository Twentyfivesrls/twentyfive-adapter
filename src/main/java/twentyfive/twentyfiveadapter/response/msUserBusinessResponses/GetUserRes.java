package twentyfive.twentyfiveadapter.response.msUserBusinessResponses;

import lombok.Data;

@Data
public class GetUserRes {

    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private boolean enabled;

    public String getFullName() {
        return lastName + " " + firstName;
    }
}
