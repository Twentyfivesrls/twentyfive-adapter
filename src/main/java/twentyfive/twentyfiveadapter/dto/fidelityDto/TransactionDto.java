package twentyfive.twentyfiveadapter.dto.fidelityDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {
    private String idCard;
    private String note;
    private Integer amount;
}
