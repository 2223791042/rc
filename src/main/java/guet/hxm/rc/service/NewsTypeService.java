package guet.hxm.rc.service;

import guet.hxm.rc.entity.NewsType;

import java.util.List;

public interface NewsTypeService {
    List<NewsType> getNewsTypeList();

    void saveNewsType(NewsType newsType);

    NewsType getNewsType(Integer typeId);

    void editNewsType(NewsType newsType);

    void delNewsType(Integer typeId);

    NewsType getNewsType(String typeName);
}
