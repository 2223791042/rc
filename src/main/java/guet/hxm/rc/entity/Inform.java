package guet.hxm.rc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Inform {
    private Long informId;

    private String informImage;

    private String informTitle;

    private Integer informTypeId;

    private String informContent;

    private String informAuthor;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date informTime;

    private String informStatus;

    private Long informVisit;

    public Long getInformId() {
        return informId;
    }

    public void setInformId(Long informId) {
        this.informId = informId;
    }

    public String getInformImage() {
        return informImage;
    }

    public void setInformImage(String informImage) {
        this.informImage = informImage == null ? null : informImage.trim();
    }

    public String getInformTitle() {
        return informTitle;
    }

    public void setInformTitle(String informTitle) {
        this.informTitle = informTitle == null ? null : informTitle.trim();
    }

    public Integer getInformTypeId() {
        return informTypeId;
    }

    public void setInformTypeId(Integer informTypeId) {
        this.informTypeId = informTypeId;
    }

    public String getInformContent() {
        return informContent;
    }

    public void setInformContent(String informContent) {
        this.informContent = informContent == null ? null : informContent.trim();
    }

    public String getInformAuthor() {
        return informAuthor;
    }

    public void setInformAuthor(String informAuthor) {
        this.informAuthor = informAuthor == null ? null : informAuthor.trim();
    }

    public Date getInformTime() {
        return informTime;
    }

    public void setInformTime(Date informTime) {
        this.informTime = informTime;
    }

    public String getInformStatus() {
        return informStatus;
    }

    public void setInformStatus(String informStatus) {
        this.informStatus = informStatus == null ? null : informStatus.trim();
    }

    public Long getInformVisit() {
        return informVisit;
    }

    public void setInformVisit(Long informVisit) {
        this.informVisit = informVisit;
    }
}