package twentyfive.twentyfiveadapter.adapter.Document.ShortenLinkDocumentDB;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "shorten_link")
public class ShortenLinkDocumentDB {

    @Id
    private String id;
    private String destinationUrl;
    private String shortUrl;
    private Date createdAt;
    private String userId;
}
