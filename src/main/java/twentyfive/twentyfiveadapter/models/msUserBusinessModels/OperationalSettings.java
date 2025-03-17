package twentyfive.twentyfiveadapter.models.msUserBusinessModels;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(schema = "ms_user_business", name = "operational_settings")
public class OperationalSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Integer timeBetweenExits;
    private Double servicePrice;
}
