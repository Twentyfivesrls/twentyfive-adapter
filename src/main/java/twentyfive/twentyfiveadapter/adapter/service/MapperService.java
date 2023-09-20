package twentyfive.twentyfiveadapter.adapter.service;


import com.twentyfive.twentyfivemodel.models.linktreeModels.UserLink;
import org.springframework.stereotype.Service;
import twentyfive.twentyfiveadapter.adapter.Document.UserLinkDocumentDB;
import twentyfive.twentyfiveadapter.adapter.Mapper.TwentyFiveMapper;

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
