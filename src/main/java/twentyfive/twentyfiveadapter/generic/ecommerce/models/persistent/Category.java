package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private String id;
    private String type;
    private String name;
    private boolean enabled;

}
