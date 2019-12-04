package guet.hxm.rc.service.impl;

import com.github.pagehelper.PageInfo;
import guet.hxm.rc.VO.InformPreviewVO;
import guet.hxm.rc.dao.InformMapper;
import guet.hxm.rc.dao.InformTypeMapper;
import guet.hxm.rc.dto.InformDTO;
import guet.hxm.rc.entity.Inform;
import guet.hxm.rc.entity.InformExample;
import guet.hxm.rc.entity.InformType;
import guet.hxm.rc.enums.InformEnum;
import guet.hxm.rc.service.InformService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InformServiceImpl implements InformService {
    @Autowired
    private InformTypeMapper informTypeMapper;

    @Autowired
    private InformMapper informMapper;

    @Override
    public Map<String, Object> getInformDTOList(String informStatus) {
        InformExample informExample = new InformExample();
        informExample.setOrderByClause("inform_time desc");
        InformExample.Criteria criteria = informExample.createCriteria();
        criteria.andInformStatusEqualTo(informStatus);
        List<Inform> informList = informMapper.selectByExample(informExample);
        PageInfo pageInfo = new PageInfo<>(informList);
        List<InformDTO> informDTOList = new ArrayList<>();
        for (Inform inform : informList){
            InformDTO informDTO = new InformDTO();
            BeanUtils.copyProperties(inform, informDTO);
            InformType informType = informTypeMapper.selectByPrimaryKey(inform.getInformTypeId());
            informDTO.setInformType(informType);
            informDTOList.add(informDTO);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("informDTOList", informDTOList);
        map.put("pageInfo", pageInfo);
        return map;
    }

    @Override
    public void increaseVisit(Long informId) {
        Inform inform = informMapper.selectByPrimaryKey(informId);
        inform.setInformVisit(inform.getInformVisit() + 1);
        informMapper.updateByPrimaryKeySelective(inform);
    }

    @Override
    public InformDTO getInformDTO(Long informId, String informStatus) {
        InformExample informExample = new InformExample();
        InformExample.Criteria criteria = informExample.createCriteria();
        criteria.andInformIdEqualTo(informId);
        criteria.andInformStatusEqualTo(informStatus);
        List<Inform> informList = informMapper.selectByExample(informExample);
        if (informList.size() != 0){
            Inform inform = informList.get(0);
            InformDTO informDTO = new InformDTO();
            BeanUtils.copyProperties(inform, informDTO);
            InformType informType = informTypeMapper.selectByPrimaryKey(inform.getInformTypeId());
            informDTO.setInformType(informType);
            return informDTO;
        }
        return null;
    }

    @Override
    public List<Inform> getInformList(String informStatus) {
        InformExample informExample = new InformExample();
        informExample.setOrderByClause("inform_time desc");
        InformExample.Criteria criteria = informExample.createCriteria();
        criteria.andInformStatusEqualTo(informStatus);
        return informMapper.selectByExample(informExample);
    }

    @Override
    public Map<String, Object> getInformDTOList(Long informId, String informAuthor, String informTitle, Integer informTypeId) {
        InformExample informExample = new InformExample();
        InformExample.Criteria criteria = informExample.createCriteria();
        if (informId != null){
            criteria.andInformIdEqualTo(informId);
        }
        if(informAuthor != null && !informAuthor.trim().equals("")){
            criteria.andInformAuthorLike("%"+informAuthor+"%");
        }
        if(informTitle != null && !informTitle.trim().equals("")){
            criteria.andInformTitleLike("%"+informTitle+"%");
        }
        if(informTypeId != null){
            criteria.andInformTypeIdEqualTo(informTypeId);
        }
        informExample.setOrderByClause("inform_time desc");
        List<Inform> informList = informMapper.selectByExample(informExample);
        PageInfo pageInfo = new PageInfo<>(informList);
        List<InformDTO> informDTOList = new ArrayList<>();
        for(Inform inform : informList){
            InformDTO informDTO = new InformDTO();
            BeanUtils.copyProperties(inform, informDTO);
            InformType informType = informTypeMapper.selectByPrimaryKey(inform.getInformTypeId());
            informDTO.setInformType(informType);
            informDTOList.add(informDTO);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("informDTOList", informDTOList);
        map.put("pageInfo", pageInfo);
        return map;
    }

    @Override
    public InformPreviewVO getInformPreviewVO(Long informId) {
        Inform inform = informMapper.selectByPrimaryKey(informId);
        InformType informType = informTypeMapper.selectByPrimaryKey(inform.getInformTypeId());
        InformPreviewVO previewVO = new InformPreviewVO();
        BeanUtils.copyProperties(inform, previewVO);
        previewVO.setInformType(informType.getTypeName());
        return previewVO;
    }

    @Override
    public InformDTO getInformDTO(Long informId) {
        Inform inform = informMapper.selectByPrimaryKey(informId);
        InformType informType = informTypeMapper.selectByPrimaryKey(inform.getInformTypeId());
        InformDTO informDTO = new InformDTO();
        BeanUtils.copyProperties(inform, informDTO);
        informDTO.setInformType(informType);
        return informDTO;
    }

    @Override
    public Inform getInform(String informTitle) {
        InformExample example = new InformExample();
        InformExample.Criteria criteria = example.createCriteria();
        criteria.andInformTitleEqualTo(informTitle);
        List<Inform> informList = informMapper.selectByExample(example);
        if(informList.size() != 0){
            return informList.get(0);
        }
        return null;
    }

    @Transactional
    @Override
    public void saveInform(Inform inform) {
        informMapper.insertSelective(inform);
    }

    @Transactional
    @Override
    public void editInformImage(Long informId, String imageUrl) {
        Inform inform = new Inform();
        inform.setInformId(informId);
        inform.setInformImage(imageUrl);
        informMapper.updateByPrimaryKeySelective(inform);
    }

    @Transactional
    @Override
    public void editInform(Inform inform, String type) {
        if(type.equals("save")){
            inform.setInformStatus(InformEnum.SAVE.getInformStatus());
        }
        if (type.equals("release")){
            inform.setInformStatus(InformEnum.RELEASE.getInformStatus());
        }
        informMapper.updateByPrimaryKeySelective(inform);
    }

    @Transactional
    @Override
    public void delInform(Long informId) {
        informMapper.deleteByPrimaryKey(informId);
    }

    @Transactional
    @Override
    public void delBatchInform(String id_str) {
        String[] ids = id_str.split(",");
        ArrayList<Long> idList = new ArrayList<>();
        for (String id : ids){
            idList.add(Long.parseLong(id));
        }
        InformExample example = new InformExample();
        InformExample.Criteria criteria = example.createCriteria();
        criteria.andInformIdIn(idList);
        informMapper.deleteByExample(example);
    }

    @Override
    public List<Inform> getInform(Integer typeId) {
        InformExample example = new InformExample();
        InformExample.Criteria criteria = example.createCriteria();
        criteria.andInformTypeIdEqualTo(typeId);
        return informMapper.selectByExample(example);
    }

    @Override
    public Integer getCountInform() {
        List<Inform> informList = informMapper.selectByExample(null);
        Long totalCount = 0L;
        for (Inform inform : informList){
            totalCount += inform.getInformVisit();
        }
        return totalCount.intValue();
    }

    @Override
    public Map<String, Object> getInformDTOList(String informStatus, String key) {
        InformExample informExample = new InformExample();
        informExample.setOrderByClause("inform_time desc");
        InformExample.Criteria criteria = informExample.createCriteria();
        if (key != null && !key.trim().equals("")){
            criteria.andInformTitleLike("%"+key+"%");
        }
        criteria.andInformStatusEqualTo(informStatus);
        List<Inform> informList = informMapper.selectByExample(informExample);
        PageInfo pageInfo = new PageInfo<>(informList);
        List<InformDTO> informDTOList = new ArrayList<>();
        for (Inform inform : informList){
            InformDTO informDTO = new InformDTO();
            BeanUtils.copyProperties(inform, informDTO);
            InformType informType = informTypeMapper.selectByPrimaryKey(inform.getInformTypeId());
            informDTO.setInformType(informType);
            informDTOList.add(informDTO);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("informDTOList", informDTOList);
        map.put("pageInfo", pageInfo);
        return map;
    }
}
