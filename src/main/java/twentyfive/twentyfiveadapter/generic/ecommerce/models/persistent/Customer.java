package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.Cart;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String id; // ID del cliente
    @Indexed(unique = true)
    private String idKeycloak; //ID di Keycloak
    private String firstName; // Nome del cliente
    private String lastName; // Cognome del cliente
    @Indexed(unique = true)
    private String email; // Email del cliente
    private String phoneNumber; // Numero di telefono del cliente
    private boolean enabled=true; // Se il cliente è abilitato o meno (admin può bloccare cliente)
    private String note; // Note aggiuntive che l'admin può inserire sul cliente
    private Cart cart; // Carrello di acquisto associato al cliente (definizione di Cart necessaria)

}
