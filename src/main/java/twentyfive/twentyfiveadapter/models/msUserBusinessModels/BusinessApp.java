package twentyfive.twentyfiveadapter.models.msUserBusinessModels;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(schema = "ms_user_business", name = "business_app")
public class BusinessApp {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private Business business;

    @ManyToOne
    private MsApp app;

    @OneToOne
    private OperationalSettings operationalSettings;
}
