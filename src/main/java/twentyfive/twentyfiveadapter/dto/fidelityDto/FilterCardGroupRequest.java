package twentyfive.twentyfiveadapter.dto.fidelityDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilterCardGroupRequest {

    private Boolean isActive;
    private LocalDateTime fromDate;
    private LocalDateTime toDate;

}
