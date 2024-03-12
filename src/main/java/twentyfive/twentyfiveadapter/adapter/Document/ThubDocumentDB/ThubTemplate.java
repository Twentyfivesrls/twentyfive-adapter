package twentyfive.twentyfiveadapter.adapter.Document.ThubDocumentDB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "thub_template")
public class ThubTemplate {

    @Id
    private String name;
    private String backgroundColor;
    private String backgroundImage;
    private String buttonColor;
    private String buttonStyle;
    private String buttonTextColor;
    private String font;
    private String fontColor;
}
