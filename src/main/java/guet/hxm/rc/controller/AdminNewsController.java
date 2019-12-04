package guet.hxm.rc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.NewsPreviewVO;
import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.dto.NewsDTO;
import guet.hxm.rc.entity.News;
import guet.hxm.rc.entity.NewsType;
import guet.hxm.rc.enums.NewsEnum;
import guet.hxm.rc.enums.ResultEnum;
import guet.hxm.rc.service.NewsService;
import guet.hxm.rc.service.NewsTypeService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.transform.Result;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminNewsController {
    @Autowired
    private NewsService newsService;

    @Autowired
    private NewsTypeService newsTypeService;

    @Value("${fileRootPath}")
    private String fileRootPath;

    /**
     * 新闻列表数据
     * @param page
     * @param limit
     * @return
     */
    @ResponseBody
    @GetMapping("/newsList")
    public TableListVO<NewsDTO> newsList(int page, int limit, HttpServletRequest request){
        PageHelper.startPage(page, limit);
        Long newsId = null;
        if (request.getParameter("newsId") != null){
            if (!request.getParameter("newsId").trim().equals(""))
                newsId  = Long.parseLong(request.getParameter("newsId"));
        }
        String newsAuthor = request.getParameter("newsAuthor");
        String newsTitle = request.getParameter("newsTitle");
        Integer newsTypeId = null;
        if (request.getParameter("newsTypeId") != null){
            if (!request.getParameter("newsTypeId").trim().equals(""))
                newsTypeId  = Integer.parseInt(request.getParameter("newsTypeId"));
        }
        Map<String, Object> map = newsService.getNewsDTOList(newsId, newsAuthor, newsTitle, newsTypeId);
        PageInfo pageInfo = (PageInfo) map.get("pageInfo");
        List<NewsDTO> newsDTOList = (List<NewsDTO>)map.get("newsDTOList");
        return new TableListVO<>(pageInfo.getTotal(), newsDTOList);
    }

    @GetMapping("/newsPreview/{newsId}")
    public String newsPreview(@PathVariable("newsId") Long newsId, Model model){
        NewsPreviewVO previewVO = newsService.getNewsPreviewVO(newsId);
        model.addAttribute("news", previewVO);
        return "news-preview";
    }

    /**
     * 新闻详情
     * @param newsId
     * @param model
     * @return
     */
    @GetMapping("/news/{newsId}")
    public String editNews(@PathVariable("newsId")Long newsId, Model model){
        NewsDTO newsDTO = newsService.getNewsDTO(newsId);
        List<NewsType> newsTypeList = newsTypeService.getNewsTypeList();
        model.addAttribute("news", newsDTO);
        model.addAttribute("newsTypeList", newsTypeList);
        return "news-edit";
    }

    @ResponseBody
    @GetMapping("/news/checkNewsTitle/{newsTitle}")
    public ResultVO checkNewsTitle(@PathVariable("newsTitle") String newsTitle){
        News news = newsService.getNews(newsTitle);
        if (news != null){
            return ResultVOUtil.success();
        }
        return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "新闻标题重复");
    }

    /**新闻添加
     * @param type
     * @param img
     * @param news
     * @param session
     * @return
     */
    @ResponseBody
    @PostMapping("/news/{type}")
    public ResultVO newsAdd(@PathVariable("type") String type, @RequestParam("img")MultipartFile img,
                            News news, HttpSession session){
        try{
            if(!img.isEmpty()){
                String fileName = img.getOriginalFilename();
                String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath()+ "static/image/news";
                folderPath = URLDecoder.decode(folderPath, "UTF-8");
                File folder = new File(folderPath);
                if(!folder.exists()){
                    folder.mkdirs();
                }
                File dest = new File(folderPath +"/" + fileName);
                img.transferTo(dest);
                String imageUrl = fileRootPath + "/image/news/"+fileName;
                news.setNewsImage(imageUrl);
            }
            if(type.equals("save")){
                news.setNewsStatus(NewsEnum.SAVE.getNewsStatus());
            }
            if(type.equals("release")){
                news.setNewsStatus(NewsEnum.RELEASE.getNewsStatus());
            }
            news.setNewsAuthor(session.getAttribute("loginUser").toString());
            news.setNewsVisit(0L);
            newsService.saveNews(news);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "添加失败");
        }
    }

    /**
     * 新闻图片修改
     * @param newsImage
     * @param newsId
     * @return
     */
    @ResponseBody
    @PutMapping("/news/image/{newsId}")
    public ResultVO edit(@RequestParam("newsImage")MultipartFile newsImage,
                         @PathVariable("newsId")Long newsId){
        if(newsImage.isEmpty()){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"上传失败，请选择文件!");
        }
        String fileName = newsImage.getOriginalFilename();
        String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath()+ "static/image/news";
        try {
            folderPath = URLDecoder.decode(folderPath, "UTF-8");
            File folder = new File(folderPath);
            if(!folder.exists()){
                folder.mkdirs();
            }
            File dest = new File(folderPath +"/" + fileName);
            newsImage.transferTo(dest);
            String imageUrl = fileRootPath + "/image/news/"+fileName;
            newsService.editNewsImage(newsId, imageUrl);
            return ResultVOUtil.success();
        }catch (IOException e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"上传失败");
        }
    }

    /**
     * 新闻修改
     * @param news
     * @param newsId
     * @param type
     * @param session
     * @return
     */
    @ResponseBody
    @PutMapping("/news/{newsId}")
    public ResultVO edit(News news, @PathVariable("newsId")Long newsId,@RequestParam(value = "type",defaultValue = "edit") String type, HttpSession session){
        news.setNewsAuthor(session.getAttribute("loginUser").toString());
        news.setNewsId(newsId);
        try{
            newsService.editNews(news, type);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"修改失败");
        }
    }

    /**
     * 新闻删除
     * @param newsId
     * @return
     */
    @ResponseBody
    @DeleteMapping("/news/{newsId}")
    public ResultVO del(@PathVariable("newsId")Long newsId){
        try{
            newsService.delNews(newsId);
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"删除失败");
        }
        return ResultVOUtil.success();
    }

    /**
     * 新闻添加页面
     * @param model
     * @return
     */
    @GetMapping("/news/add")
    public String newsAdd(Model model){
        List<NewsType> newsTypeList = newsTypeService.getNewsTypeList();
        model.addAttribute("newsTypeList", newsTypeList);
        return "news-add";
    }

    /**
     * 新闻列表页面
     * @return
     */
    @GetMapping("/news")
    public String news(){
        return "news-list";
    }

    @ResponseBody
    @DeleteMapping("/newsDelBatch/{id_str}")
    public ResultVO newsDelBatch(@PathVariable("id_str") String id_str){
        try{
            newsService.delBatchNews(id_str);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "删除失败");
        }
    }
}
