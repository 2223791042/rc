package guet.hxm.rc.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import guet.hxm.rc.entity.InformType;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class InformDTO {
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

    private InformType informType;
}
