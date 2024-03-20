package twentyfive.twentyfiveadapter.models.bustepagaModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dipendente {

    private String id;
    private String userId; // id dell'utente che ha creato il dipendente
    private String firstname;
    private String lastname;
    private String email;
    private Boolean isEmailEnabled;
}
