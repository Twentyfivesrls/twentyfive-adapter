package twentyfive.twentyfiveadapter.models.msUserBusinessModels;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "ms_user_business", name = "business_user")
public class BusinessUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private MsUser user;

    @ManyToOne(optional = false)
    private Business business;

    @ManyToOne(optional = false)
    private MsRole role;

    @Column(nullable = false)
    private Boolean disabled;
}
