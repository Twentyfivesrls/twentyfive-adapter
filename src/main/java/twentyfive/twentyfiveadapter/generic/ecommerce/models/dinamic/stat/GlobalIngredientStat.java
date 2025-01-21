package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.stat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GlobalIngredientStat {
    private GeneralIngredientStat generalStat;
    private List<GlobalCategoryStat> categoryStat;
    private List<CategoryIngredientStat> categoryStats;


}
