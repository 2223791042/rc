package guet.hxm.rc.VO;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class NewsPreviewVO {
    private String newsTitle;

    private String newsType;

    private String newsContent;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date newsTime;
}
