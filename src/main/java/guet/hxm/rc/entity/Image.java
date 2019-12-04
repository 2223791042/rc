package guet.hxm.rc.entity;

import java.util.Date;

public class Image {
    private Long imageId;

    private String imageName;

    private String imageUrl;

    private String imageUrlAddr;

    private String imageType;

    private Integer imageOrder;

    private String imageDesc;

    private String imageAuthor;

    private Date imageTime;

    private String imageIsBlank;

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getImageUrlAddr() {
        return imageUrlAddr;
    }

    public void setImageUrlAddr(String imageUrlAddr) {
        this.imageUrlAddr = imageUrlAddr == null ? null : imageUrlAddr.trim();
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType == null ? null : imageType.trim();
    }

    public Integer getImageOrder() {
        return imageOrder;
    }

    public void setImageOrder(Integer imageOrder) {
        this.imageOrder = imageOrder;
    }

    public String getImageDesc() {
        return imageDesc;
    }

    public void setImageDesc(String imageDesc) {
        this.imageDesc = imageDesc == null ? null : imageDesc.trim();
    }

    public String getImageAuthor() {
        return imageAuthor;
    }

    public void setImageAuthor(String imageAuthor) {
        this.imageAuthor = imageAuthor == null ? null : imageAuthor.trim();
    }

    public Date getImageTime() {
        return imageTime;
    }

    public void setImageTime(Date imageTime) {
        this.imageTime = imageTime;
    }

    public String getImageIsBlank() {
        return imageIsBlank;
    }

    public void setImageIsBlank(String imageIsBlank) {
        this.imageIsBlank = imageIsBlank == null ? null : imageIsBlank.trim();
    }
}