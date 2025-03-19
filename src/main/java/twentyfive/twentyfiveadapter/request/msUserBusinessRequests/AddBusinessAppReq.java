package twentyfive.twentyfiveadapter.request.msUserBusinessRequests;

import lombok.Data;

import java.util.List;

@Data
public class AddBusinessAppReq {

    private String app;
    private List<AddRoleReq> roles;
}
