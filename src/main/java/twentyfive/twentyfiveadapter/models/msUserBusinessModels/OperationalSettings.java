package twentyfive.twentyfiveadapter.models.msUserBusinessModels;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "ms_user_business", name = "operational_settings")
public class OperationalSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Integer timeBetweenExits;
    private Double servicePrice;
}
