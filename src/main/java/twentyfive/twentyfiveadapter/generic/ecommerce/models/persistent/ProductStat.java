package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductStat {
    private String id;
    private String type;
    private int buyingCount = 0;

    public ProductStat(String type){
        this.type=type;
    }
}
