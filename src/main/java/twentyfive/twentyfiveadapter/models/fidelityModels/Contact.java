package twentyfive.twentyfiveadapter.models.fidelityModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    private String id;
    private String ownerId;

    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private LocalDateTime creationDate;

}
