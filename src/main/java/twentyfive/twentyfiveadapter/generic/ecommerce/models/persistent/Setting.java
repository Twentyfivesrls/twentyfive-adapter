package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.dto.groypalDaemon.PaypalCredentials;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.DateRange;

import java.util.List;


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
    private boolean ordersEnabled; // Gestisce il blocco degli ordini
    private boolean orderReceivedAlert; // Gestisce l'alert dell'ordine
    private List<String> locations; //Lista di luoghi dove poter allocare i prodotti
    private List<String> roles; //Lista possibili ruoli dei dipendenti
    private PaypalCredentials paypalCredentials;
    private boolean dev = false;
}