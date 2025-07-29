package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Category {
    @EqualsAndHashCode.Include
    private String id;
    private String type;
    private String name;
    private boolean enabled = true;
    private boolean softDeleted = false;
    private Integer orderPriority; //ordine di visualizzazione
    private String idSection;
}
