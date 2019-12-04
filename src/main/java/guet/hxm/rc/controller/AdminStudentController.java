package guet.hxm.rc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.entity.Student;
import guet.hxm.rc.enums.ResultEnum;
import guet.hxm.rc.enums.StudentEnum;
import guet.hxm.rc.service.StudentService;
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
public class AdminStudentController {
    @Autowired
    private StudentService studentService;

    @Value("${fileRootPath}")
    private String fileRootPath;

    @GetMapping("/student")
    public String student(){
        return "student-list";
    }

    @ResponseBody
    @GetMapping("/studentList")
    public TableListVO<Student> studentList(int page, int limit, HttpServletRequest request){
        PageHelper.startPage(page, limit);
        String studentName = request.getParameter("studentName");
        String graduationSchool = request.getParameter("graduationSchool");
        Long studentId = null;
        String belongGrade = request.getParameter("belongGrade");
        if (request.getParameter("studentId") != null){
            if (!request.getParameter("studentId").trim().equals("")){
                studentId = Long.parseLong(request.getParameter("studentId"));
            }
        }
        List<Student> studentList = studentService.getStudentList(studentName, graduationSchool, studentId, belongGrade);
        PageInfo<Student> pageInfo = new PageInfo<>(studentList);
        return new TableListVO<>(pageInfo.getTotal(), studentList);
    }

    @GetMapping("/studentAdd")
    public String studentAdd(){
        return "student-add";
    }

    @ResponseBody
    @DeleteMapping("/student/{studentId}")
    public ResultVO studentDel(@PathVariable("studentId")Long studentId){
        try{
            studentService.delStudent(studentId);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "删除失败");
        }
    }

    @GetMapping("/student/{studentId}")
    public String studentEdit(@PathVariable("studentId")Long studentId, Model model){
        Student student = studentService.getStudent(studentId);
        model.addAttribute("student", student);
        return "student-edit";
    }

    @ResponseBody
    @DeleteMapping("/studentDelBatch/{id_str}")
    public ResultVO studentDelBatch(@PathVariable("id_str")String id_str){
        try{
            studentService.delBatchStudent(id_str);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "删除失败");
        }
    }

    @ResponseBody
    @PutMapping("/student/{studentId}")
    public ResultVO studentEdit(@PathVariable("studentId")Long studentId, @RequestParam("imageFile")MultipartFile imageFile, Student student) {
        student.setStudentId(studentId);
        try {
            if (!imageFile.isEmpty()) {
                String fileName = imageFile.getOriginalFilename();
                String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/image/student";
                folderPath = URLDecoder.decode(folderPath, "UTF-8");
                File folder = new File(folderPath);
                if (!folder.exists()) {
                    folder.mkdirs();
                }
                File dest = new File(folderPath + "/" + fileName);
                imageFile.transferTo(dest);
                String imageUrl = fileRootPath + "/image/student/" + fileName;
                student.setStudentIcon(imageUrl);
            }
            if (student.getStudentStatus() == null){
                student.setStudentStatus(StudentEnum.SAVE.getStudentStatus());
            }
            student.setUploadTime(new Date());
            studentService.editStudent(student);
            return ResultVOUtil.success();
        } catch (Exception e) {
            return ResultVOUtil.fail("修改失败");
        }
    }

    @ResponseBody
    @PostMapping("/student")
    public ResultVO studentAdd(@RequestParam("imageFile")MultipartFile imageFile, Student student){
        try{
            String fileName = imageFile.getOriginalFilename();
            String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/image/student";
            folderPath = URLDecoder.decode(folderPath, "UTF-8");
            File folder = new File(folderPath);
            if (!folder.exists()) {
                folder.mkdirs();
            }
            File dest = new File(folderPath + "/" + fileName);
            imageFile.transferTo(dest);
            String imageUrl = fileRootPath + "/image/student/" + fileName;
            student.setStudentIcon(imageUrl);
            student.setUploadTime(new Date());
            boolean flag = true;
            if (student.getStudentStatus() == null){
                student.setStudentStatus(StudentEnum.SAVE.getStudentStatus());
                flag = false;
            }
            studentService.saveStudent(student);
            if (flag){
                return ResultVOUtil.success("发布成功");
            }else{
                return ResultVOUtil.success("保存成功");
            }
        }catch(Exception e){
            if (student.getStudentStatus() == null) {
                return ResultVOUtil.fail("保存失败");
            }else{
                return ResultVOUtil.fail("发布失败");
            }
        }
    }
}
