package guet.hxm.rc.service.impl;

import guet.hxm.rc.dao.PartnerMapper;
import guet.hxm.rc.entity.Partner;
import guet.hxm.rc.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PartnerServiceImpl implements PartnerService {
    @Autowired
    private PartnerMapper partnerMapper;

    @Override
    public List<Partner> getPartnerList() {
        return partnerMapper.selectByExample(null);
    }

    @Transactional
    @Override
    public void delPartner(Long partnerId) {
        partnerMapper.deleteByPrimaryKey(partnerId);
    }

    @Transactional
    @Override
    public void savePartner(Partner partner) {
        partnerMapper.insertSelective(partner);
    }

    @Transactional
    @Override
    public void editPartner(Partner partner) {
        partnerMapper.updateByPrimaryKeySelective(partner);
    }

    @Override
    public Partner getPartner(Long partnerId) {
        return partnerMapper.selectByPrimaryKey(partnerId);
    }
}
