package twentyfive.twentyfiveadapter.dto.subscriptionDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import twentyfive.twentyfiveadapter.dto.kafkaDto.OrderItemData;
import twentyfive.twentyfiveadapter.models.subscriptionModels.Subscription;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSubscription {
    @Id
    private String id;
    private String paymentId;
    private String userId; // ID che collega tutte le classi figlio a UserSubscription (Keycloak)
    private LocalDate startDate; // todo come mandarcelo?
    private Subscription subscriptionData;
    private List<DateRange> deactivationRanges;
    private LocalDate readAt;
    @Transient
    private String orderData;
    private OrderItemData orderItemData;
    private Price price; //prezzo reale della sottoscrizione (magari scontato)
    private int duration;
    private boolean gifted; //Se glielo abbiamo attivato gratis

    public LocalDate getExpireDate(){
        return this.startDate.plusDays(this.subscriptionData.getFrequency().getDays()).plusMonths(this.subscriptionData.getFrequency().getMonths());
    }
    /*public boolean isExpired(){
        // all this shit is done to ensure that the subscription expires at least at the end of the day.
        // Basically, user has max 1 day more than the duration as present
        //TODO da testare
        Calendar c = Calendar.getInstance();
        c.setTime(this.startDate);
        Integer integerValue = Math.toIntExact(this.duration);
        c.add(Calendar.DATE, integerValue);
        // ignoring ranges that are included in other ranges to skip days that doesn't need to be included
        Integer differencesBetweenRanges = DateRangeUtils.getTotalSuspendedDays(this.deactivationRanges);
        c.add(Calendar.DATE, differencesBetweenRanges);
        Date expiringDate = c.getTime(); //data di scadenza
        Date today = new Date();
        c.setTime(today);
        c.add(Calendar.DATE, 1);
        today = c.getTime();
        return today.after(expiringDate);
    }

     */
}
