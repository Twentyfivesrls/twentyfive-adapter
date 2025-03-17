package twentyfive.twentyfiveadapter.models.msUserBusinessModels;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(schema = "ms_user_business", name = "business_user")
public class BusinessUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    private MsUser user;

    @ManyToOne
    private Business business;

    @ManyToOne
    private MsRole role;

    private Boolean disabled;
}
