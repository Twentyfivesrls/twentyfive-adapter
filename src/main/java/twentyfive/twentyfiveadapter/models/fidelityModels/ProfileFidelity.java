package twentyfive.twentyfiveadapter.models.fidelityModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "fidelity_profile")
public class ProfileFidelity {

    @Id
    private String id;
    private String ownerId;

    private String imageName;
}
