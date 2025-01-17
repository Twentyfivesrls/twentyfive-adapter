package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.stat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeneralProductStat {
    private int totalProductsSold; // Numero totale di prodotti venduti
    private int totalOrders; // Numero totale di ordini effettuati
    private int totalCustomersServed; // Numero totale di clienti serviti
    private double totalRevenue; // Totale guadagnato
}
