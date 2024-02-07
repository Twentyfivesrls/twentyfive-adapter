package twentyfive.twentyfiveadapter.adapter.Document.FidelityDocumentDB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "fidelity_premio")
public class Premio {

    @Id
    private String id;

    private String name;
    private String cardId;
    private int quantity;
}
