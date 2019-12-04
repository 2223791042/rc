package guet.hxm.rc.dao;

import guet.hxm.rc.entity.Partner;
import guet.hxm.rc.entity.PartnerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartnerMapper {
    int countByExample(PartnerExample example);

    int deleteByExample(PartnerExample example);

    int deleteByPrimaryKey(Long partnerId);

    int insert(Partner record);

    int insertSelective(Partner record);

    List<Partner> selectByExample(PartnerExample example);

    Partner selectByPrimaryKey(Long partnerId);

    int updateByExampleSelective(@Param("record") Partner record, @Param("example") PartnerExample example);

    int updateByExample(@Param("record") Partner record, @Param("example") PartnerExample example);

    int updateByPrimaryKeySelective(Partner record);

    int updateByPrimaryKey(Partner record);
}