package guet.hxm.rc.controller;

import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.entity.Partner;
import guet.hxm.rc.service.PartnerService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/partner")
public class PartnerController {
    @Autowired
    private PartnerService partnerService;

    @ResponseBody
    @GetMapping("/list")
    public ResultVO list(){
        List<Partner> partnerList = partnerService.getPartnerList();
        return ResultVOUtil.success(partnerList);
    }
}
