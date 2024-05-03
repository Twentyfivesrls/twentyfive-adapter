package twentyfive.twentyfiveadapter.dto.stompDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TwentyfiveMessage {
    private String channel;
    private Object content;
}
