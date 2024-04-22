package twentyfive.twentyfiveadapter.models.twentyfiveEmailModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailSendRequest {

    private String to;
    private String subject;
    private String text;
    private byte[] attachment;
    private String attachmentName;
    private String htmlContent;
    private Map<String, List<String>> attributes;
}
