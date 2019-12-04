package guet.hxm.rc.service;

import guet.hxm.rc.VO.InformPreviewVO;
import guet.hxm.rc.dto.InformDTO;
import guet.hxm.rc.entity.Inform;

import java.util.List;
import java.util.Map;

public interface InformService {
    Map<String,Object> getInformDTOList(String informStatus);

    void increaseVisit(Long informId);

    InformDTO getInformDTO(Long informId, String informStatus);

    List<Inform> getInformList(String informStatus);


    InformPreviewVO getInformPreviewVO(Long informId);

    InformDTO getInformDTO(Long informId);

    Inform getInform(String informTitle);

    void saveInform(Inform inform);

    void editInformImage(Long informId, String imageUrl);

    void editInform(Inform inform, String type);

    void delInform(Long informId);

    void delBatchInform(String id_str);

    List<Inform> getInform(Integer typeId);

    Map<String,Object> getInformDTOList(Long informId, String informAuthor, String informTitle, Integer informTypeId);

    Integer getCountInform();

    Map<String,Object> getInformDTOList(String informStatus, String key);
}
