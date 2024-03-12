package twentyfive.twentyfiveadapter.adapter.Document.ThubDocumentDB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "thub_profile")
public class ThubProfile {

        @Id
        private String id;
        private String userId;
        private String title;
        private String description;
        private Boolean hasProPic;
        private String proPicUrl;
        private List<ThubLink> links;
        private String template; //nome del template in uso Default di base
        private ThubCustomTheme customTheme;

}
