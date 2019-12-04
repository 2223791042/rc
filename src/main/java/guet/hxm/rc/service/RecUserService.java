package guet.hxm.rc.service;

import guet.hxm.rc.entity.Application;
import guet.hxm.rc.entity.RecEmail;
import guet.hxm.rc.entity.RecUser;

public interface RecUserService {
    void saveRecEmail(RecEmail recEmail);

    RecEmail getRecEmail(String email);

    void saveRecUser(RecUser recUser);

    void confirmRecEmail(String email);

    RecUser getRecUser(String email);

    Application getApplication(String email);

    void saveApplication(Application application, String type);

    void editApplication(Application application, String type);

    void editRecUser(RecUser recUser);
}
