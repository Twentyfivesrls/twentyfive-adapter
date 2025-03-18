package twentyfive.twentyfiveadapter.response;

import lombok.Data;

import java.util.List;

@Data
public class GetRoleRes {
    private List<String> roleNames;
}
