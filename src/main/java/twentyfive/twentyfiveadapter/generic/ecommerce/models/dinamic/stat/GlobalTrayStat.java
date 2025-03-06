package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.stat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalTrayStat {
    private GeneralTrayStat generalTrayStat;
    private List<TrayStat> trayStats;
    private TrayMeasureStat trayMeasureStat;

    private List<ProductWeightedStat> productWeightedStats;
}
