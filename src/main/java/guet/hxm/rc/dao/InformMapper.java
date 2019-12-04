package guet.hxm.rc.dao;

import guet.hxm.rc.entity.Inform;
import guet.hxm.rc.entity.InformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InformMapper {
    int countByExample(InformExample example);

    int deleteByExample(InformExample example);

    int deleteByPrimaryKey(Long informId);

    int insert(Inform record);

    int insertSelective(Inform record);

    List<Inform> selectByExample(InformExample example);

    Inform selectByPrimaryKey(Long informId);

    int updateByExampleSelective(@Param("record") Inform record, @Param("example") InformExample example);

    int updateByExample(@Param("record") Inform record, @Param("example") InformExample example);

    int updateByPrimaryKeySelective(Inform record);

    int updateByPrimaryKey(Inform record);
}