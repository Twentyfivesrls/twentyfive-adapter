package twentyfive.twentyfiveadapter.models.msUserBusinessModels;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "ms_user_business", name = "business_app")
public class BusinessApp {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(optional = false)
    private Business business;

    @ManyToOne(optional = false)
    private MsApp app;

    @OneToOne
    private OperationalSettings operationalSettings;
}
