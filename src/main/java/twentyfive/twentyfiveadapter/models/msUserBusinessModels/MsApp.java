package twentyfive.twentyfiveadapter.models.msUserBusinessModels;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(schema = "ms_user_business", name = "ms_app")
public class MsApp {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String name;

    private String realm;

    private String siteUrl;

    private String appUrl;
}
