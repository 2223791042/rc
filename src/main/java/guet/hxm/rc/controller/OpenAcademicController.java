package guet.hxm.rc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.entity.OpenAcademic;
import guet.hxm.rc.service.OpenAcademicService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/openAcademic")
public class OpenAcademicController {
    @Autowired
    private OpenAcademicService openAcademicService;

    @ResponseBody
    @GetMapping("/list")
    public TableListVO<OpenAcademic> list(int page, int limit, HttpServletRequest request){
        PageHelper.startPage(page, limit);
        String academicYear = request.getParameter("academicYear");
        Integer academicType = null;
        if (request.getParameter("academicType") != null && !request.getParameter("academicType").trim().equals("")){
            academicType = Integer.parseInt(request.getParameter("academicType"));
        }
        List<OpenAcademic> openAcademicList = openAcademicService.getOpenAcademicList(academicYear, academicType);
        PageInfo<OpenAcademic> pageInfo = new PageInfo<>(openAcademicList);
        return new TableListVO<>(pageInfo.getTotal(), openAcademicList);
    }

    @ResponseBody
    @GetMapping("/searchList")
    public TableListVO<OpenAcademic> searchList(int page, int limit, HttpServletRequest request) {
        PageHelper.startPage(page, limit);
        String key = request.getParameter("key");
        List<OpenAcademic> openAcademicList = openAcademicService.getOpenAcademicList(key);
        PageInfo<OpenAcademic> pageInfo = new PageInfo<>(openAcademicList);
        return new TableListVO<>(pageInfo.getTotal(), openAcademicList);
    }



    @ResponseBody
    @GetMapping("/download/{academicId}")
    public ResultVO download(@PathVariable("academicId")Long academicId){
        try{
            OpenAcademic openAcademic = openAcademicService.getOpenAcademic(academicId);
            openAcademic.setAcademicDownloadQuantity(openAcademic.getAcademicDownloadQuantity() + 1);
            openAcademicService.editOpenAcademic(openAcademic);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.fail("记录失败");
        }
    }

}
