package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.Allergen;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {
    private String id;
    private String name;
    private List<String> allergenNames; // Utilizzo un enum per gli allergeni, che dovrai definire
    private String description;
    private String categoryId;
    private boolean alcoholic; // True se l'ingrediente contiene alcol e viene usato solo per bagnare
    private boolean active; // True se l'ingrediente è attivo/disponibile
}
