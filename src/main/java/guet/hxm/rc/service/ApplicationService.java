package guet.hxm.rc.service;

import guet.hxm.rc.entity.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> getApplicationList(Long applicationId, String name);

    Application getApplication(Long applicationId);

    void delApplication(Long applicationId);
}
