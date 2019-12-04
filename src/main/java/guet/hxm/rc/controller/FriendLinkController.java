package guet.hxm.rc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.entity.FriendLink;
import guet.hxm.rc.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/friendLink")
public class FriendLinkController {
    @Autowired
    private FriendLinkService friendLinkService;

    @ResponseBody
    @GetMapping("/list")
    public TableListVO<FriendLink> list(@RequestParam(value = "page", defaultValue = "1")int page,
                                        @RequestParam(value = "limit", defaultValue = "5")int limit){
        PageHelper.startPage(page, limit);
        List<FriendLink>  friendLinkList = friendLinkService.getFriendLink();
        PageInfo pageInfo = new PageInfo(friendLinkList);
        return new TableListVO<>(pageInfo.getTotal(), friendLinkList);
    }
}
