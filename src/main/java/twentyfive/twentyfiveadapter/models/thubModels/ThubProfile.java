package twentyfive.twentyfiveadapter.models.thubModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "thub_profile")
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
