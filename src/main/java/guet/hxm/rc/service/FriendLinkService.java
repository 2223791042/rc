package guet.hxm.rc.service;

import guet.hxm.rc.entity.FriendLink;

import java.util.List;

public interface FriendLinkService {
    List<FriendLink> getFriendLinkList(String linkName);

    FriendLink getFriendLink(String linkName);

    void saveFriendLink(FriendLink friendLink);

    FriendLink getFriendLink(Long linkId);

    void editFriendLink(FriendLink friendLink);

    void delFriendLink(Long linkId);

    void delBatchFriendLink(String id_str);

    List<FriendLink> getFriendLink();
}
