package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.stat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.LabelAndValue;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OurCakeStat {
    private List<LabelAndValue> ourCakeStats;
}
