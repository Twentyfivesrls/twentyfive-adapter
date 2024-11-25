package twentyfive.twentyfiveadapter.generic.ecommerce.models.persistent;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.FixedAmountCoupon;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.LocalDateRange;
import twentyfive.twentyfiveadapter.generic.ecommerce.utils.NumberRange;
import twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.PercentageCoupon;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = PercentageCoupon.class, name = "percentage"),
        @JsonSubTypes.Type(value = FixedAmountCoupon.class, name = "fixed")
})
public class Coupon {
    private String id; //id del Coupon;
    private String name; //Nome del coupon
    private String code; //Codice da utilizzare per lo sconto
    private LocalDateRange dates; //Data inizio e fine sconto
    private NumberRange priceRange; //Prezzo minimo e massimo per lo sconto
    private int usageCount; //Quanti coupon sono stati usati
    private Integer maxTotalUsage; //Numero massimo coupon consentiti, se null infiniti
    private Integer maxUsagePerCustomer; //Numero massimo per Customer consentiti, se null infiniti
    private List<String> specificCategoriesId; //CategoriesID che beneficiano dello sconto, se null = tutto l'ordine
    private boolean active = true; // Se il coupon è usabile o meno
    private boolean expired = false; //Coupon scaduto
    private boolean softDeleted; //Se il coupon è stato cancellato


    public boolean checkExpiredCoupon(Coupon coupon){
        if (coupon.getDates() != null){
            if(coupon.getDates().getEndDate() != null){
                LocalDate today = LocalDate.now();
                if (coupon.getDates().getEndDate().isBefore(today)) {
                    return true;
                }
            }
        }
        return false;
    }

}
