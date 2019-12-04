package guet.hxm.rc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.entity.Teacher;
import guet.hxm.rc.enums.TeacherEnum;
import guet.hxm.rc.service.TeacherService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @ResponseBody
    @GetMapping("/list")
    public TableListVO<Teacher> list(@RequestParam(value = "page",defaultValue = "1") int page, @RequestParam(value = "limit",defaultValue = "20") int limit) {
        PageHelper.startPage(page, limit);
        List<Teacher> teacherList = teacherService.getTeacherList(TeacherEnum.RELEASE.getTeacherStatus());
        PageInfo pageInfo = new PageInfo(teacherList);
        return new TableListVO<>(pageInfo.getTotal(), teacherList);
    }

    @ResponseBody
    @GetMapping("/{teacherId}")
    public ResultVO<Teacher> news(@PathVariable("teacherId")Long teacherId){
        Teacher teacher = teacherService.getTeacher(teacherId, TeacherEnum.RELEASE.getTeacherStatus());
        return ResultVOUtil.success(teacher);
    }

}
