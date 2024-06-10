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
@Document(collection = "fidelity_premio")
public class Premio {

    @Id
    private String id;
    private String cardId;

    private Date claimDate;
    private Date cardComplete;
    private boolean claimed;
}
