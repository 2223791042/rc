package guet.hxm.rc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.NewsPageVO;
import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.dto.NewsDTO;
import guet.hxm.rc.entity.News;
import guet.hxm.rc.enums.NewsEnum;
import guet.hxm.rc.service.NewsService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    /**
     * 获取新闻列表内容
     * @param page
     * @param limit
     * @return
     */
    @ResponseBody
    @GetMapping("/list")
    public TableListVO<NewsDTO> list(@RequestParam(value = "page",defaultValue = "1") int page, @RequestParam(value = "limit",defaultValue = "5") int limit)
    {
        PageHelper.startPage(page, limit);
        Map<String, Object> map = newsService.getNewsDTOList(NewsEnum.RELEASE.getNewsStatus());
        PageInfo pageInfo = (PageInfo) map.get("pageInfo");
        List<NewsDTO> newsDTOList = (List<NewsDTO>)map.get("newsDTOList");
        return new TableListVO<>(pageInfo.getTotal(), newsDTOList);
    }

    @ResponseBody
    @GetMapping("/searchList")
    public TableListVO<NewsDTO> searchList(int page, int limit, HttpServletRequest request){
        PageHelper.startPage(page, limit);
        String key = request.getParameter("key");
        Map<String, Object> map = newsService.getNewsDTOList(NewsEnum.RELEASE.getNewsStatus(), key);
        PageInfo pageInfo = (PageInfo) map.get("pageInfo");
        List<NewsDTO> newsDTOList = (List<NewsDTO>)map.get("newsDTOList");
        return new TableListVO<>(pageInfo.getTotal(), newsDTOList);
    }

    /**
     * 根据id获取新闻详情
     * @param newsId
     * @return
     */
    @ResponseBody
    @GetMapping("/{newsId}")
    public ResultVO<NewsDTO> news(@PathVariable("newsId")Long newsId){
        newsService.increaseVisit(newsId);
        NewsDTO newsDTO = newsService.getNewsDTO(newsId, NewsEnum.RELEASE.getNewsStatus());
        return ResultVOUtil.success(newsDTO);
    }

    /**
     * 根据当前页获取上一页，下一页新闻信息
     * @param newsId
     * @return
     */
    @ResponseBody
    @GetMapping("page/{newsId}")
    public ResultVO<NewsPageVO> page(@PathVariable("newsId")Long newsId){
        List<News> newsList = newsService.getNewsList(NewsEnum.RELEASE.getNewsStatus());
        NewsPageVO pageVO = new NewsPageVO();
        for(int i = 0; i < newsList.size(); i++){
            News news = newsList.get(i);
            if(news.getNewsId() == newsId){
                if(i-1 >= 0){
                    pageVO.setPreNews(newsList.get(i - 1));
                }
                if(i + 1 < newsList.size()){
                    pageVO.setNextNews(newsList.get(i + 1));
                }
                break;
            }
        }
        return ResultVOUtil.success(pageVO);
    }

}
