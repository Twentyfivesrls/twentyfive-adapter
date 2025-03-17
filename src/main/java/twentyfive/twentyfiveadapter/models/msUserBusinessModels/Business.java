package twentyfive.twentyfiveadapter.models.msUserBusinessModels;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(schema = "ms_user_business", name = "business")
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String name;
}
