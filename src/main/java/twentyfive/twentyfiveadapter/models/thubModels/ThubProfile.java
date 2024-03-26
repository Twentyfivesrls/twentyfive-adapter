package twentyfive.twentyfiveadapter.models.thubModels;

import com.twentyfive.twentyfivemodel.models.thubModels.ThubCustomTheme;
import com.twentyfive.twentyfivemodel.models.thubModels.ThubLink;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThubProfile {

    private String id;
    private String username;
    private String title;
    private String description;
    private Boolean hasProPic;
    private String proPicUrl;
    private List<ThubLink> links;
    private String template;
    private ThubCustomTheme customTheme;

}
