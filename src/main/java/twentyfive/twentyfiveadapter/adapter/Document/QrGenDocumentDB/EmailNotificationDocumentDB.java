package twentyfive.twentyfiveadapter.adapter.Document.QrGenDocumentDB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "email_notification")
public class EmailNotificationDocumentDB {
    @Id
    private String id;
    private String subject;
    private String emailAddress;
    private String message;

}
