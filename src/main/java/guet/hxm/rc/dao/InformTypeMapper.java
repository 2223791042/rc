package guet.hxm.rc.dao;

import guet.hxm.rc.entity.InformType;
import guet.hxm.rc.entity.InformTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InformTypeMapper {
    int countByExample(InformTypeExample example);

    int deleteByExample(InformTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(InformType record);

    int insertSelective(InformType record);

    List<InformType> selectByExample(InformTypeExample example);

    InformType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") InformType record, @Param("example") InformTypeExample example);

    int updateByExample(@Param("record") InformType record, @Param("example") InformTypeExample example);

    int updateByPrimaryKeySelective(InformType record);

    int updateByPrimaryKey(InformType record);
}