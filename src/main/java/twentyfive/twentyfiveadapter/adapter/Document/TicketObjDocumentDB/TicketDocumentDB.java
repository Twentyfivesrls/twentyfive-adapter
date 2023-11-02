package twentyfive.twentyfiveadapter.adapter.Document.TicketObjDocumentDB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "ticket")
public class TicketDocumentDB {
    @Id
    private String id;
    private String eventName;
    private String code;
    private LocalDateTime eventDateStart;
    private LocalDateTime eventDateEnd;
    private Boolean active;
    private Boolean used;
    @Field("addressBookId")
    private String addressBookId;
    private String userId;
    private String url;
}
