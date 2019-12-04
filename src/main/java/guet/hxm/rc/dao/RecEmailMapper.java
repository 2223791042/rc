package guet.hxm.rc.dao;

import guet.hxm.rc.entity.RecEmail;
import guet.hxm.rc.entity.RecEmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecEmailMapper {
    int countByExample(RecEmailExample example);

    int deleteByExample(RecEmailExample example);

    int deleteByPrimaryKey(Long emailId);

    int insert(RecEmail record);

    int insertSelective(RecEmail record);

    List<RecEmail> selectByExample(RecEmailExample example);

    RecEmail selectByPrimaryKey(Long emailId);

    int updateByExampleSelective(@Param("record") RecEmail record, @Param("example") RecEmailExample example);

    int updateByExample(@Param("record") RecEmail record, @Param("example") RecEmailExample example);

    int updateByPrimaryKeySelective(RecEmail record);

    int updateByPrimaryKey(RecEmail record);
}