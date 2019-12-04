package guet.hxm.rc.enums;

import lombok.Getter;

@Getter
public enum ImageEnum {
    LUNBO("1", "轮播图"),
    ;

    private String imageType;

    private String message;

    ImageEnum(String imageType, String message) {
        this.imageType = imageType;
        this.message = message;
    }
}
