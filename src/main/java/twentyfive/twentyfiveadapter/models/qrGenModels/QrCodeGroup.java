package twentyfive.twentyfiveadapter.models.qrGenModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tictic_qrcode_group")
public class QrCodeGroup {
    @Id
    private String idQrCode;
    private String animalId;
    private String nameQrCode;
    private String groupName;
    private String link;
    private String type;
    private String username;
    private Boolean isActivated;
    private String ownerId;
    private String customerId;
    private LocalDateTime associationDate;
}
