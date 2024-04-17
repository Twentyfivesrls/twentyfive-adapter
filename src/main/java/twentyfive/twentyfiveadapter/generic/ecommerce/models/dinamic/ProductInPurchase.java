package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductInPurchase{
    private String productId; // L'ID del prodotto
    private double weight; // Il peso del prodotto
    private int quantity; // La quantità acquistata del prodotto
    private String shape; // La forma del prodotto, potrebbe essere meglio come Enum se le forme sono predefinite
    private Map<String, String> customization; // Una mappa degli ingredienti personalizzati, dove la chiave è l'ID dell'ingrediente
    private boolean chocolateChips; // Un booleano per indicare se ci sono gocce di cioccolato o meno; sostituire con il nome corretto se necessario
    private String text; // Testo aggiuntivo, forse per istruzioni o note speciali
    private String attachment; // Un allegato, presumibilmente un URL a un'immagine o a un documento
    private LocalDate deliveryDate; // La data di consegna del prodotto
    private double totalPrice; // Il prezzo totale per questa voce nel carrello
}
