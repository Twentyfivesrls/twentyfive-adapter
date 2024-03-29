package twentyfive.twentyfiveadapter.models.bustepagaModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "buste_paga_setting")
public class BPSetting {

    private String id;
    private String userId;
    private String mailText;
    private List<BPConfiguration> fileName;
}
