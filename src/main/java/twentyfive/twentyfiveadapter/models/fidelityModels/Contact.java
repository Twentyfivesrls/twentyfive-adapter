package twentyfive.twentyfiveadapter.models.fidelityModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "fidelity_contact")
public class Contact {

    @Id
    private String id;
    private String ownerId;

    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private Date creationDate;

}
