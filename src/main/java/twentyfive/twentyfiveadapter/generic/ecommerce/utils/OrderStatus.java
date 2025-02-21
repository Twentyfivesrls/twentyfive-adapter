package twentyfive.twentyfiveadapter.generic.ecommerce.utils;

import com.paypal.orders.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
public enum OrderStatus {
    RICEVUTO("Ricevuto"),
    IN_PASTICCERIA("In pasticceria"),
    IN_PREPARAZIONE("In preparazione"),
    MODIFICATO_DA_PASTICCERIA("Modificato da pasticceria"),
    PRONTO("Pronto"),
    ANNULLATO("Annullato"),
    COMPLETO("Completo");

    private String status;

    public static OrderStatus[] getStatusEditable(){
        return new OrderStatus[] {COMPLETO,ANNULLATO};
    }

    public static OrderStatus fromValue(String value) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.getStatus().equalsIgnoreCase(value)) {
                return status;
            }
        }
        return null;
    }

    public static List<String> getValues() {
        return Arrays.stream(OrderStatus.values())
                .map(OrderStatus::getStatus)
                .toList();
    }
}
