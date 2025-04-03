package twentyfive.twentyfiveadapter.generic.ecommerce.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CouponType {
    PERCENTAGE("Percentuale"),
    FIXED("Fisso");

    private String value;
}
