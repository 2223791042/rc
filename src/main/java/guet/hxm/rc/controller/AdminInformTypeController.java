package guet.hxm.rc.controller;

import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.entity.Inform;
import guet.hxm.rc.entity.InformType;
import guet.hxm.rc.enums.ResultEnum;
import guet.hxm.rc.service.InformService;
import guet.hxm.rc.service.InformTypeService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminInformTypeController {

    @Autowired
    private InformService informService;

    @Autowired
    private InformTypeService informTypeService;

    @ResponseBody
    @GetMapping("/informTypeList")
    public ResultVO newsTypeList(){
        List<InformType> informTypeList = informTypeService.getInformTypeList();
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setData(informTypeList);
        return resultVO;
    }

    @GetMapping("/informType")
    public String informType(){
        return "informType-list";
    }

    @GetMapping("/informTypeAdd")
    public String informTypeAdd(){
        return "informType-add";
    }

    @GetMapping("/informType/{typeId}")
    public String informTypeEdit(@PathVariable("typeId")Integer typeId, Model model){
        InformType informType = informTypeService.getInformType(typeId);
        model.addAttribute("informType", informType);
        return "informType-edit";
    }

    @ResponseBody
    @PutMapping("/informType/{typeId}")
    public ResultVO informTypeEdit(@PathVariable("typeId")Integer typeId, InformType informType,HttpSession session){
        try{

            String loginUser = (String) session.getAttribute("loginUser");
            informType.setTypeId(typeId);
            informType.setTypeAuthor(loginUser);
            informTypeService.editInformType(informType);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "修改失败");
        }
    }

    @ResponseBody
    @DeleteMapping("/informType/{typeId}")
    public ResultVO informTypeDel(@PathVariable("typeId")Integer typeId){
        List<Inform> informList = informService.getInform(typeId);
        if (informList.size() == 0){
            try{
                informTypeService.delInformType(typeId);
                return ResultVOUtil.success();
            }catch (Exception e){
                return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "删除失败");
            }
        }else {
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "由于该类型已绑定通知无法删除！");
        }
    }

    @ResponseBody
    @GetMapping("/informType/checkTypeName/{typeName}")
    public ResultVO checkTypeName(@PathVariable("typeName")String typeName){
        InformType informType = informTypeService.getInformType(typeName);
        if (informType != null){
            return ResultVOUtil.success();
        }
        return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "分类名重复");
    }

    @ResponseBody
    @PostMapping("/informType")
    public ResultVO informType(InformType informType, HttpSession session){
        try{
            String loginUser = (String) session.getAttribute("loginUser");
            informType.setTypeAuthor(loginUser);
            informTypeService.saveInformType(informType);
            return ResultVOUtil.success();
        }catch (Exception e){
            return ResultVOUtil.error(ResultEnum.FAIL.getCode(), "添加失败");
        }
    }
}
