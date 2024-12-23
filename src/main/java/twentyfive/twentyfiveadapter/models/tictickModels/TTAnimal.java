package twentyfive.twentyfiveadapter.models.tictickModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tictic_animal")
public class TTAnimal {

    @Id
    private String id;
    private String ownerId;

    private String name;
    private String species;
    private String race;
    private String gender;
    private String microchipCode;
    private String bloodGroup;
    private List<String> allergies;
    private List<String> pathologies;
    private boolean sterilization;
    private int age;
    private double weight;

    private String address;
    private List<String> phone;
    private List<String> email;
}
