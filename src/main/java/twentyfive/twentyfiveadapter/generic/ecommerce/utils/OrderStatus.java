package twentyfive.twentyfiveadapter.generic.ecommerce.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderStatus {
    RICEVUTO("Ricevuto"),
    IN_PREPARAZIONE("In preparazione"),
    MODIFICATO_DA_PASTICCERIA("Modificato da pasticceria"),
    PRONTO("Pronto"),
    ANNULLATO("Annullato"),
    COMPLETO("Completo");

    private String status;
}
