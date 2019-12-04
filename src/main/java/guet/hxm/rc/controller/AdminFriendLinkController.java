package guet.hxm.rc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.entity.FriendLink;
import guet.hxm.rc.enums.ResultEnum;
import guet.hxm.rc.service.FriendLinkService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.net.URLDecoder;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminFriendLinkController {
    @Autowired
    private FriendLinkService friendLinkService;

    @Value("${fileRootPath}")
    private String fileRootPath;

    @GetMapping("/friendLink")
    public String friendLink(){
        return "friendLink-list";
    }

    @ResponseBody
    @GetMapping("/friendLinkList")
    public TableListVO<FriendLink> friendLinkList(int page, int limit, HttpServletRequest request){
        PageHelper.startPage(page, limit);
        String linkName = request.getParameter("linkName");
        List<FriendLink> friendLinkList = friendLinkService.getFriendLinkList(linkName);
        PageInfo pageInfo = new PageInfo(friendLinkList);
        return new TableListVO<>(pageInfo.getTotal(), friendLinkList);
    }

    @GetMapping("/friendLinkAdd")
    public String friendLinkAdd(){
        return "friendLink-add";
    }


    @ResponseBody
    @PostMapping("/friendLink")
    public ResultVO friendLink(@RequestParam("img")MultipartFile img, FriendLink friendLink){
        try {
            if (!img.isEmpty()) {
                String fileName = img.getOriginalFilename();
                String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/image/friendLink";
                folderPath = URLDecoder.decode(folderPath, "UTF-8");
                File folder = new File(folderPath);
                if (!folder.exists()) {
                    folder.mkdirs();
                }
                File dest = new File(folderPath + "/" + fileName);
                img.transferTo(dest);
                String imageUrl = fileRootPath + "/image/friendLink/" + fileName;
                friendLink.setLinkImage(imageUrl);
                friendLink.setAddTime(new Date());
                if (friendLink.getIsBlank() == null){
                    friendLink.setIsBlank("N");
                }
                friendLinkService.saveFriendLink(friendLink);
                return ResultVOUtil.success();
            }
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "添加失败");
        }
        return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "添加失败");
    }


    @ResponseBody
    @PutMapping("/friendLink/{linkId}")
    public ResultVO friendLink(@PathVariable("linkId")Long linkId,@RequestParam("img")MultipartFile img, FriendLink friendLink){
        try {
            if (!img.isEmpty()) {
                String fileName = img.getOriginalFilename();
                String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/image/friendLink";
                folderPath = URLDecoder.decode(folderPath, "UTF-8");
                File folder = new File(folderPath);
                if (!folder.exists()) {
                    folder.mkdirs();
                }
                File dest = new File(folderPath + "/" + fileName);
                img.transferTo(dest);
                String imageUrl = fileRootPath + "/image/friendLink/" + fileName;
                friendLink.setLinkImage(imageUrl);
            }
            friendLink.setLinkId(linkId);
            friendLink.setAddTime(new Date());
            if (friendLink.getIsBlank() == null){
                friendLink.setIsBlank("N");
            }
            friendLinkService.editFriendLink(friendLink);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "修改失败");
        }
    }

    @ResponseBody
    @GetMapping("/friendLink/checkLinkName/{linkName}")
    public ResultVO checkLinkName(@PathVariable("linkName") String linkName){
        FriendLink friendLink = friendLinkService.getFriendLink(linkName);
        if (friendLink != null){
            return ResultVOUtil.success();
        }
        return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "友情链接网站重复");
    }

    @GetMapping("/friendLink/{linkId}")
    public String friendLink(@PathVariable("linkId")Long linkId, Model model){
        FriendLink friendLink = friendLinkService.getFriendLink(linkId);
        model.addAttribute("friendLink", friendLink);
        return "friendLink-edit";
    }

    @ResponseBody
    @DeleteMapping("/friendLink/{linkId}")
    public ResultVO del(@PathVariable("linkId") Long linkId){
        try{
            friendLinkService.delFriendLink(linkId);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"删除失败");
        }
    }

    @ResponseBody
    @DeleteMapping("/friendLinkDelBatch/{id_str}")
    public ResultVO newsDelBatch(@PathVariable("id_str") String id_str){
        try{
            friendLinkService.delBatchFriendLink(id_str);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "删除失败");
        }
    }
}
