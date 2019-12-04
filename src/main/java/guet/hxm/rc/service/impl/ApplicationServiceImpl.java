package guet.hxm.rc.service.impl;

import guet.hxm.rc.dao.ApplicationMapper;
import guet.hxm.rc.entity.Application;
import guet.hxm.rc.entity.ApplicationExample;
import guet.hxm.rc.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationMapper applicationMapper;

    @Override
    public List<Application> getApplicationList(Long applicationId, String name) {
        ApplicationExample example = new ApplicationExample();
        ApplicationExample.Criteria criteria = example.createCriteria();
        if (applicationId != null){
            criteria.andApplicationIdEqualTo(applicationId);
        }
        if (name != null && !name.trim().equals("")){
            criteria.andNameLike("%"+name+"%");
        }
        return applicationMapper.selectByExample(example);
    }

    @Override
    public Application getApplication(Long applicationId) {
        return applicationMapper.selectByPrimaryKey(applicationId);
    }

    @Transactional
    @Override
    public void delApplication(Long applicationId) {
        applicationMapper.deleteByPrimaryKey(applicationId);
    }
}
