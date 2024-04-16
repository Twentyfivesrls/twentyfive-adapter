package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.DateRange;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.WeightRange;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Setting {
    private DateRange businessHours; // Orari di apertura collegati alla lavorazione del prodotto
    private Map<WeightRange, Integer> preparationTimeRanges; // Mappa che collega range di peso ai tempi di preparazione
    private boolean enabled; // Gestisce il blocco degli ordini
}
