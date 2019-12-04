package guet.hxm.rc.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.InformPageVO;
import guet.hxm.rc.VO.ResultVO;
import guet.hxm.rc.VO.TableListVO;
import guet.hxm.rc.dto.InformDTO;
import guet.hxm.rc.entity.Inform;
import guet.hxm.rc.enums.InformEnum;
import guet.hxm.rc.service.InformService;
import guet.hxm.rc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/inform")
public class InformController {
    @Autowired
    private InformService informService;

    @ResponseBody
    @GetMapping("/list")
    public TableListVO<InformDTO> list(@RequestParam(value = "page",defaultValue = "1") int page, @RequestParam(value = "limit",defaultValue = "5") int limit) {
        PageHelper.startPage(page, limit);
        Map<String, Object> map = informService.getInformDTOList(InformEnum.RELEASE.getInformStatus());
        PageInfo pageInfo = (PageInfo) map.get("pageInfo");
        List<InformDTO> informDTOList = (List<InformDTO>)map.get("informDTOList");
        return new TableListVO<>(pageInfo.getTotal(), informDTOList);
    }

    @ResponseBody
    @GetMapping("/searchList")
    public TableListVO<InformDTO> searchList(int page, int limit, HttpServletRequest request) {
        PageHelper.startPage(page, limit);
        String key = request.getParameter("key");
        Map<String, Object> map = informService.getInformDTOList(InformEnum.RELEASE.getInformStatus(), key);
        PageInfo pageInfo = (PageInfo) map.get("pageInfo");
        List<InformDTO> informDTOList = (List<InformDTO>)map.get("informDTOList");
        return new TableListVO<>(pageInfo.getTotal(), informDTOList);
    }

    @ResponseBody
    @GetMapping("/{informId}")
    public ResultVO<InformDTO> inform(@PathVariable("informId")Long informId){
        informService.increaseVisit(informId);
        InformDTO informDTO = informService.getInformDTO(informId, InformEnum.RELEASE.getInformStatus());
        return ResultVOUtil.success(informDTO);
    }

    @ResponseBody
    @GetMapping("/page/{informId}")
    public ResultVO<InformPageVO> page(@PathVariable("informId")Long informId){
        List<Inform> informList = informService.getInformList(InformEnum.RELEASE.getInformStatus());
        InformPageVO pageVO = new InformPageVO();
        for(int i = 0; i < informList.size(); i++){
            Inform inform = informList.get(i);
            if(inform.getInformId() == informId){
                if(i-1 >= 0){
                    pageVO.setPreInform(informList.get(i - 1));
                }
                if(i + 1 < informList.size()){
                    pageVO.setNextInform(informList.get(i + 1));
                }
                break;
            }
        }
        return ResultVOUtil.success(pageVO);
    }

}
