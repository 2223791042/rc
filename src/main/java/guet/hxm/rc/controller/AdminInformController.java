package guet.hxm.rc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.InformPreviewVO;
import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.dto.InformDTO;
import guet.hxm.rc.entity.Inform;
import guet.hxm.rc.entity.InformType;
import guet.hxm.rc.enums.InformEnum;
import guet.hxm.rc.enums.ResultEnum;
import guet.hxm.rc.service.InformService;
import guet.hxm.rc.service.InformTypeService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminInformController {
    @Autowired
    private InformService informService;

    @Autowired
    private InformTypeService informTypeService;

    @Value("${fileRootPath}")
    private String fileRootPath;

    @ResponseBody
    @GetMapping("/informList")
    public TableListVO<InformDTO> informList(int page, int limit, HttpServletRequest request){
        PageHelper.startPage(page, limit);
        Long informId = null;
        if (request.getParameter("informId") != null){
            if (!request.getParameter("informId").trim().equals(""))
                informId  = Long.parseLong(request.getParameter("informId"));
        }
        String informAuthor = request.getParameter("informAuthor");
        String informTitle = request.getParameter("informTitle");
        Integer informTypeId = null;
        if (request.getParameter("informTypeId") != null){
            if (!request.getParameter("informTypeId").trim().equals(""))
                informTypeId  = Integer.parseInt(request.getParameter("informTypeId"));
        }
        Map<String, Object> map = informService.getInformDTOList(informId, informAuthor, informTitle, informTypeId);
        PageInfo pageInfo = (PageInfo) map.get("pageInfo");
        List<InformDTO> newsDTOList = (List<InformDTO>)map.get("informDTOList");
        return new TableListVO<>(pageInfo.getTotal(), newsDTOList);
    }

    @GetMapping("/informPreview/{informId}")
    public String informPreview(@PathVariable("informId") Long informId, Model model){
        InformPreviewVO previewVO = informService.getInformPreviewVO(informId);
        model.addAttribute("inform", previewVO);
        return "inform-preview";
    }

    @GetMapping("/inform/{informId}")
    public String editInform(@PathVariable("informId")Long informId, Model model){
        InformDTO informDTO = informService.getInformDTO(informId);
        List<InformType> informTypeList = informTypeService.getInformTypeList();
        model.addAttribute("inform", informDTO);
        model.addAttribute("informTypeList", informTypeList);
        return "inform-edit";
    }

    @ResponseBody
    @GetMapping("/inform/checkInformTitle/{informTitle}")
    public ResultVO checkInformTitle(@PathVariable("informTitle") String informTitle){
        Inform inform = informService.getInform(informTitle);
        if(inform != null)
            return ResultVOUtil.success();
        return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "通知标题重复");
    }

    @ResponseBody
    @PostMapping("/inform/{type}")
    public ResultVO informAdd(@PathVariable("type") String type, @RequestParam("img")MultipartFile img,
                            Inform inform, HttpSession session){
        try{
            if(!img.isEmpty()){
                String fileName = img.getOriginalFilename();
                String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath()+ "static/image/inform";
                folderPath = URLDecoder.decode(folderPath, "UTF-8");
                File folder = new File(folderPath);
                if(!folder.exists()){
                    folder.mkdirs();
                }
                File dest = new File(folderPath +"/" + fileName);
                img.transferTo(dest);
                String imageUrl = fileRootPath + "/image/inform/"+fileName;
                inform.setInformImage(imageUrl);
            }
            if(type.equals("save")){
                inform.setInformStatus(InformEnum.SAVE.getInformStatus());
            }
            if(type.equals("release")){
                inform.setInformStatus(InformEnum.RELEASE.getInformStatus());
            }
            inform.setInformAuthor(session.getAttribute("loginUser").toString());
            inform.setInformVisit(0L);
            informService.saveInform(inform);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "添加失败");
        }
    }

    @ResponseBody
    @PutMapping("/inform/image/{informId}")
    public ResultVO edit(@RequestParam("informImage")MultipartFile newsImage,
                         @PathVariable("informId")Long informId){
        if(newsImage.isEmpty()){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"上传失败，请选择文件!");
        }
        String fileName = newsImage.getOriginalFilename();
        String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath()+ "static/image/inform";
        try {
            folderPath = URLDecoder.decode(folderPath, "UTF-8");
            File folder = new File(folderPath);
            if(!folder.exists()){
                folder.mkdirs();
            }
            File dest = new File(folderPath +"/" + fileName);
            newsImage.transferTo(dest);
            String imageUrl = fileRootPath + "/image/inform/"+fileName;
            informService.editInformImage(informId, imageUrl);
            return ResultVOUtil.success();
        }catch (IOException e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"上传失败");
        }
    }

    @ResponseBody
    @PutMapping("/inform/{informId}")
    public ResultVO edit(Inform inform, @PathVariable("informId")Long informId, @RequestParam(value = "type",defaultValue = "edit") String type, HttpSession session){
        inform.setInformAuthor(session.getAttribute("loginUser").toString());
        inform.setInformId(informId);
        try{
            informService.editInform(inform, type);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"修改失败");
        }
    }

    @ResponseBody
    @DeleteMapping("/inform/{informId}")
    public ResultVO del(@PathVariable("informId")Long informId){
        try{
            informService.delInform(informId);
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"删除失败");
        }
        return ResultVOUtil.success();
    }

    @GetMapping("/inform/add")
    public String newsAdd(Model model){
        List<InformType> informTypeList = informTypeService.getInformTypeList();
        model.addAttribute("informTypeList", informTypeList);
        return "inform-add";
    }

    @GetMapping("/inform")
    public String inform(){
        return "inform-list";
    }

    @ResponseBody
    @DeleteMapping("/informDelBatch/{id_str}")
    public ResultVO informDelBatch(@PathVariable("id_str") String id_str){
        try{
            informService.delBatchInform(id_str);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "删除失败");
        }
    }
}
