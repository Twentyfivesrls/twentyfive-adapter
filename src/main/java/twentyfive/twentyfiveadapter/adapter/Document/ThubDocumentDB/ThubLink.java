package twentyfive.twentyfiveadapter.adapter.Document.ThubDocumentDB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThubLink {

    private String id;
    private String name;
    private String url;
    private boolean enabled;
    private String thumbnail;
}
