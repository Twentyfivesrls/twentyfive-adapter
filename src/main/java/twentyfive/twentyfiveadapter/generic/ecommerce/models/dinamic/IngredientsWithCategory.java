package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredientsWithCategory {
    private String categoryName; //Nome della categoria
    private List<String> ingredientsName; //Array: della stessa categoria possono esistere più ingredienti.
}
