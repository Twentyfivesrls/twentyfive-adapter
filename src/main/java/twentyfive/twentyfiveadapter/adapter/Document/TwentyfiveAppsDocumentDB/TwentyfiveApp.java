package twentyfive.twentyfiveadapter.adapter.Document.TwentyfiveAppsDocumentDB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "twentyfive_apps")
public class TwentyfiveApp {
    @Id
    private String id;
    private String title;
    private String description;
    private String imageUrl;
    private Byte[] imageContent;
    private Boolean isPremium;
    private Boolean isIncoming;
    private String homeLink;
    private Boolean isFreemium;
}
