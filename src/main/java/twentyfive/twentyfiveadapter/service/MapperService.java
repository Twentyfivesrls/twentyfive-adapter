package twentyfive.twentyfiveadapter.service;

import com.twentyfive.twentyfivemodel.models.UserLink;
import org.springframework.stereotype.Service;
import twentyfive.twentyfiveadapter.Document.UserLinkDocumentDB;
import twentyfive.twentyfiveadapter.Mapper.TwentyFiveMapper;

@Service
public class MapperService {

    TwentyFiveMapper twentyFiveMapper = TwentyFiveMapper.INSTANCE;

    public UserLinkDocumentDB userLinkToUserLinkDocumentDB(UserLink userLink){
        if (userLink == null)
            return null;

        return TwentyFiveMapper.INSTANCE.userLinkToUserLinkDocumentDB(userLink);
    }
}
