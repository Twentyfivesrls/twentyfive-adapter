package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderSlot {
    private LocalDate date; // La data dello slot dell'ordine
    private LocalTime timeSlot; // L'orario specifico dello slot
    private int orderNumber; // Un numero che potrebbe rappresentare l'ID dell'ordine o un contatore di ordini per quello slot
}
