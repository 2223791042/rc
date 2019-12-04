package guet.hxm.rc.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import guet.hxm.rc.entity.NewsType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class NewsDTO {
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

    private NewsType newsType;
}
