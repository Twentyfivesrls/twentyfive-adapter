package twentyfive.twentyfiveadapter.models.twentyfiveEmailModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
