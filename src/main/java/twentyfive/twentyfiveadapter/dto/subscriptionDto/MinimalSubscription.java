package twentyfive.twentyfiveadapter.dto.subscriptionDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MinimalSubscription {

    private String name;
    private List<String> appIds;
    private double price;
    private Frequency frequency;
    private Discount discount;

}
