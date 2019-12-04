package guet.hxm.rc.dao;

import guet.hxm.rc.entity.RecUser;
import guet.hxm.rc.entity.RecUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecUserMapper {
    int countByExample(RecUserExample example);

    int deleteByExample(RecUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(RecUser record);

    int insertSelective(RecUser record);

    List<RecUser> selectByExample(RecUserExample example);

    RecUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") RecUser record, @Param("example") RecUserExample example);

    int updateByExample(@Param("record") RecUser record, @Param("example") RecUserExample example);

    int updateByPrimaryKeySelective(RecUser record);

    int updateByPrimaryKey(RecUser record);
}