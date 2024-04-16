package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductKg {
    private String id;
    private String name;
    private String description;
    private double pricePerKg; // Prezzo per kilogrammo
    private boolean active; // Indica se il prodotto è attivo/disponibile
    private String categoryId; // ID della categoria del prodotto
    private List<String> ingredientIds; // Lista degli ID degli ingredienti
    private String imageUrl; // URL dell'immagine del prodotto
}
