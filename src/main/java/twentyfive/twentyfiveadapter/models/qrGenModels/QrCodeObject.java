package twentyfive.twentyfiveadapter.models.qrGenModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "qr_code_object")
public class QrCodeObject {

    @Id
    private String idQrCode;
    private String name;
    private String link;
    private String description;
    private String qrImage;
    private String username;
    private Boolean isActivated;
    private String type;
    private String simpleText;
    private String phoneNumber;
    private String whatsappNumber;
    private String whatsappMessage;
    private String emailTo;
    private String emailSubject;
    private String emailBody;
    private String smsNumber;
    private String smsMessage;
    private String wifiSSID;
    private String wifiPassword;
    private String wifiEncryption;
    private boolean wifiHidden;
}
