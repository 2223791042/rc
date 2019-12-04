package guet.hxm.rc.controller;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.entity.Application;
import guet.hxm.rc.service.ApplicationService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Controller
@RequestMapping("/admin")
public class AdminApplicationController {
    @Autowired
    private ApplicationService applicationService;
     //搜索申请表
    @ResponseBody
    @GetMapping("/applicationList")
    public TableListVO<Application> applicationList(int page, int limit, HttpServletRequest request){
        PageHelper.startPage(page, limit);
        Long applicationId = null;
        if(request.getParameter("applicationId") != null){
            if (!request.getParameter("applicationId").trim().equals("")){
                applicationId = Long.parseLong(request.getParameter("applicationId"));
            }
        }
        String name = request.getParameter("name");
        List<Application> applicationList = applicationService.getApplicationList(applicationId, name);
        PageInfo<Application> pageInfo = new PageInfo<>(applicationList);
        return new TableListVO<>(pageInfo.getTotal(), applicationList);
    }

    @GetMapping("/application")
    public String application(){
        return "application-list";
    }
    //查看申请表
    @GetMapping("/application/{applicationId}")
    public String applicationLook(@PathVariable("applicationId")Long applicationId, Model model){
        Application apply = applicationService.getApplication(applicationId);
        model.addAttribute("apply", apply);
        return "application-look";
    }
    //删除申请表
    @ResponseBody
    @DeleteMapping("/application/{applicationId}")
    public ResultVO applicationDel(@PathVariable("applicationId")Long applicationId){
        try{
            applicationService.delApplication(applicationId);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.fail("删除失败");
        }
    }
}
