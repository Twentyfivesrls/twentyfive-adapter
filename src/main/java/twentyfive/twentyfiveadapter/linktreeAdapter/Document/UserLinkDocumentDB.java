package twentyfive.twentyfiveadapter.linktreeAdapter.Document;



import com.twentyfive.twentyfivemodel.models.linktreeModels.LinkTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Document(collection = "userLink")
public class UserLinkDocumentDB {
    @Id
    private String id;
    private String userId;
    private List<LinkTree> linkTrees;




}
