package guet.hxm.rc.controller;

import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.entity.News;
import guet.hxm.rc.entity.NewsType;
import guet.hxm.rc.enums.ResultEnum;
import guet.hxm.rc.service.NewsService;
import guet.hxm.rc.service.NewsTypeService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminNewsTypeController {
    @Autowired
    private NewsTypeService newsTypeService;

    @Autowired
    private NewsService newsService;

    @ResponseBody
    @GetMapping("/newsTypeList")
    public ResultVO newsTypeList(){
        List<NewsType> newsTypeList = newsTypeService.getNewsTypeList();
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setData(newsTypeList);
        return resultVO;
    }

    @GetMapping("/newsType")
    public String newsType(){
        return "newsType-list";
    }

    @GetMapping("/newsTypeAdd")
    public String newsTypeAdd(){
        return "newsType-add";
    }

    @GetMapping("/newsType/{typeId}")
    public String newsTypeEdit(@PathVariable("typeId")Integer typeId, Model model){
        NewsType newsType = newsTypeService.getNewsType(typeId);
        model.addAttribute("newsType", newsType);
        return "newsType-edit";
    }

    @ResponseBody
    @PutMapping("/newsType/{typeId}")
    public ResultVO newsTypeEdit(@PathVariable("typeId")Integer typeId, NewsType newsType,HttpSession session){
        try{

            String loginUser = (String) session.getAttribute("loginUser");
            newsType.setTypeId(typeId);
            newsType.setTypeAuthor(loginUser);
            newsTypeService.editNewsType(newsType);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "修改失败");
        }
    }

    @ResponseBody
    @DeleteMapping("/newsType/{typeId}")
    public ResultVO newsTypeDel(@PathVariable("typeId")Integer typeId){
        List<News> newsList = newsService.getNews(typeId);
        if (newsList.size() == 0){
            try{
                newsTypeService.delNewsType(typeId);
                return ResultVOUtil.success();
            }catch (Exception e){
                return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "删除失败");
            }
        }else {
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "由于该类型已绑定新闻无法删除！");
        }
    }

    @ResponseBody
    @GetMapping("/newsType/checkTypeName/{typeName}")
    public ResultVO checkTypeName(@PathVariable("typeName")String typeName){
        NewsType newsType = newsTypeService.getNewsType(typeName);
        if (newsType != null){
            return ResultVOUtil.success();
        }
        return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "分类名重复");
    }

    @ResponseBody
    @PostMapping("/newsType")
    public ResultVO newsType(NewsType newsType, HttpSession session){
        try{
            String loginUser = (String) session.getAttribute("loginUser");
            newsType.setTypeAuthor(loginUser);
            newsTypeService.saveNewsType(newsType);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "添加失败");
        }
    }
}
