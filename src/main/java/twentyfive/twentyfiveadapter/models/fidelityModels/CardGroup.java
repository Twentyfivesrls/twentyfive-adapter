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
@Document(collection = "fidelity_card_group")
public class CardGroup {

    @Id
    private String id;
    private String ownerId;

    private String name;
    private String description;
    private Date creationDate;
    private Date expirationDate;
    private int scanNumber; //number of scan that a card belonging to this group has to do
    private int numberOfDaysForPrize; //number of days a user can wait to claim the prize
    private Boolean isActive;
}
