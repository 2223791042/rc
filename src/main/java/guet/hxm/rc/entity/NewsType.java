package guet.hxm.rc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class NewsType {
    private Integer typeId;

    private String typeName;

    private String typeAuthor;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date typeTime;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeAuthor() {
        return typeAuthor;
    }

    public void setTypeAuthor(String typeAuthor) {
        this.typeAuthor = typeAuthor == null ? null : typeAuthor.trim();
    }

    public Date getTypeTime() {
        return typeTime;
    }

    public void setTypeTime(Date typeTime) {
        this.typeTime = typeTime;
    }
}