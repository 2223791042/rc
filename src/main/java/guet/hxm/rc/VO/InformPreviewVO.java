package guet.hxm.rc.VO;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class InformPreviewVO {
    private String informTitle;

    private String informType;

    private String informContent;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date informTime;
}
