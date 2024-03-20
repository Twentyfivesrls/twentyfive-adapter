package twentyfive.twentyfiveadapter.dto.bustepagaDtio;

import com.twentyfive.twentyfivemodel.models.bustepagaModels.BPConfiguration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBPSettingRequest {

    private String userId;
    private String mailText;
    private List<BPConfiguration> configurations;
}
