package twentyfive.twentyfiveadapter.adapter.Document.BustePagaDocumentDB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "dipendente_buste_paga")
public class Dipendente {

    @Id
    private String id;
    private String userId; // id dell'utente che ha creato il dipendente
    private String firstname;
    private String lastname;
    private String email;

}
