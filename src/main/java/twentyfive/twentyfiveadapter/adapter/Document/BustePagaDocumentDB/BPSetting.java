package twentyfive.twentyfiveadapter.adapter.Document.BustePagaDocumentDB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "setting_buste_paga")
public class BPSetting {

    @Id
    private String id;
    private String userId;
    private String mailText;
    private String fileName;
}