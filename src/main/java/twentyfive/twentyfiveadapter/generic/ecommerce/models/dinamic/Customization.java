package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customization {
    private String name; //Nome della customizzazione
    private String[] value; //Array: Numeri, Granelle, Farciture possono essere più di uno.
}
