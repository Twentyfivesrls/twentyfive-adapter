package twentyfive.twentyfiveadapter.models.msUserBusinessModels;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(
        schema = "ms_user_business",
        name = "ms_role",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"business_id", "name"})
        }
)
public class MsRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String keycloakRole;
    @Column(nullable = false)
    private Boolean assignable;
    @ManyToOne(optional = false)
    private Business business;
}
