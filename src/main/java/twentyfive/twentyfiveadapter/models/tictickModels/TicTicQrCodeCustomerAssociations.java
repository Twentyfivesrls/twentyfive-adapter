package twentyfive.twentyfiveadapter.models.tictickModels;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tictic_qr_code_customer_associations")
public class TicTicQrCodeCustomerAssociations {
    private String ownerId;
    private String qrCodeId;
    private String customerId;
    private String customerEmail;
    private String status;
    private LocalDateTime associationDate;
    private String animalName;

}
