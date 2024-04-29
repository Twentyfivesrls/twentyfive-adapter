package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.util.Pair;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.DateRange;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.WeightRange;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Setting {
    private String id;
    private DateRange businessHours; // Orari di apertura collegati alla lavorazione del prodotto
    private DateRange labHours; // Orari del laboratorio
    private int maxMorningOrder; //Ordini massimi di mattina
    private int maxAfternoonOrder; // Ordini massimi di pomeriggio
    private int minOrderDelay; //Minimo tempo di preparazione
    private int minCancelOrder; //Tempo minimo cancellazione di un ordine
    private boolean enabled; // Gestisce il blocco degli ordini
}