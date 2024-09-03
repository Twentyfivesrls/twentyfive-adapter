package twentyfive.twentyfiveadapter.models.subscriptionModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import twentyfive.twentyfiveadapter.dto.subscriptionDto.Discount;
import twentyfive.twentyfiveadapter.dto.subscriptionDto.Frequency;

import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subscription {
    @Id
    private String id;
    private String name;
    private List<String> appIds;
    private String description;
    private String price;
    private Frequency frequency;
    private boolean upselling;
    private Discount discount;
    private List<String> crossSelling;
    private boolean active = true;

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
