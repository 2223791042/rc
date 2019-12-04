package guet.hxm.rc.service.impl;

import guet.hxm.rc.dao.ApplicationMapper;
import guet.hxm.rc.dao.RecEmailMapper;
import guet.hxm.rc.dao.RecUserMapper;
import guet.hxm.rc.entity.*;
import guet.hxm.rc.enums.ApplicationEnum;
import guet.hxm.rc.service.RecUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RecUserServiceImpl implements RecUserService {
    @Autowired
    private RecUserMapper recUserMapper;

    @Autowired
    private RecEmailMapper recEmailMapper;

    @Autowired
    private ApplicationMapper applicationMapper;

    @Transactional
    @Override
    public void saveRecEmail(RecEmail recEmail) {
        RecEmailExample emailExample = new RecEmailExample();
        RecEmailExample.Criteria criteria = emailExample.createCriteria();
        criteria.andEmailEqualTo(recEmail.getEmail());
        criteria.andIsConfirmEqualTo("N");
        if(recEmailMapper.selectByExample(emailExample).size() != 0){
            recEmailMapper.deleteByExample(emailExample);
        }
        recEmailMapper.insertSelective(recEmail);
    }

    @Override
    public RecEmail getRecEmail(String email) {
        RecEmailExample emailExample = new RecEmailExample();
        RecEmailExample.Criteria criteria = emailExample.createCriteria();
        criteria.andEmailEqualTo(email);
        List<RecEmail> recEmailList = recEmailMapper.selectByExample(emailExample);
        if (recEmailList.size() != 0){
            return recEmailList.get(0);
        }
        return null;
    }

    @Transactional
    @Override
    public void saveRecUser(RecUser recUser) {
        recUserMapper.insertSelective(recUser);
    }

    @Transactional
    @Override
    public void confirmRecEmail(String email) {
        RecEmailExample emailExample = new RecEmailExample();
        RecEmailExample.Criteria criteria = emailExample.createCriteria();
        criteria.andEmailEqualTo(email);
        RecEmail recEmail = recEmailMapper.selectByExample(emailExample).get(0);
        recEmail.setIsConfirm("Y");
        recEmailMapper.updateByPrimaryKeySelective(recEmail);
    }

    @Override
    public RecUser getRecUser(String email) {
        RecUserExample example = new RecUserExample();
        RecUserExample.Criteria criteria = example.createCriteria();
        criteria.andEmailEqualTo(email);
        List<RecUser> recUserList = recUserMapper.selectByExample(example);
        if (recUserList.size() != 0){
            return recUserList.get(0);
        }
        return null;
    }

    @Override
    public Application getApplication(String email) {
        ApplicationExample example = new ApplicationExample();
        ApplicationExample.Criteria criteria = example.createCriteria();
        criteria.andEmailEqualTo(email);
        List<Application> applicationList = applicationMapper.selectByExample(example);
        if (applicationList.size() != 0){
            return applicationList.get(0);
        }
        return null;
    }

    @Transactional
    @Override
    public void saveApplication(Application application, String type) {
        if (type.equals("save")){
            application.setApplicationStatus(ApplicationEnum.SAVE.getApplicationStatus());
        }else{
            application.setApplicationStatus(ApplicationEnum.SUBMIT.getApplicationStatus());
        }
        applicationMapper.insertSelective(application);
    }

    @Transactional
    @Override
    public void editApplication(Application application, String type) {
        if (type.equals("save")){
            application.setApplicationStatus(ApplicationEnum.SAVE.getApplicationStatus());
        }else{
            application.setApplicationStatus(ApplicationEnum.SUBMIT.getApplicationStatus());
        }
        applicationMapper.updateByPrimaryKeySelective(application);
    }

    @Transactional
    @Override
    public void editRecUser(RecUser recUser) {
        recUserMapper.updateByPrimaryKeySelective(recUser);
    }
}
