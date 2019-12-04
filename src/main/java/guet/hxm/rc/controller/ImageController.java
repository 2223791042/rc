package guet.hxm.rc.controller;

import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.entity.Image;
import guet.hxm.rc.enums.ImageEnum;
import guet.hxm.rc.enums.ResultEnum;
import guet.hxm.rc.service.ImageService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/image")
public class ImageController {

    @Autowired
    private ImageService imageService;

    /**
     * 获取轮播图
     * @return
     */
    @ResponseBody
    @RequestMapping("/lunbo")
    public ResultVO<List<Image>> lunbo(){
        List<Image> imageList = imageService.getImageList(ImageEnum.LUNBO.getImageType());
        return ResultVOUtil.success(imageList);
    }

}
