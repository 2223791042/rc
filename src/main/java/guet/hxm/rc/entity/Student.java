package guet.hxm.rc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Student {
    private Long studentId;

    private String studentName;

    private String graduationSchool;

    private String researchField;

    private String belongGrade;

    private String studentIcon;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date uploadTime;

    private String studentStatus;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getGraduationSchool() {
        return graduationSchool;
    }

    public void setGraduationSchool(String graduationSchool) {
        this.graduationSchool = graduationSchool == null ? null : graduationSchool.trim();
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField == null ? null : researchField.trim();
    }

    public String getBelongGrade() {
        return belongGrade;
    }

    public void setBelongGrade(String belongGrade) {
        this.belongGrade = belongGrade == null ? null : belongGrade.trim();
    }

    public String getStudentIcon() {
        return studentIcon;
    }

    public void setStudentIcon(String studentIcon) {
        this.studentIcon = studentIcon == null ? null : studentIcon.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus == null ? null : studentStatus.trim();
    }
}