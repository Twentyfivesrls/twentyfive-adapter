package twentyfive.twentyfiveadapter.dto.subscriptionDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Frequency {
    DAILY(1, 0, "Giornaliera"),
    WEEKLY(7, 0, "Settimanale"),
    MONTHLY(0, 1, "Mensile"),
    QUARTERLY(0, 3, "Trimestrale"),
    ANNUAL(0, 12, "Annuale");

    private final int days;
    private final int months;
    private final String translate;

    public static Frequency getFrequency(String translate) {
        for (Frequency frequency : Frequency.values()) {
            if (frequency.getTranslate().equals(translate)) {
                return frequency;
            }
        }
        return null;
    }


}
