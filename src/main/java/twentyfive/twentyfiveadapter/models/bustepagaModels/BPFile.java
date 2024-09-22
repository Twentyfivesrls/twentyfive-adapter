package twentyfive.twentyfiveadapter.models.bustepagaModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "buste_paga_files")
public class BPFile {
    private String id;
    private String employeeId;
    private String filename;
    private String fileUrl;
    private String fileType;
    private LocalDateTime uploadDate;
}
