package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.Measure;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bundle {
    private String id;
    private String name;
    private String type; // "standard" or "personalizzato"
    private List<Measure> measures; // Assume Measure è un'altra classe definita altrove e non salvata nel DB
    private String description;
    private String imageUrl; // URL dell'immagine del bundle
}