package guet.hxm.rc.VO;

import guet.hxm.rc.entity.News;
import lombok.Data;

@Data
public class NewsPageVO {
    private News preNews;
    private News nextNews;
}
