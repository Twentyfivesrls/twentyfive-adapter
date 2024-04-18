package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Product {
    private String id;
    @Indexed(unique = true)
    private String name;
    private List<String> ingredientIds;
    private String description;
    private String categoryId;
    private String imageUrl;
    private boolean active;
}
