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

    @Override
    public String toString(){
        String symbol="";
        switch(this.currency){
            case "EUR" -> {
                 symbol= String.valueOf(SymbolCurrency.€);
            }
            case "USD" -> {
                symbol= String.valueOf(SymbolCurrency.$);
            }
            default->{
                symbol=this.currency;
            }
        }
        return symbol + " " + this.price;
    }

}
