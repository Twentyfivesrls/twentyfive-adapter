package twentyfive.twentyfiveadapter.dto.subscriptionDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleUnitAmount {

    private String currency_code;
    private String value;
}
