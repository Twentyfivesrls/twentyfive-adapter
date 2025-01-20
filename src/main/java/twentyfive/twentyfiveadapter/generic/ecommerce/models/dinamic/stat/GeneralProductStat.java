package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.stat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralProductStat {
    private long totalProductsSold; // Numero totale di prodotti venduti
    private long totalOrders; // Numero totale di ordini effettuati
    private long totalCustomersServed; // Numero totale di clienti serviti
    private double totalRevenue; // Totale guadagnato
}
