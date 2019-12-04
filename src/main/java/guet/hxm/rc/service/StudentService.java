package guet.hxm.rc.service;

import guet.hxm.rc.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudentList(String studentName, String graduationSchool, Long studentId, String belongGrade);

    void delStudent(Long studentId);

    void delBatchStudent(String id_str);

    void saveStudent(Student student);

    Student getStudent(Long studentId);

    void editStudent(Student student);

    List<Student> getStudentList(String belongGrade);
}
