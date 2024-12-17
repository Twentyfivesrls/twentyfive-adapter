package twentyfive.twentyfiveadapter.models.subscriptionModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import twentyfive.twentyfiveadapter.dto.subscriptionDto.Discount;
import twentyfive.twentyfiveadapter.dto.subscriptionDto.Frequency;
import twentyfive.twentyfiveadapter.dto.subscriptionDto.Price;

import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subscription {
    @Id
    private String id;
    private String name;
    private String keycloakRole; //ruolo da assegnare a Keycloak
    private List<String> appIds;
    private String description;
    private double price; //prezzo reale della sottoscrizione (magari scontato)
    private String imgUrl;
    private List<String> characteristics; //lista caratteristiche dell'abbonamento
    private Frequency frequency;
    private boolean upselling;
    private Discount discount;
    private List<String> crossSelling;
    private boolean active = true;
    private boolean softDeleted = false; //boolean associato al soft delete, di default a false

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
