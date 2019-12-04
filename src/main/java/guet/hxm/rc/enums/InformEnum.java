package guet.hxm.rc.enums;

import lombok.Getter;

@Getter
public enum InformEnum {

    SAVE("0", "保存"),

    RELEASE("1", "发布"),
    ;

    private String informStatus;

    private String message;

    InformEnum(String informStatus, String message) {
        this.informStatus = informStatus;
        this.message = message;
    }
}