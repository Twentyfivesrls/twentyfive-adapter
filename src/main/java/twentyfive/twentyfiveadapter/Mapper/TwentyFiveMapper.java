package twentyfive.twentyfiveadapter.Mapper;

import com.twentyfive.twentyfivemodel.models.UserLink;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import twentyfive.twentyfiveadapter.Document.UserLinkDocumentDB;

@Mapper
public interface TwentyFiveMapper {
    TwentyFiveMapper INSTANCE = Mappers.getMapper(TwentyFiveMapper.class);
    UserLinkDocumentDB userLinkToUserLinkDocumentDB(UserLink userLink);
    UserLink userLinkDocumentDBToUserLink(UserLinkDocumentDB userLinkDocumentDB);
}
