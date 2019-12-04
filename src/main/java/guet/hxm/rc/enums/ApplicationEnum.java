package guet.hxm.rc.enums;

import lombok.Getter;

@Getter
public enum ApplicationEnum {
    SAVE("0", "保存"),

    SUBMIT("1", "提交"),
    ;

    private String applicationStatus;

    private String message;

    ApplicationEnum(String applicationStatus, String message) {
        this.applicationStatus = applicationStatus;
        this.message = message;
    }
}
