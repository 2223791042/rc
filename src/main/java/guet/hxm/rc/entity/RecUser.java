package guet.hxm.rc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RecUser {
    private Long userId;

    private String email;

    private String password;

    private String name;

    private String sex;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    private String cardId;

    private String graduateSch;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getGraduateSch() {
        return graduateSch;
    }

    public void setGraduateSch(String graduateSch) {
        this.graduateSch = graduateSch == null ? null : graduateSch.trim();
    }
}