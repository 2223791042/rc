package guet.hxm.rc.service.impl;

import guet.hxm.rc.dao.FriendLinkMapper;
import guet.hxm.rc.entity.FriendLink;
import guet.hxm.rc.entity.FriendLinkExample;
import guet.hxm.rc.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
public class FriendLinkServiceImpl implements FriendLinkService {
    @Autowired
    private FriendLinkMapper friendLinkMapper;

    @Override
    public List<FriendLink> getFriendLinkList(String linkName) {
        FriendLinkExample example = new FriendLinkExample();
        example.setOrderByClause("link_order asc");
        FriendLinkExample.Criteria criteria = example.createCriteria();
        if (linkName != null && !linkName.trim().equals("")){
            criteria.andLinkNameLike("%"+linkName+"%");
        }
        return friendLinkMapper.selectByExample(example);
    }

    @Override
    public FriendLink getFriendLink(String linkName) {
        FriendLinkExample example = new FriendLinkExample();
        FriendLinkExample.Criteria criteria = example.createCriteria();
        criteria.andLinkNameEqualTo(linkName);
        List<FriendLink> friendLinkList = friendLinkMapper.selectByExample(example);
        if(friendLinkList.size() != 0){
            return friendLinkList.get(0);
        }
        return null;
    }

    @Transactional
    @Override
    public void saveFriendLink(FriendLink friendLink) {
        friendLinkMapper.insertSelective(friendLink);
    }

    @Override
    public FriendLink getFriendLink(Long linkId) {
        return friendLinkMapper.selectByPrimaryKey(linkId);
    }

    @Transactional
    @Override
    public void editFriendLink(FriendLink friendLink) {
        friendLinkMapper.updateByPrimaryKeySelective(friendLink);
    }

    @Transactional
    @Override
    public void delFriendLink(Long linkId) {
        friendLinkMapper.deleteByPrimaryKey(linkId);
    }

    @Transactional
    @Override
    public void delBatchFriendLink(String id_str) {
        String[] ids = id_str.split(",");
        ArrayList<Long> idList = new ArrayList<>();
        for (String id : ids){
            idList.add(Long.parseLong(id));
        }
        FriendLinkExample example = new FriendLinkExample();
        FriendLinkExample.Criteria criteria = example.createCriteria();
        criteria.andLinkIdIn(idList);
        friendLinkMapper.deleteByExample(example);
    }

    @Override
    public List<FriendLink> getFriendLink() {
        return friendLinkMapper.selectByExample(null);
    }
}
