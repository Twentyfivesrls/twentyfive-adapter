package twentyfive.twentyfiveadapter.adapter.Document.TicketObjDocumentDB;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "ticket-event")
public class EventDocumentDB {
    @Id
    private String id;
    private String name;
    private String description;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private String location;
    private Boolean enabled; //meglio scrivere enabled???
    private String userId;
}
