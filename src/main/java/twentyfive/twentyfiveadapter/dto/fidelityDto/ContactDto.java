package twentyfive.twentyfiveadapter.dto.fidelityDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactDto {

    private String id;
    private String ownerId;

    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private Date creationDate;
    private int associatedCards;
    private int claimedPrizes;
    private int unclaimedPrizes;
}
