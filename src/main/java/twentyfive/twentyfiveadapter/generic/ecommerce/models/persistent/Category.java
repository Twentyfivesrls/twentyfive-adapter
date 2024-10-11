package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private String id;
    private String type;
    private String name;
    private boolean enabled = true;
    private boolean softDeleted = false;
    private Integer orderPriority; //ordine di visualizzazione
    private String idSection;
}
