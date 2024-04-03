package twentyfive.twentyfiveadapter.models.tictickModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tictic_animal_owner")
public class TTAnimalOwner {

    @Id
    private String id;

    private String name;
    private String surname;
    private String phone;
    private String email;
    private String address;
}
