package guet.hxm.rc.enums;

import lombok.Getter;

@Getter
public enum TeacherEnum {

    SAVE("0", "保存"),

    RELEASE("1", "发布"),
    ;

    private String teacherStatus;

    private String message;

    TeacherEnum(String teacherStatus, String message) {
        this.teacherStatus = teacherStatus;
        this.message = message;
    }
}