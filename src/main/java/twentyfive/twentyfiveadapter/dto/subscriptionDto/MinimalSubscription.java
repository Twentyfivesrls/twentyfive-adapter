package twentyfive.twentyfiveadapter.dto.subscriptionDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MinimalSubscription {

    private String id;
    private String name;
    private List<String> appIds;
    private double price;
    private Frequency frequency;
    private Discount discount;

    public String getType(){
        if(this.appIds.size()>1){
            return "Pack";
        } else if (this.appIds.size()==1){
            return "Single";
        } else {
            return "No app linked";
        }
    }
}
