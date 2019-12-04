package guet.hxm.rc.service;

import guet.hxm.rc.entity.Partner;

import java.util.List;

public interface PartnerService {
    List<Partner> getPartnerList();

    void delPartner(Long partnerId);

    void savePartner(Partner partner);

    void editPartner(Partner partner);

    Partner getPartner(Long partnerId);
}
