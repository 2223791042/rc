package guet.hxm.rc.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.entity.Image;
import guet.hxm.rc.enums.ImageEnum;
import guet.hxm.rc.enums.ResultEnum;
import guet.hxm.rc.service.ImageService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminImageController {
    @Autowired
    private ImageService imageService;

    @Value("${fileRootPath}")
    private String fileRootPath;

    /**
     * 轮播添加页面
     * @return
     */
    @GetMapping("/lunbo/add")
    public String lunboAdd(){
        return "lunbo-add";
    }

    /**
     * 轮播图修改页面
     * @param imageId
     * @param model
     * @return
     */
    @GetMapping("/lunbo/{imageId}")
    public String edit(@PathVariable("imageId") Long imageId, Model model){
        Image image = imageService.getImage(imageId);
        model.addAttribute("image", image);
        return "lunbo-edit";
    }

    @ResponseBody
    @PutMapping("/lunbo/{imageId}")
    public ResultVO edit(@PathVariable("imageId")Long imageId, Image image, HttpSession session){
        try{
            image.setImageId(imageId);
            image.setImageAuthor(session.getAttribute("loginUser").toString());
            image.setImageTime(new Date());
            imageService.editImage(image);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"修改失败");
        }
    }

    /**
     * 删除轮播图
     * @param imageId
     * @return
     */
    @ResponseBody
    @DeleteMapping("/lunbo/{imageId}")
    public ResultVO delete(@PathVariable("imageId") Long imageId){
        //TODO
        try{
            imageService.delImage(imageId);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"删除失败");
        }
    }

    /**
     * 轮播图列表
     * @param page
     * @param limit
     * @return
     */
    @ResponseBody
    @GetMapping("/lunboList")
    public TableListVO<Image> lunboList(int page, int limit){
        PageHelper.startPage(page, limit);
        List<Image> imageList = imageService.getImageList(ImageEnum.LUNBO.getImageType());
        PageInfo pageInfo = new PageInfo(imageList);
        TableListVO<Image> tableListVO = new TableListVO<>();
        tableListVO.setCode(0L);
        tableListVO.setCount(pageInfo.getTotal());
        tableListVO.setData(imageList);
        return tableListVO;
    }

    @ResponseBody
    @PostMapping("/lunbo/add")
    public ResultVO lunboAdd(@RequestParam("imageFile")MultipartFile imageFile,Image image,
                             HttpSession session){
        if(imageFile.isEmpty()){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"上传失败，请选择文件!");
        }
        String fileName = imageFile.getOriginalFilename();
        String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath()+ "static/image/lunbo";
        try {
            folderPath = URLDecoder.decode(folderPath, "UTF-8");
            File folder = new File(folderPath);
            if(!folder.exists()){
                folder.mkdirs();
            }
            File dest = new File(folderPath +"/" + fileName);
            imageFile.transferTo(dest);
            String imageUrl = fileRootPath + "/image/lunbo/"+fileName;
            if(image.getImageIsBlank() == null){
                image.setImageIsBlank("0");
            }
            image.setImageType(ImageEnum.LUNBO.getImageType());
            image.setImageUrl(imageUrl);
            image.setImageAuthor(session.getAttribute("loginUser").toString());
            image.setImageTime(new Date());
            imageService.addImage(image);
            return ResultVOUtil.success();
        }catch (IOException e){
            e.printStackTrace();
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(),"上传失败");
        }
    }

    /**
     * 轮播图列表页面
     * @return
     */
    @GetMapping("/lunbo")
    public String lunbo(){
        return "lunbo-list";
    }
}
