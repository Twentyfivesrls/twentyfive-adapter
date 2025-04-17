package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.CustomizableIngredient;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Product {
    private String id;
    private String name;
    private List<String> ingredientIds;
    private List<CustomizableIngredient> possibleCustomizations;
    private String description;
    private String categoryId;
    private String imageUrl;
    private boolean active = true; //il prodotto rimane visibile ma disattivato
    private boolean softDeleted = false; //il prodotto è cancellato in modo "soft"
    private boolean toPrepare = true; //Il prodotto se è da preparare o meno
}
