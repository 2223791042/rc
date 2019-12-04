package guet.hxm.rc.dao;

import guet.hxm.rc.entity.FriendLink;
import guet.hxm.rc.entity.FriendLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FriendLinkMapper {
    int countByExample(FriendLinkExample example);

    int deleteByExample(FriendLinkExample example);

    int deleteByPrimaryKey(Long linkId);

    int insert(FriendLink record);

    int insertSelective(FriendLink record);

    List<FriendLink> selectByExample(FriendLinkExample example);

    FriendLink selectByPrimaryKey(Long linkId);

    int updateByExampleSelective(@Param("record") FriendLink record, @Param("example") FriendLinkExample example);

    int updateByExample(@Param("record") FriendLink record, @Param("example") FriendLinkExample example);

    int updateByPrimaryKeySelective(FriendLink record);

    int updateByPrimaryKey(FriendLink record);
}