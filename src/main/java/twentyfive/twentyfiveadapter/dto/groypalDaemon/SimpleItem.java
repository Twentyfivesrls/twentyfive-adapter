package twentyfive.twentyfiveadapter.dto.groypalDaemon;

import com.paypal.orders.Item;
import com.paypal.orders.Money;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.dto.subscriptionDto.SimpleUnitAmount;

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

    public Item toItem(){
        Item item = new Item()
                .name(name).description(description).quantity(quantity).category(category)
                .unitAmount(new Money()
                        .currencyCode(unit_amount.getCurrency_code())
                        .value(unit_amount.getValue()));
        return item;
    }
}
