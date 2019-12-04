package guet.hxm.rc.service.impl;

import guet.hxm.rc.dao.TeacherMapper;
import guet.hxm.rc.entity.Teacher;
import guet.hxm.rc.entity.TeacherExample;
import guet.hxm.rc.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getTeacherList(String name, String job) {
        TeacherExample example = new TeacherExample();
        example.setOrderByClause("teacher_order asc");
        TeacherExample.Criteria criteria = example.createCriteria();
        if(name != null && !name.trim().equals("")){
            criteria.andNameLike("%"+name+"%");
        }
        if(job != null && !job.trim().equals("")){
            criteria.andJobLike("%"+job+"%");
        }
        return teacherMapper.selectByExample(example);
    }

    @Transactional
    @Override
    public void saveTeacher(Teacher teacher) {
        teacherMapper.insertSelective(teacher);
    }

    @Override
    public Teacher getTeacher(Long teacherId) {
        return teacherMapper.selectByPrimaryKey(teacherId);
    }

    @Transactional
    @Override
    public void editTeacher(Teacher teacher) {
        teacherMapper.updateByPrimaryKeySelective(teacher);
    }

    @Transactional
    @Override
    public void delTeacher(Long teacherId) {
        teacherMapper.deleteByPrimaryKey(teacherId);
    }

    @Override
    public Teacher getTeacher(Long teacherId, String teacherStatus) {
        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(teacherStatus);
        criteria.andTeacherIdEqualTo(teacherId);
        List<Teacher> teacherList = teacherMapper.selectByExample(example);
        if (teacherList.size() != 0){
            return teacherList.get(0);
        }
        return null;
    }

    @Override
    public Teacher getTeacher(String name) {
        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);
        List<Teacher> teacherList = teacherMapper.selectByExample(example);
        if (teacherList.size() != 0){
            return teacherList.get(0);
        }
        return null;
    }

    @Transactional
    @Override
    public void delBatchTeacher(String id_str) {
        String[] ids = id_str.split(",");
        ArrayList<Long> idList = new ArrayList<>();
        for (String id : ids){
            idList.add(Long.parseLong(id));
        }
        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andTeacherIdIn(idList);
        teacherMapper.deleteByExample(example);
    }

    @Override
    public List<Teacher> getTeacherList(String teacherStatus) {
        TeacherExample example = new TeacherExample();
        example.setOrderByClause("teacher_order asc");
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(teacherStatus);
        return teacherMapper.selectByExample(example);
    }
}
