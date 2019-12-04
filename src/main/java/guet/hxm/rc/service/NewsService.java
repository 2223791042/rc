package guet.hxm.rc.service;

import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.NewsPreviewVO;
import guet.hxm.rc.dto.NewsDTO;
import guet.hxm.rc.entity.News;

import java.util.List;
import java.util.Map;

public interface NewsService {

    NewsDTO getNewsDTO(Long newsId, String newsStatus);

    void increaseVisit(Long newsId);

    List<News> getNewsList(String newsStatus);

    Map<String, Object> getNewsDTOList(Long newsId, String newsAuthor, String newsTitle, Integer newsTypeId);

    NewsDTO getNewsDTO(Long newsId);

    void saveNews(News news);

    void delNews(Long newsId);

    void editNewsImage(Long newsId, String imageUrl);

    void editNews(News news, String type);

    Map<String, Object> getNewsDTOList(String newsStatus) ;

    void delBatchNews(String id_str);

    NewsPreviewVO getNewsPreviewVO(Long newsId);

    News getNews(String newsTitle);

    List<News> getNews(Integer typeId);

    Integer getCountNews();

    Map<String,Object> getNewsDTOList(String newsStatus, String key);
}
