package guet.hxm.rc.service.impl;

import guet.hxm.rc.dao.UserMapper;
import guet.hxm.rc.entity.User;
import guet.hxm.rc.entity.UserExample;
import guet.hxm.rc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(String username) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> userList = userMapper.selectByExample(userExample);
        if(userList.size() != 0){
            return userList.get(0);
        }
        return null;
    }

    @Override
    public List<User> getUserList(String username, String userType) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        if(username != null && !username.trim().equals("")){
            criteria.andUsernameLike("%"+username+"%");
        }
        if(userType != null && !userType.trim().equals("")){
            criteria.andUserTypeEqualTo(userType);
        }
        return userMapper.selectByExample(userExample);
    }

    @Transactional   //开启事务，基于数据的安全性考虑，事务回滚，然后段开，不会影响数据
    @Override
    public void saveUser(User user) {
        userMapper.insertSelective(user);
    }   //执行insert语句，将数据插入到数据库

    @Override
    public User getUser(Long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Transactional
    @Override
    public void editUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Transactional
    @Override
    public void delUser(Long userId) {
        userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public User getUser(String username, String userType) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andUserTypeEqualTo(userType);
        List<User> userList = userMapper.selectByExample(userExample);
        if(userList.size() != 0){
            return userList.get(0);
        }
        return null;
    }

    @Override
    public Integer getCountUser() {
        return userMapper.countByExample(null);
    }
}
