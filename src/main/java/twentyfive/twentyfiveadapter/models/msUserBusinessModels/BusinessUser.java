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
    private MsUser user; //required

    @ManyToOne
    private Business business; //required

    @ManyToOne
    private MsRole role; //required

    private Boolean disabled; //required
}
