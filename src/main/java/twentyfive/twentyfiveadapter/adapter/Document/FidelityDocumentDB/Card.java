package twentyfive.twentyfiveadapter.adapter.Document.FidelityDocumentDB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "fidelity_card")
public class Card {

    @Id
    private String id;
    private String cardGroupId;
    private String customerId;

    private String name;
    private String surname;
    private String email;
    private int phoneNumber;
    private int scanNumberExecuted;
    private Date creationDate; //when the card is created
    private Date lastScanDate; //when the card is scanned for the last time
    public Boolean isActive;
}
