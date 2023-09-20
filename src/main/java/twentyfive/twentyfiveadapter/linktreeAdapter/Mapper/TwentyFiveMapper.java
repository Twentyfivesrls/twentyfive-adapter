package twentyfive.twentyfiveadapter.linktreeAdapter.Mapper;

import com.twentyfive.twentyfivemodel.models.linktreeModels.UserLink;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import twentyfive.twentyfiveadapter.linktreeAdapter.Document.UserLinkDocumentDB;

@Mapper
public interface TwentyFiveMapper {
    TwentyFiveMapper INSTANCE = Mappers.getMapper(TwentyFiveMapper.class);
    UserLinkDocumentDB userLinkToUserLinkDocumentDB(UserLink userLink);
    UserLink userLinkDocumentDBToUserLink(UserLinkDocumentDB userLinkDocumentDB);
}
