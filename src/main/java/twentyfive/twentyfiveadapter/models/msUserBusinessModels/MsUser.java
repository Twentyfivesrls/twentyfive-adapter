package twentyfive.twentyfiveadapter.models.msUserBusinessModels;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(
        schema = "ms_user_business",
        name = "ms_user",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"email", "app_id"}),
                @UniqueConstraint(columnNames = {"app_id", "keycloak_id"})
        }
)
public class MsUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String keycloakId;
    private String firstName;
    private String lastName;

    @Column(nullable = false)
    private String email;

    @ManyToOne(optional = false)
    private MsApp app;

    @ManyToOne
    private Business business;

    public String getFullName(){
        return this.lastName + " " + this.firstName;
    }
}