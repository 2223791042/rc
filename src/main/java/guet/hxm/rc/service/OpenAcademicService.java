package guet.hxm.rc.service;

import guet.hxm.rc.entity.OpenAcademic;

import java.util.List;

public interface OpenAcademicService {
    List<OpenAcademic> getOpenAcademicList(Long academicId, String academicAuthor, String academicYear, Integer academicType);

    void saveOpenAcademic(OpenAcademic openAcademic);

    OpenAcademic getOpenAcademic(Long academicId);

    void editOpenAcademic(OpenAcademic openAcademic);

    void delOpenAcademic(Long academicId);

    void delBatchOpenAcademic(String id_str);

    List<OpenAcademic> getOpenAcademicList(String academicYear, Integer academicType);

    Integer getCountOpenAcademic();

    List<OpenAcademic> getOpenAcademicList(String key);
}
