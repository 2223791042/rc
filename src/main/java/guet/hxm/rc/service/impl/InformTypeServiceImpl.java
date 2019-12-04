package guet.hxm.rc.service.impl;

import guet.hxm.rc.dao.InformMapper;
import guet.hxm.rc.dao.InformTypeMapper;
import guet.hxm.rc.entity.InformType;
import guet.hxm.rc.entity.InformTypeExample;
import guet.hxm.rc.service.InformTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InformTypeServiceImpl implements InformTypeService {
    @Autowired
    private InformTypeMapper informTypeMapper;

    @Autowired
    private InformMapper informMapper;

    @Override
    public List<InformType> getInformTypeList() {
        return informTypeMapper.selectByExample(null);
    }

    @Override
    public InformType getInformType(Integer typeId) {
        return informTypeMapper.selectByPrimaryKey(typeId);
    }

    @Transactional
    @Override
    public void editInformType(InformType informType) {
        informTypeMapper.updateByPrimaryKeySelective(informType);
    }

    @Transactional
    @Override
    public void delInformType(Integer typeId) {
        informTypeMapper.deleteByPrimaryKey(typeId);
    }

    @Override
    public InformType getInformType(String typeName) {
        InformTypeExample example = new InformTypeExample();
        InformTypeExample.Criteria criteria = example.createCriteria();
        criteria.andTypeNameEqualTo(typeName);
        List<InformType> informTypeList = informTypeMapper.selectByExample(example);
        if (informTypeList.size() != 0){
            return informTypeList.get(0);
        }
        return null;
    }

    @Transactional
    @Override
    public void saveInformType(InformType informType) {
        informTypeMapper.insertSelective(informType);
    }
}
