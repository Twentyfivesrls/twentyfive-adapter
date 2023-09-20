package twentyfive.twentyfiveadapter.linktreeAdapter.controller;



import com.twentyfive.twentyfivemodel.models.linktreeModels.UserLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import twentyfive.twentyfiveadapter.linktreeAdapter.Document.UserLinkDocumentDB;
import twentyfive.twentyfiveadapter.linktreeAdapter.service.MapperService;

@RestController
@RequestMapping("/mapper")
public class MapperController {

    @Autowired
    private MapperService mapperService;

    public MapperController(MapperService mapperService) {
        this.mapperService = mapperService;
    }

    @PostMapping("/userLinkToUserLinkDocument")
    public UserLinkDocumentDB getUserlinkDocumentDB(@RequestBody UserLink userLink){
        return mapperService.userLinkToUserLinkDocumentDB(userLink);
    }



}
