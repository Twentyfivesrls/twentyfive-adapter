package twentyfive.twentyfiveadapter.models.tictickModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tictic_customer")
public class TicTicCustomer {

    @Id
    private String id;
    private String ownerId;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private LocalDateTime registrationDate;

}
