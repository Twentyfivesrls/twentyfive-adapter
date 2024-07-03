package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuSection {
    private String id;
    private String name;
    private boolean active = true;
}
