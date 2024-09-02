package twentyfive.twentyfiveadapter.dto.subscriptionDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Frequency {
    DAILY(1, 0),
    WEEKLY(7, 0),
    MONTHLY(0, 1),
    QUARTERLY(0, 3),
    ANNUAL(0, 12);

    private final int days;
    private final int months;
}
