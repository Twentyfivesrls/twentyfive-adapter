package twentyfive.twentyfiveadapter.linktreeAdapter.service;


import com.twentyfive.twentyfivemodel.models.linktreeModels.UserLink;
import org.springframework.stereotype.Service;
import twentyfive.twentyfiveadapter.linktreeAdapter.Document.UserLinkDocumentDB;
import twentyfive.twentyfiveadapter.linktreeAdapter.Mapper.TwentyFiveMapper;

@Service
public class MapperService {

    TwentyFiveMapper twentyFiveMapper = TwentyFiveMapper.INSTANCE;

    public UserLinkDocumentDB userLinkToUserLinkDocumentDB(UserLink userLink){
        if (userLink == null)
            return null;

        UserLinkDocumentDB result = TwentyFiveMapper.INSTANCE.userLinkToUserLinkDocumentDB(userLink);
        return result;
    }
}
