package twentyfive.twentyfiveadapter.models.qrGenModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "qr_statistics")
public class QrStatistics {

    @Id
    private String idQrStatistics;
    private Date scanDate;
    private String idQrCodeObject;
    private String browser;
    private String os;
    private String device;
    private String deviceType;
    private String lat;
    private String lon;
}
