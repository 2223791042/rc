package guet.hxm.rc.service.impl;

import guet.hxm.rc.dao.OpenAcademicMapper;
import guet.hxm.rc.entity.OpenAcademic;
import guet.hxm.rc.entity.OpenAcademicExample;
import guet.hxm.rc.service.OpenAcademicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class OpenAcademicServiceImpl implements OpenAcademicService {
    @Autowired
    private OpenAcademicMapper openAcademicMapper;

    @Override
    public List<OpenAcademic> getOpenAcademicList(Long academicId, String academicAuthor, String academicYear, Integer academicType) {
        OpenAcademicExample example = new OpenAcademicExample();
        OpenAcademicExample.Criteria criteria = example.createCriteria();
        if (academicId != null){
            criteria.andAcademicIdEqualTo(academicId);
        }
        if (academicAuthor !=null && !academicAuthor.trim().equals("")){
            criteria.andAcademicAuthorLike("%"+ academicAuthor + "%");
        }
        if (academicYear !=null && !academicYear.trim().equals("")){
            criteria.andAcademicYearEqualTo(academicYear);
        }
        if (academicType !=null){
            criteria.andAcademicTypeEqualTo(academicType);
        }
        return openAcademicMapper.selectByExample(example);
    }

    @Transactional
    @Override
    public void saveOpenAcademic(OpenAcademic openAcademic) {
        openAcademicMapper.insertSelective(openAcademic);
    }

    @Override
    public OpenAcademic getOpenAcademic(Long academicId) {
        return openAcademicMapper.selectByPrimaryKey(academicId);
    }

    @Transactional
    @Override
    public void editOpenAcademic(OpenAcademic openAcademic) {
        openAcademicMapper.updateByPrimaryKeySelective(openAcademic);
    }

    @Transactional
    @Override
    public void delOpenAcademic(Long academicId) {
        openAcademicMapper.deleteByPrimaryKey(academicId);
    }

    @Transactional
    @Override
    public void delBatchOpenAcademic(String id_str) {
        String[] ids = id_str.split(",");
        ArrayList<Long> idList = new ArrayList<>();
        for (String id : ids){
            idList.add(Long.parseLong(id));
        }
        OpenAcademicExample example = new OpenAcademicExample();
        OpenAcademicExample.Criteria criteria = example.createCriteria();
        criteria.andAcademicIdIn(idList);
        openAcademicMapper.deleteByExample(example);
    }

    @Override
    public List<OpenAcademic> getOpenAcademicList(String academicYear, Integer academicType) {
        OpenAcademicExample example = new OpenAcademicExample();
        OpenAcademicExample.Criteria criteria = example.createCriteria();
        if (academicYear != null && !academicYear.trim().equals("")){
            criteria.andAcademicYearEqualTo(academicYear);
        }
        if (academicType != null){
            criteria.andAcademicTypeEqualTo(academicType);
        }
        return openAcademicMapper.selectByExample(example);
    }

    @Override
    public Integer getCountOpenAcademic() {
        List<OpenAcademic> openAcademicList = openAcademicMapper.selectByExample(null);
        Integer totalCount = 0;
        for (OpenAcademic openAcademic : openAcademicList){
            totalCount += openAcademic.getAcademicDownloadQuantity();
        }
        return totalCount;
    }

    @Override
    public List<OpenAcademic> getOpenAcademicList(String key) {
        OpenAcademicExample example = new OpenAcademicExample();
        OpenAcademicExample.Criteria criteria = example.createCriteria();
        if (key != null && !key.trim().equals("")){
            criteria.andAcademicNameLike("%"+key+"%");
        }
        return openAcademicMapper.selectByExample(example);
    }
}
