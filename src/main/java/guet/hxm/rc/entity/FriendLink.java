package guet.hxm.rc.entity;

import java.util.Date;

public class FriendLink {
    private Long linkId;

    private String linkName;

    private String linkImage;

    private String linkUrl;

    private String isBlank;

    private Date addTime;

    private Integer linkOrder;

    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage == null ? null : linkImage.trim();
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    public String getIsBlank() {
        return isBlank;
    }

    public void setIsBlank(String isBlank) {
        this.isBlank = isBlank == null ? null : isBlank.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getLinkOrder() {
        return linkOrder;
    }

    public void setLinkOrder(Integer linkOrder) {
        this.linkOrder = linkOrder;
    }
}