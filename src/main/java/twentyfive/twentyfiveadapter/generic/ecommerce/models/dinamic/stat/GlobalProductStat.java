package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.stat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalProductStat {

    private GeneralProductStat generalStat;

    private CustomCakeStat customCakeStat; //TODO da pensare meglio
    private List<DashboardProductStat> dashboardProductStats;

    private List<CategoryProductStat> categoryStats;


}
