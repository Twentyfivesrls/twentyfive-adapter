package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.stat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.StatLabel;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomCakeStat {
    private List<StatLabel> customCakeStats;
}
