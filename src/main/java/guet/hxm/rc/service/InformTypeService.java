package guet.hxm.rc.service;

import guet.hxm.rc.entity.InformType;

import java.util.List;

public interface InformTypeService {
    List<InformType> getInformTypeList();

    InformType getInformType(Integer typeId);

    void editInformType(InformType informType);

    void delInformType(Integer typeId);

    InformType getInformType(String typeName);

    void saveInformType(InformType informType);
}
