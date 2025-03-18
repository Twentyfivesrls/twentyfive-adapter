package twentyfive.twentyfiveadapter.models.msUserBusinessModels;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "ms_user_business", name = "ms_app")
public class MsApp {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true,nullable = false)
    private String name; //required

    @ManyToOne(optional = false)
    private MsRealm realm; //required

    private String siteUrl;

    private String appUrl;
}
