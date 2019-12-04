package guet.hxm.rc.service.impl;

import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.NewsPreviewVO;
import guet.hxm.rc.dao.NewsMapper;
import guet.hxm.rc.dao.NewsTypeMapper;
import guet.hxm.rc.dto.NewsDTO;
import guet.hxm.rc.entity.News;
import guet.hxm.rc.entity.NewsExample;
import guet.hxm.rc.entity.NewsType;
import guet.hxm.rc.enums.NewsEnum;
import guet.hxm.rc.service.NewsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Autowired
    private NewsTypeMapper newsTypeMapper;

    @Override
    public Map<String, Object> getNewsDTOList(String newsStatus) {
        NewsExample newsExample = new NewsExample();
        newsExample.setOrderByClause("news_time desc");
        NewsExample.Criteria  criteria = newsExample.createCriteria();
        criteria.andNewsStatusEqualTo(newsStatus);
        List<News> newsList = newsMapper.selectByExample(newsExample);
        PageInfo pageInfo = new PageInfo<>(newsList);
        List<NewsDTO> newsDTOList = new ArrayList<>();
        for(News news : newsList){
            NewsDTO newsDTO = new NewsDTO();
            BeanUtils.copyProperties(news, newsDTO);
            NewsType newsType = newsTypeMapper.selectByPrimaryKey(news.getNewsTypeId());
            newsDTO.setNewsType(newsType);
            newsDTOList.add(newsDTO);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("newsDTOList", newsDTOList);
        map.put("pageInfo", pageInfo);
        return map;
    }

    @Override
    public List<News> getNewsList(String newsStatus) {
        NewsExample newsExample = new NewsExample();
        newsExample.setOrderByClause("news_time desc");
        NewsExample.Criteria  criteria = newsExample.createCriteria();
        criteria.andNewsStatusEqualTo(newsStatus);
        return newsMapper.selectByExample(newsExample);
    }

    @Override
    public NewsDTO getNewsDTO(Long newsId, String newsStatus) {
        NewsExample newsExample = new NewsExample();
        NewsExample.Criteria  criteria = newsExample.createCriteria();
        criteria.andNewsIdEqualTo(newsId);
        criteria.andNewsStatusEqualTo(newsStatus);
        List<News> newsList = newsMapper.selectByExample(newsExample);
        if(newsList.size() != 0){
            News news =  newsList.get(0);
            NewsDTO newsDTO = new NewsDTO();
            BeanUtils.copyProperties(news, newsDTO);
            NewsType newsType = newsTypeMapper.selectByPrimaryKey(news.getNewsTypeId());
            newsDTO.setNewsType(newsType);
            return newsDTO;
        }
        return null;
    }

    @Transactional
    @Override
    public void increaseVisit(Long newsId) {
        News news = newsMapper.selectByPrimaryKey(newsId);
        news.setNewsVisit(news.getNewsVisit() + 1);
        newsMapper.updateByPrimaryKeySelective(news);
    }

    @Override
    public Map<String, Object> getNewsDTOList(Long newsId, String newsAuthor, String newsTitle, Integer newsTypeId) {
        NewsExample newsExample = new NewsExample();
        NewsExample.Criteria criteria = newsExample.createCriteria();
        if (newsId != null){
            criteria.andNewsIdEqualTo(newsId);
        }
        if(newsAuthor != null && !newsAuthor.trim().equals("")){
            criteria.andNewsAuthorLike("%"+newsAuthor+"%");
        }
        if(newsTitle != null && !newsTitle.trim().equals("")){
            criteria.andNewsTitleLike("%"+newsTitle+"%");
        }
        if(newsTypeId != null){
            criteria.andNewsTypeIdEqualTo(newsTypeId);
        }
        newsExample.setOrderByClause("news_time desc");
        List<News> newsList = newsMapper.selectByExample(newsExample);
        PageInfo pageInfo = new PageInfo<>(newsList);
        List<NewsDTO> newsDTOList = new ArrayList<>();
        for(News news : newsList){
            NewsDTO newsDTO = new NewsDTO();
            BeanUtils.copyProperties(news, newsDTO);
            NewsType newsType = newsTypeMapper.selectByPrimaryKey(news.getNewsTypeId());
            newsDTO.setNewsType(newsType);
            newsDTOList.add(newsDTO);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("newsDTOList", newsDTOList);
        map.put("pageInfo", pageInfo);
        return map;
    }

    @Override
    public NewsDTO getNewsDTO(Long newsId) {
        News news = newsMapper.selectByPrimaryKey(newsId);
        NewsType newsType = newsTypeMapper.selectByPrimaryKey(news.getNewsTypeId());
        NewsDTO newsDTO = new NewsDTO();
        BeanUtils.copyProperties(news, newsDTO);
        newsDTO.setNewsType(newsType);
        return newsDTO;
    }

    @Transactional
    @Override
    public void saveNews(News news) {
        newsMapper.insertSelective(news);
    }

    @Transactional
    @Override
    public void delNews(Long newsId) {
        newsMapper.deleteByPrimaryKey(newsId);
    }

    @Transactional
    @Override
    public void editNewsImage(Long newsId, String imageUrl) {
        News news = new News();
        news.setNewsId(newsId);
        news.setNewsImage(imageUrl);
        newsMapper.updateByPrimaryKeySelective(news);
    }

    @Transactional
    @Override
    public void editNews(News news, String type) {
        if(type.equals("save")){
            news.setNewsStatus(NewsEnum.SAVE.getNewsStatus());
        }
        if (type.equals("release")){
            news.setNewsStatus(NewsEnum.RELEASE.getNewsStatus());
        }
        newsMapper.updateByPrimaryKeySelective(news);
    }

    @Transactional
    @Override
    public void delBatchNews(String id_str) {
        String[] ids = id_str.split(",");
        ArrayList<Long> idList = new ArrayList<>();
        for (String id : ids){
            idList.add(Long.parseLong(id));
        }
        NewsExample example = new NewsExample();
        NewsExample.Criteria criteria = example.createCriteria();
        criteria.andNewsIdIn(idList);
        newsMapper.deleteByExample(example);
    }

    @Override
    public NewsPreviewVO getNewsPreviewVO(Long newsId) {
        News news = newsMapper.selectByPrimaryKey(newsId);
        NewsType newsType = newsTypeMapper.selectByPrimaryKey(news.getNewsTypeId());
        NewsPreviewVO previewVO = new NewsPreviewVO();
        BeanUtils.copyProperties(news, previewVO);
        previewVO.setNewsType(newsType.getTypeName());
        return previewVO;
    }

    @Override
    public News getNews(String newsTitle) {
        NewsExample example = new NewsExample();
        NewsExample.Criteria criteria = example.createCriteria();
        criteria.andNewsTitleEqualTo(newsTitle);
        List<News> newsList = newsMapper.selectByExample(example);
        if (newsList.size() != 0){
            return newsList.get(0);
        }
        return null;
    }

    @Override
    public List<News> getNews(Integer typeId) {
        NewsExample example = new NewsExample();
        NewsExample.Criteria criteria = example.createCriteria();
        criteria.andNewsTypeIdEqualTo(typeId);
        return newsMapper.selectByExample(example);
    }

    @Override
    public Integer getCountNews() {
        List<News> newsList = newsMapper.selectByExample(null);
        Long totalCount = 0L;
        for (News news : newsList){
            totalCount += news.getNewsVisit();
        }
        return totalCount.intValue();
    }

    @Override
    public Map<String, Object> getNewsDTOList(String newsStatus, String key) {
        NewsExample newsExample = new NewsExample();
        newsExample.setOrderByClause("news_time desc");
        NewsExample.Criteria  criteria = newsExample.createCriteria();
        criteria.andNewsStatusEqualTo(newsStatus);
        if (key != null && !key.trim().equals("")){
            criteria.andNewsTitleLike("%"+key+"%");
        }
        List<News> newsList = newsMapper.selectByExample(newsExample);
        PageInfo pageInfo = new PageInfo<>(newsList);
        List<NewsDTO> newsDTOList = new ArrayList<>();
        for(News news : newsList){
            NewsDTO newsDTO = new NewsDTO();
            BeanUtils.copyProperties(news, newsDTO);
            NewsType newsType = newsTypeMapper.selectByPrimaryKey(news.getNewsTypeId());
            newsDTO.setNewsType(newsType);
            newsDTOList.add(newsDTO);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("newsDTOList", newsDTOList);
        map.put("pageInfo", pageInfo);
        return map;
    }
}
