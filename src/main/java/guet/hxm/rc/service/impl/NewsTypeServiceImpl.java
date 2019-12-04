package guet.hxm.rc.service.impl;

import guet.hxm.rc.dao.NewsTypeMapper;
import guet.hxm.rc.entity.NewsType;
import guet.hxm.rc.entity.NewsTypeExample;
import guet.hxm.rc.service.NewsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NewsTypeServiceImpl implements NewsTypeService {

    @Autowired
    private NewsTypeMapper newsTypeMapper;

    @Override
    public List<NewsType> getNewsTypeList() {
        return newsTypeMapper.selectByExample(null);
    }

    @Transactional
    @Override
    public void saveNewsType(NewsType newsType) {
        newsTypeMapper.insertSelective(newsType);
    }

    @Override
    public NewsType getNewsType(Integer typeId) {
        return newsTypeMapper.selectByPrimaryKey(typeId);
    }

    @Transactional
    @Override
    public void editNewsType(NewsType newsType) {
        newsTypeMapper.updateByPrimaryKeySelective(newsType);
    }

    @Transactional
    @Override
    public void delNewsType(Integer typeId) {
        newsTypeMapper.deleteByPrimaryKey(typeId);
    }

    @Override
    public NewsType getNewsType(String typeName) {
        NewsTypeExample example = new NewsTypeExample();
        NewsTypeExample.Criteria criteria = example.createCriteria();
        criteria.andTypeNameEqualTo(typeName);
        List<NewsType> newsTypeList = newsTypeMapper.selectByExample(example);
        if (newsTypeList.size() != 0){
            return newsTypeList.get(0);
        }
        return null;
    }
}
