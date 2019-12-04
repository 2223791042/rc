package guet.hxm.rc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.entity.Teacher;
import guet.hxm.rc.enums.ResultEnum;
import guet.hxm.rc.enums.TeacherEnum;
import guet.hxm.rc.service.TeacherService;
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
public class AdminTeacherController {
    @Autowired
    private TeacherService teacherService;

    @Value("${fileRootPath}")
    private String fileRootPath;

    @ResponseBody
    @GetMapping("/teacherList")
    public TableListVO<Teacher> teacherList(int page, int limit, HttpServletRequest request){
        PageHelper.startPage(page, limit);
        String name = request.getParameter("name");
        String job = request.getParameter("job");
        List<Teacher> teacherList = teacherService.getTeacherList(name, job);
        PageInfo pageInfo = new PageInfo(teacherList);
        return new TableListVO<>(pageInfo.getTotal(), teacherList);
    }

    @GetMapping("/teacherAdd")
    public String teacherAdd(){
        return "teacher-add";
    }

    @GetMapping("/teacher")
    public String teacher(){
        return "teacher-list";
    }

    @GetMapping("/teacher/{teacherId}")
    public String teacher(@PathVariable("teacherId")Long teacherId, Model model){
        Teacher teacher = teacherService.getTeacher(teacherId);
        model.addAttribute("teacher", teacher);
        return "teacher-edit";
    }


    @ResponseBody
    @PostMapping("/teacher/{type}")
    public ResultVO teacher(@PathVariable("type")String type, @RequestParam("img")MultipartFile img, Teacher teacher){
        try {
            if (!img.isEmpty()) {
                String fileName = img.getOriginalFilename();
                String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/image/teacher";
                folderPath = URLDecoder.decode(folderPath, "UTF-8");
                File folder = new File(folderPath);
                if (!folder.exists()) {
                    folder.mkdirs();
                }
                File dest = new File(folderPath + "/" + fileName);
                img.transferTo(dest);
                String imageUrl = fileRootPath + "/image/teacher/" + fileName;
                teacher.setImage(imageUrl);
                teacher.setUpdateTime(new Date());
                if (type.equals("save")){
                    teacher.setStatus(TeacherEnum.SAVE.getTeacherStatus());
                }else{
                    teacher.setStatus(TeacherEnum.RELEASE.getTeacherStatus());
                }
                teacherService.saveTeacher(teacher);
                return ResultVOUtil.success();
            }
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "添加失败");
        }
        return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "添加失败");
    }

    @ResponseBody
    @PutMapping("/teacher/{teacherId}")
    public ResultVO editTeacher(@PathVariable("teacherId")Long teacherId, @RequestParam("img")MultipartFile img, Teacher teacher,
                                HttpServletRequest request){
        try {
            if (!img.isEmpty()) {
                String fileName = img.getOriginalFilename();
                String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/image/teacher";
                folderPath = URLDecoder.decode(folderPath, "UTF-8");
                File folder = new File(folderPath);
                if (!folder.exists()) {
                    folder.mkdirs();
                }
                File dest = new File(folderPath + "/" + fileName);
                img.transferTo(dest);
                String imageUrl = fileRootPath + "/image/teacher/" + fileName;
                teacher.setImage(imageUrl);
            }
            teacher.setTeacherId(teacherId);
            teacher.setUpdateTime(new Date());
            String type = request.getParameter("type");
            if (type.equals("save")){
                teacher.setStatus(TeacherEnum.SAVE.getTeacherStatus());
            }else{
                teacher.setStatus(TeacherEnum.RELEASE.getTeacherStatus());
            }
            teacherService.editTeacher(teacher);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "修改失败");
        }
    }

    @ResponseBody
    @DeleteMapping("/teacher/{teacherId}")
    public ResultVO teacher(@PathVariable("teacherId")Long teacherId){
        try{
            teacherService.delTeacher(teacherId);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "删除失败");
        }
    }

    @ResponseBody
    @DeleteMapping("/teacherDelBatch/{id_str}")
    public ResultVO teacherDelBatch(@PathVariable("id_str")String id_str){
        try{
            teacherService.delBatchTeacher(id_str);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "删除失败");
        }
    }

    @ResponseBody
    @GetMapping("/teacher/checkName/{name}")
    public ResultVO teacher(@PathVariable("name")String name){
      Teacher teacher = teacherService.getTeacher(name);
      if (teacher != null){
          return ResultVOUtil.success();
      }
      return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"未被注册");
    }

}
