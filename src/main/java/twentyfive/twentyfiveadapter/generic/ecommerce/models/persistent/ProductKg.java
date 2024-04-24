package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductKg extends Product{
    private boolean customized; // "standard" or "personalizzato"
    private double pricePerKg; // Prezzo per kilogrammo
}
