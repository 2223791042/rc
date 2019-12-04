package guet.hxm.rc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.entity.OpenAcademic;
import guet.hxm.rc.enums.ResultEnum;
import guet.hxm.rc.service.OpenAcademicService;
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
public class AdminOpenAcademicController {
    @Autowired
    private OpenAcademicService openAcademicService;

    @Value("${fileRootPath}")
    private String fileRootPath;

    @GetMapping("/openAcademic")
    public String openAcademic(){
        return "openAcademic-list";
    }

    @GetMapping("/openAcademicAdd")
    public String openAcademicAdd(){
        return "openAcademic-add";
    }

    @GetMapping("/openAcademic/{academicId}")
    public String openAcademicEdit(@PathVariable("academicId")Long academicId, Model model){
        OpenAcademic openAcademic = openAcademicService.getOpenAcademic(academicId);
        model.addAttribute("openAcademic", openAcademic);
        return "openAcademic-edit";
    }

    @ResponseBody
    @PutMapping("/openAcademic/{academicId}")
    public ResultVO openAcademicEdit(@PathVariable("academicId")Long academicId, OpenAcademic openAcademic){
        openAcademic.setAcademicId(academicId);
        try{
            openAcademicService.editOpenAcademic(openAcademic);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.fail("修改失败");
        }
    }

    @ResponseBody
    @DeleteMapping("/openAcademic/{academicId}")
    public ResultVO openAcademicDel(@PathVariable("academicId")Long academicId){
        try{
            openAcademicService.delOpenAcademic(academicId);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.fail("删除失败");
        }
    }

    @ResponseBody
    @DeleteMapping("/openAcademicDelBatch/{id_str}")
    public ResultVO openAcademicDelBatch(@PathVariable("id_str")String id_str){
        try{
            openAcademicService.delBatchOpenAcademic(id_str);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.fail("删除失败");
        }
    }

    @ResponseBody
    @PostMapping("/openAcademic")
    public ResultVO openAcademicAdd(@RequestParam("extraFile")MultipartFile extraFile, OpenAcademic openAcademic){
        try {
            if (!extraFile.isEmpty()) {
                String fileName = extraFile.getOriginalFilename();
                String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/openAcademic";
                folderPath = URLDecoder.decode(folderPath, "UTF-8");
                File folder = new File(folderPath);
                if (!folder.exists()) {
                    folder.mkdirs();
                }
                File dest = new File(folderPath + "/" + fileName);
                extraFile.transferTo(dest);
                String fileUrl = fileRootPath + "/openAcademic/" + fileName;
                openAcademic.setAcademicDownloadLink(fileUrl);
            }
            openAcademic.setAcademicDownloadQuantity(0);
            openAcademicService.saveOpenAcademic(openAcademic);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.fail("添加失败");
        }
    }

    @ResponseBody
    @GetMapping("/openAcademicList")
    public TableListVO<OpenAcademic> openAcademicList(int page, int limit, HttpServletRequest request){
        PageHelper.startPage(page, limit);
        Long academicId = null;
        if(request.getParameter("academicId") != null){
            if (!request.getParameter("academicId").trim().equals("")){
                academicId = Long.parseLong(request.getParameter("academicId"));
            }
        }
        String academicAuthor = request.getParameter("academicAuthor");
        String academicYear = request.getParameter("academicYear");
        Integer academicType = null;
        if (request.getParameter("academicType") != null && !request.getParameter("academicType").trim().equals("")){
            academicType = Integer.parseInt(request.getParameter("academicType"));
        }
        List<OpenAcademic> teacherList = openAcademicService.getOpenAcademicList(academicId, academicAuthor, academicYear, academicType);
        PageInfo<OpenAcademic> pageInfo = new PageInfo<>(teacherList);
        return new TableListVO<>(pageInfo.getTotal(), teacherList);
    }

}
