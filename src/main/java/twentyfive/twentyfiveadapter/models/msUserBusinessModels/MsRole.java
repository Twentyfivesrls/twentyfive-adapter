package twentyfive.twentyfiveadapter.models.msUserBusinessModels;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(schema = "ms_user_business", name = "ms_role")
public class MsRole {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String keycloakRole;
    private Boolean assignable;
    @ManyToOne
    private Business business;
}
