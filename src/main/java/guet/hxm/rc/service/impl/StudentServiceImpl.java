package guet.hxm.rc.service.impl;

import guet.hxm.rc.dao.StudentMapper;
import guet.hxm.rc.entity.Student;
import guet.hxm.rc.entity.StudentExample;
import guet.hxm.rc.enums.StudentEnum;
import guet.hxm.rc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getStudentList(String studentName, String graduationSchool, Long studentId, String belongGrade) {
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        if (studentName != null && !studentName.trim().equals("")){
            criteria.andStudentNameLike("%"+studentName+"%");
        }
        if (graduationSchool != null && !graduationSchool.trim().equals("")){
            criteria.andGraduationSchoolLike("%"+graduationSchool+"%");
        }
        if (studentId != null){
            criteria.andStudentIdEqualTo(studentId);
        }
        if (belongGrade != null && !belongGrade.trim().equals("")){
            criteria.andBelongGradeEqualTo(belongGrade);
        }
        return studentMapper.selectByExample(example);
    }

    @Transactional
    @Override
    public void delStudent(Long studentId) {
        studentMapper.deleteByPrimaryKey(studentId);
    }

    @Transactional
    @Override
    public void delBatchStudent(String id_str) {
        String[] ids = id_str.split(",");
        ArrayList<Long> idList = new ArrayList<>();
        for (String id : ids){
            idList.add(Long.parseLong(id));
        }
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andStudentIdIn(idList);
        studentMapper.deleteByExample(example);
    }

    @Transactional
    @Override
    public void saveStudent(Student student) {
        studentMapper.insertSelective(student);
    }

    @Override
    public Student getStudent(Long studentId) {
        return studentMapper.selectByPrimaryKey(studentId);
    }

    @Transactional
    @Override
    public void editStudent(Student student) {
        studentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public List<Student> getStudentList(String belongGrade) {
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andBelongGradeEqualTo(belongGrade);
        criteria.andStudentStatusEqualTo(StudentEnum.RELEASE.getStudentStatus());
        return studentMapper.selectByExample(example);
    }
}
