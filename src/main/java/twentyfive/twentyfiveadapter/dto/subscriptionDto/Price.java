package twentyfive.twentyfiveadapter.dto.subscriptionDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Price {

    private double price;
    private String currency;

    public Price(double price){
        this.price = price;
        this.currency = "EUR";
    }
}
