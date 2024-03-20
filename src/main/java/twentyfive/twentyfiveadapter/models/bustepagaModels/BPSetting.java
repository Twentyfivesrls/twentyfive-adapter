package twentyfive.twentyfiveadapter.models.bustepagaModels;

import com.twentyfive.twentyfivemodel.models.bustepagaModels.BPConfiguration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BPSetting {

    private String id;
    private String userId;
    private String mailText;
    private List<BPConfiguration> fileName;
}
