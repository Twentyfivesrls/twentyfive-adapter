package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.stat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralTrayStat {
    private int quantity;
    private double totalWeight;
    private double totalRevenue;
    private int totalProductWeighted;
}
