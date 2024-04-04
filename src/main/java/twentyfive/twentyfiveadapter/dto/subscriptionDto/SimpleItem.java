package twentyfive.twentyfiveadapter.dto.subscriptionDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleItem {

    private String name;
    private String description;
    private String quantity;
    private String category;
    private SimpleUnitAmount unit_amount;

    private Object orderData;
}
