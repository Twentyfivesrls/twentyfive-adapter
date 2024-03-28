package twentyfive.twentyfiveadapter.models.bustepagaModels;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "buste_paga_configurations")
public class BPConfiguration {
    private String id;
    private String type;
    private String label;
    private String value;
    private Integer order;

}
