package guet.hxm.rc.service;

import guet.hxm.rc.entity.User;

import java.util.List;
//定义接口
public interface UserService {
    User getUser(String username);

    List<User> getUserList(String username, String userType);

    void saveUser(User user);

    User getUser(Long userId);

    void editUser(User user);

    void delUser(Long userId);

    User getUser(String username, String userType);

    Integer getCountUser();
}
