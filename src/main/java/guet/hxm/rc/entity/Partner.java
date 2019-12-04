package guet.hxm.rc.entity;

public class Partner {
    private Long partnerId;

    private String partnerName;

    private String partnerLinkAddr;

    private String partnerIsBlank;

    private String partnerImg;

    public Long getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName == null ? null : partnerName.trim();
    }

    public String getPartnerLinkAddr() {
        return partnerLinkAddr;
    }

    public void setPartnerLinkAddr(String partnerLinkAddr) {
        this.partnerLinkAddr = partnerLinkAddr == null ? null : partnerLinkAddr.trim();
    }

    public String getPartnerIsBlank() {
        return partnerIsBlank;
    }

    public void setPartnerIsBlank(String partnerIsBlank) {
        this.partnerIsBlank = partnerIsBlank == null ? null : partnerIsBlank.trim();
    }

    public String getPartnerImg() {
        return partnerImg;
    }

    public void setPartnerImg(String partnerImg) {
        this.partnerImg = partnerImg == null ? null : partnerImg.trim();
    }
}