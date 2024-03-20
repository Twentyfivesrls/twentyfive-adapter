package twentyfive.twentyfiveadapter.models.bustepagaModels;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BPConfiguration {
    private String id;
    private String type;
    private String label;
    private String value;
    private Integer order;

}
