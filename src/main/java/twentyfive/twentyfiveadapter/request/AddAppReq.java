package twentyfive.twentyfiveadapter.request;

import lombok.Data;

@Data
public class AddAppReq {
    private String name;
    private String realm;
    private String siteUrl;
    private String appUrl;
}
