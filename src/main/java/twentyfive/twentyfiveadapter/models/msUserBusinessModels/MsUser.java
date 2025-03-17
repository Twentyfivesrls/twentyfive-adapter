package twentyfive.twentyfiveadapter.models.msUserBusinessModels;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(
        schema = "ms_user_business",
        name = "ms_user",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"app_id", "keycloak_id"})
        }
)
public class MsUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String keycloakId;
    private String firstName;
    private String lastName;

    @Column(unique = true,nullable = false)
    private String email;

    @ManyToOne(optional = false)
    private MsApp app;

    @ManyToOne
    private Business business;
}