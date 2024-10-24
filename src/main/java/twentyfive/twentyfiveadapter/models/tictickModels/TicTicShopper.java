package twentyfive.twentyfiveadapter.models.tictickModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tictic_shopper")
public class TicTicShopper {

    @Id
    private String id;
    private String ownerId;
    private Integer orderedPlates;
    private Integer soldPlates;
    private Integer remainingPlates;
    private Integer customerCount;

}
