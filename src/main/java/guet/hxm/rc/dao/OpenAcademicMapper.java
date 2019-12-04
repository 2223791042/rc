package guet.hxm.rc.dao;

import guet.hxm.rc.entity.OpenAcademic;
import guet.hxm.rc.entity.OpenAcademicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpenAcademicMapper {
    int countByExample(OpenAcademicExample example);

    int deleteByExample(OpenAcademicExample example);

    int deleteByPrimaryKey(Long academicId);

    int insert(OpenAcademic record);

    int insertSelective(OpenAcademic record);

    List<OpenAcademic> selectByExample(OpenAcademicExample example);

    OpenAcademic selectByPrimaryKey(Long academicId);

    int updateByExampleSelective(@Param("record") OpenAcademic record, @Param("example") OpenAcademicExample example);

    int updateByExample(@Param("record") OpenAcademic record, @Param("example") OpenAcademicExample example);

    int updateByPrimaryKeySelective(OpenAcademic record);

    int updateByPrimaryKey(OpenAcademic record);
}