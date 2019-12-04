package guet.hxm.rc.service;

import guet.hxm.rc.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getTeacherList(String name, String job);

    void saveTeacher(Teacher teacher);

    Teacher getTeacher(Long teacherId);

    void editTeacher(Teacher teacher);

    void delTeacher(Long teacherId);

    Teacher getTeacher(Long teacherId, String teacherStatus);

    Teacher getTeacher(String name);

    void delBatchTeacher(String id_str);

    List<Teacher> getTeacherList(String teacherStatus);
}
