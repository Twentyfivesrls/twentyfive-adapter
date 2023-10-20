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
@Document(collection = "address-book")
public class AddressBookDocumentDB {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String userId;
}
