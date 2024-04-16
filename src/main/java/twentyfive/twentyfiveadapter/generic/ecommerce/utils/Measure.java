package twentyfive.twentyfiveadapter.generic.ecommerce.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Measure {
    private String label; // etichetta per la misura, es. "Piccolo", "Medio", "Grande"
    private double weight; // peso associato a questa misura
}
