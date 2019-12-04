package guet.hxm.rc.enums;

import lombok.Getter;

@Getter
public enum StudentEnum {

    SAVE("0", "保存"),

    RELEASE("1", "发布"),
    ;

    private String studentStatus;

    private String message;

    StudentEnum(String studentStatus, String message) {
        this.studentStatus = studentStatus;
        this.message = message;
    }
}