package twentyfive.twentyfiveadapter.controller;


import com.twentyfive.twentyfivemodel.models.UserLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import twentyfive.twentyfiveadapter.Document.UserLinkDocumentDB;
import twentyfive.twentyfiveadapter.service.MapperService;

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
