package twentyfive.twentyfiveadapter.generic.ecommerce.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("allergens")
public class Allergen {
    @Id
    private String name;
    private String iconUrl; // L'URL dell'icona associata all'allergene
}
