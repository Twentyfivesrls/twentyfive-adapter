package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {
    private String id;
    private String name;
    private String categoryId;
    private String description;
    private double price;
    private List<String> allergenNames;
    private String imageUrl;
    private boolean active = true; //il prodotto rimane visibile ma disattivato
}
