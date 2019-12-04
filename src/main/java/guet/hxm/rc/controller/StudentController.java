package guet.hxm.rc.controller;

import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.entity.Student;
import guet.hxm.rc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @ResponseBody
    @GetMapping("/list")
    public TableListVO<Student> list(String belongGrade){
        List<Student> studentList = studentService.getStudentList(belongGrade);
        return new TableListVO<>(Long.parseLong(studentList.size()+""), studentList);
    }
}
