package twentyfive.twentyfiveadapter.adapter.Document.TicketObjDocumentDB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "statistic-event")
public class StatisticDocumentDB {
    @Id
    private String id;
    private String idEvent;
    private Integer totalTicket;
    private Integer totalTicketActivated;
}
