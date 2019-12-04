package guet.hxm.rc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
//数据库对应实体映射包
public class Application {
    private Long applicationId;

    private String name;

    private String sex;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    private String nation;

    private String nativeAdd;

    private String domicile;

    private String cardId;

    private String homeAdd;

    private String email;

    private String telephone;

    private String agentName;

    private String agentRelative;

    private String agentTelephone;

    private String academicAchi;

    private String onlineData;

    private String introduce;

    private String school;

    private String education;

    private String researchField;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startEduTime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endEduTime;

    private String degreeStatus;

    private String degreeName;

    private String courceScore;

    private String mainLanguage;

    private String languageName;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date testTime;

    private String languageScore;

    private String projectName;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date projectStartTime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date projectEndTime;

    private String projectAdd;

    private String projectExplain;

    private String experienceType;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date experStartTime;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date experEndTime;

    private String experienceAdd;

    private String experienceExplain;

    private String honor;

    private String sanction;

    private String sanctionExpain;

    private String refereeName;

    private String refereeTelephone;

    private String refereeCompany;

    private String refereeEmail;

    private String resumeFile;

    private String academicFile;

    private String scoreFile;

    private String languageFile;

    private String degreeFile;

    private String announceName;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date announceTime;

    private String applicationStatus;

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
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

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getNativeAdd() {
        return nativeAdd;
    }

    public void setNativeAdd(String nativeAdd) {
        this.nativeAdd = nativeAdd == null ? null : nativeAdd.trim();
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile == null ? null : domicile.trim();
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getHomeAdd() {
        return homeAdd;
    }

    public void setHomeAdd(String homeAdd) {
        this.homeAdd = homeAdd == null ? null : homeAdd.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getAgentRelative() {
        return agentRelative;
    }

    public void setAgentRelative(String agentRelative) {
        this.agentRelative = agentRelative == null ? null : agentRelative.trim();
    }

    public String getAgentTelephone() {
        return agentTelephone;
    }

    public void setAgentTelephone(String agentTelephone) {
        this.agentTelephone = agentTelephone == null ? null : agentTelephone.trim();
    }

    public String getAcademicAchi() {
        return academicAchi;
    }

    public void setAcademicAchi(String academicAchi) {
        this.academicAchi = academicAchi == null ? null : academicAchi.trim();
    }

    public String getOnlineData() {
        return onlineData;
    }

    public void setOnlineData(String onlineData) {
        this.onlineData = onlineData == null ? null : onlineData.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField == null ? null : researchField.trim();
    }

    public Date getStartEduTime() {
        return startEduTime;
    }

    public void setStartEduTime(Date startEduTime) {
        this.startEduTime = startEduTime;
    }

    public Date getEndEduTime() {
        return endEduTime;
    }

    public void setEndEduTime(Date endEduTime) {
        this.endEduTime = endEduTime;
    }

    public String getDegreeStatus() {
        return degreeStatus;
    }

    public void setDegreeStatus(String degreeStatus) {
        this.degreeStatus = degreeStatus == null ? null : degreeStatus.trim();
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName == null ? null : degreeName.trim();
    }

    public String getCourceScore() {
        return courceScore;
    }

    public void setCourceScore(String courceScore) {
        this.courceScore = courceScore == null ? null : courceScore.trim();
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    public void setMainLanguage(String mainLanguage) {
        this.mainLanguage = mainLanguage == null ? null : mainLanguage.trim();
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName == null ? null : languageName.trim();
    }

    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }

    public String getLanguageScore() {
        return languageScore;
    }

    public void setLanguageScore(String languageScore) {
        this.languageScore = languageScore == null ? null : languageScore.trim();
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public Date getProjectStartTime() {
        return projectStartTime;
    }

    public void setProjectStartTime(Date projectStartTime) {
        this.projectStartTime = projectStartTime;
    }

    public Date getProjectEndTime() {
        return projectEndTime;
    }

    public void setProjectEndTime(Date projectEndTime) {
        this.projectEndTime = projectEndTime;
    }

    public String getProjectAdd() {
        return projectAdd;
    }

    public void setProjectAdd(String projectAdd) {
        this.projectAdd = projectAdd == null ? null : projectAdd.trim();
    }

    public String getProjectExplain() {
        return projectExplain;
    }

    public void setProjectExplain(String projectExplain) {
        this.projectExplain = projectExplain == null ? null : projectExplain.trim();
    }

    public String getExperienceType() {
        return experienceType;
    }

    public void setExperienceType(String experienceType) {
        this.experienceType = experienceType == null ? null : experienceType.trim();
    }

    public Date getExperStartTime() {
        return experStartTime;
    }

    public void setExperStartTime(Date experStartTime) {
        this.experStartTime = experStartTime;
    }

    public Date getExperEndTime() {
        return experEndTime;
    }

    public void setExperEndTime(Date experEndTime) {
        this.experEndTime = experEndTime;
    }

    public String getExperienceAdd() {
        return experienceAdd;
    }

    public void setExperienceAdd(String experienceAdd) {
        this.experienceAdd = experienceAdd == null ? null : experienceAdd.trim();
    }

    public String getExperienceExplain() {
        return experienceExplain;
    }

    public void setExperienceExplain(String experienceExplain) {
        this.experienceExplain = experienceExplain == null ? null : experienceExplain.trim();
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor == null ? null : honor.trim();
    }

    public String getSanction() {
        return sanction;
    }

    public void setSanction(String sanction) {
        this.sanction = sanction == null ? null : sanction.trim();
    }

    public String getSanctionExpain() {
        return sanctionExpain;
    }

    public void setSanctionExpain(String sanctionExpain) {
        this.sanctionExpain = sanctionExpain == null ? null : sanctionExpain.trim();
    }

    public String getRefereeName() {
        return refereeName;
    }

    public void setRefereeName(String refereeName) {
        this.refereeName = refereeName == null ? null : refereeName.trim();
    }

    public String getRefereeTelephone() {
        return refereeTelephone;
    }

    public void setRefereeTelephone(String refereeTelephone) {
        this.refereeTelephone = refereeTelephone == null ? null : refereeTelephone.trim();
    }

    public String getRefereeCompany() {
        return refereeCompany;
    }

    public void setRefereeCompany(String refereeCompany) {
        this.refereeCompany = refereeCompany == null ? null : refereeCompany.trim();
    }

    public String getRefereeEmail() {
        return refereeEmail;
    }

    public void setRefereeEmail(String refereeEmail) {
        this.refereeEmail = refereeEmail == null ? null : refereeEmail.trim();
    }

    public String getResumeFile() {
        return resumeFile;
    }

    public void setResumeFile(String resumeFile) {
        this.resumeFile = resumeFile == null ? null : resumeFile.trim();
    }

    public String getAcademicFile() {
        return academicFile;
    }

    public void setAcademicFile(String academicFile) {
        this.academicFile = academicFile == null ? null : academicFile.trim();
    }

    public String getScoreFile() {
        return scoreFile;
    }

    public void setScoreFile(String scoreFile) {
        this.scoreFile = scoreFile == null ? null : scoreFile.trim();
    }

    public String getLanguageFile() {
        return languageFile;
    }

    public void setLanguageFile(String languageFile) {
        this.languageFile = languageFile == null ? null : languageFile.trim();
    }

    public String getDegreeFile() {
        return degreeFile;
    }

    public void setDegreeFile(String degreeFile) {
        this.degreeFile = degreeFile == null ? null : degreeFile.trim();
    }

    public String getAnnounceName() {
        return announceName;
    }

    public void setAnnounceName(String announceName) {
        this.announceName = announceName == null ? null : announceName.trim();
    }

    public Date getAnnounceTime() {
        return announceTime;
    }

    public void setAnnounceTime(Date announceTime) {
        this.announceTime = announceTime;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus == null ? null : applicationStatus.trim();
    }
}