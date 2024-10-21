package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductFixed extends Product{
    private double price; // Prezzo fisso
    private double weight; // Peso fisso
}
