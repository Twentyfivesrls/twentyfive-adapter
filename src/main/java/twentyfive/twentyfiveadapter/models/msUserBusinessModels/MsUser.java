package twentyfive.twentyfiveadapter.models.msUserBusinessModels;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(schema = "ms_user_business", name = "ms_user")
public class MsUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String keycloakId; //constraint tra app e keycloakId
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;

    @ManyToOne
    private MsApp app;

    @ManyToOne
    private Business business;
}