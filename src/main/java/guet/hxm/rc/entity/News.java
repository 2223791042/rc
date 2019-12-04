package guet.hxm.rc.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class News {
    private Long newsId;

    private String newsImage;

    private String newsTitle;

    private Integer newsTypeId;

    private String newsContent;

    private String newsAuthor;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date newsTime;

    private String newsStatus;

    private Long newsVisit;

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public String getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(String newsImage) {
        this.newsImage = newsImage == null ? null : newsImage.trim();
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public Integer getNewsTypeId() {
        return newsTypeId;
    }

    public void setNewsTypeId(Integer newsTypeId) {
        this.newsTypeId = newsTypeId;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor == null ? null : newsAuthor.trim();
    }

    public Date getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(Date newsTime) {
        this.newsTime = newsTime;
    }

    public String getNewsStatus() {
        return newsStatus;
    }

    public void setNewsStatus(String newsStatus) {
        this.newsStatus = newsStatus == null ? null : newsStatus.trim();
    }

    public Long getNewsVisit() {
        return newsVisit;
    }

    public void setNewsVisit(Long newsVisit) {
        this.newsVisit = newsVisit;
    }
}