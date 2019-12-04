package guet.hxm.rc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.entity.Partner;
import guet.hxm.rc.enums.ResultEnum;
import guet.hxm.rc.service.PartnerService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.net.URLDecoder;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminPartnerController {
    @Autowired
    private PartnerService partnerService;

    @Value("${fileRootPath}")
    private String fileRootPath;

    @GetMapping("/partner")
    public String partner(){
        return "partner-list";
    }

    @ResponseBody
    @GetMapping("/partnerList")
    public TableListVO<Partner> partnerList(int page, int limit){
        PageHelper.startPage(page, limit);
        List<Partner> partnerList = partnerService.getPartnerList();
        PageInfo<Partner> pageInfo = new PageInfo<>(partnerList);
        return new TableListVO<>(pageInfo.getTotal(), partnerList);
    }

    @GetMapping("/partnerAdd")
    public String partnerAdd(){
        return "partner-add";
    }

    @ResponseBody
    @DeleteMapping("/partner/{partnerId}")
    public ResultVO studentDel(@PathVariable("partnerId")Long partnerId){
        try{
            partnerService.delPartner(partnerId);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "删除失败");
        }
    }

    @ResponseBody
    @PutMapping("/partner/{partnerId}")
    public ResultVO partnerEdit(@PathVariable("partnerId")Long partnerId, @RequestParam("imageFile")MultipartFile imageFile, Partner partner) {
        partner.setPartnerId(partnerId);
        try {
            if (!imageFile.isEmpty()) {
                String fileName = imageFile.getOriginalFilename();
                String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/image/partner";
                folderPath = URLDecoder.decode(folderPath, "UTF-8");
                File folder = new File(folderPath);
                if (!folder.exists()) {
                    folder.mkdirs();
                }
                File dest = new File(folderPath + "/" + fileName);
                imageFile.transferTo(dest);
                String imageUrl = fileRootPath + "/image/partner/" + fileName;
                partner.setPartnerImg(imageUrl);
            }
            if (partner.getPartnerIsBlank() == null) {
                partner.setPartnerIsBlank("N");
            }
            partnerService.editPartner(partner);
            return ResultVOUtil.success();
        } catch (Exception e) {
            return ResultVOUtil.fail("修改失败");
        }
    }

    @GetMapping("/partner/{partnerId}")
    public String partnerEdit(@PathVariable("partnerId")Long partnerId, Model model){
        Partner partner = partnerService.getPartner(partnerId);
        model.addAttribute("partner", partner);
        return "partner-edit";
    }

    @ResponseBody
    @PostMapping("/partner")
    public ResultVO partnerAdd(@RequestParam("imageFile")MultipartFile imageFile, Partner partner) {
        try {
            String fileName = imageFile.getOriginalFilename();
            String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/image/partner";
            folderPath = URLDecoder.decode(folderPath, "UTF-8");
            File folder = new File(folderPath);
            if (!folder.exists()) {
                folder.mkdirs();
            }
            File dest = new File(folderPath + "/" + fileName);
            imageFile.transferTo(dest);
            String imageUrl = fileRootPath + "/image/partner/" + fileName;
            partner.setPartnerImg(imageUrl);
            if (partner.getPartnerIsBlank() == null) {
                partner.setPartnerIsBlank("N");
            }
            partnerService.savePartner(partner);
            return ResultVOUtil.success();
        } catch (Exception e) {
            return ResultVOUtil.fail("添加失败");
        }
    }
}
