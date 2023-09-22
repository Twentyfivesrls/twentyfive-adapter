package twentyfive.twentyfiveadapter.adapter.Document.QrGenDocumentDB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "qr_code_object")
public class QrCodeObjectDocumentDB {
    @Id
    private String idQrCode;
    private String name;
    private String link;
    private String description;
    private String qrImage;
    private String username;
    private Boolean isActivated;


}
