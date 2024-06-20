package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RedoOrderReq {
    private String id;
    private LocalDate pickupDate;
    private LocalTime pickupTime;
    private String note;
}
