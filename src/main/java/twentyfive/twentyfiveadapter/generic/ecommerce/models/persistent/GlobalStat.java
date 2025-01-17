package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.stat.GlobalIngredientStat;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.stat.GlobalProductStat;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.stat.GlobalTrayStat;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalStat {
    private GlobalProductStat products;
    private GlobalTrayStat trays;
    private GlobalIngredientStat ingredients;

}
