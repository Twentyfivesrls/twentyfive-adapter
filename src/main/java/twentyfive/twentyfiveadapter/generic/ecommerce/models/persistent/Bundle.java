package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.Measure;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bundle {
    private String id;
    @Indexed(unique = true)
    private String name;
    private String categoryId;
    private boolean customized; // "standard" or "personalizzato"
    private List<Measure> measures; // Assume Measure è un'altra classe definita altrove e non salvata nel DB
    private String description;
    private boolean active = true;
    private String imageUrl; // URL dell'immagine del bundle
    private double pricePerKg; // prezzo al kg
}
