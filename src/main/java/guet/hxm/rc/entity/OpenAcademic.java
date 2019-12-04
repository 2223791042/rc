package guet.hxm.rc.entity;

public class OpenAcademic {
    private Long academicId;

    private String academicName;

    private String academicAuthor;

    private String academicYear;

    private Integer academicType;

    private String academicDownloadLink;

    private Integer academicDownloadQuantity;

    public Long getAcademicId() {
        return academicId;
    }

    public void setAcademicId(Long academicId) {
        this.academicId = academicId;
    }

    public String getAcademicName() {
        return academicName;
    }

    public void setAcademicName(String academicName) {
        this.academicName = academicName == null ? null : academicName.trim();
    }

    public String getAcademicAuthor() {
        return academicAuthor;
    }

    public void setAcademicAuthor(String academicAuthor) {
        this.academicAuthor = academicAuthor == null ? null : academicAuthor.trim();
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear == null ? null : academicYear.trim();
    }

    public Integer getAcademicType() {
        return academicType;
    }

    public void setAcademicType(Integer academicType) {
        this.academicType = academicType;
    }

    public String getAcademicDownloadLink() {
        return academicDownloadLink;
    }

    public void setAcademicDownloadLink(String academicDownloadLink) {
        this.academicDownloadLink = academicDownloadLink == null ? null : academicDownloadLink.trim();
    }

    public Integer getAcademicDownloadQuantity() {
        return academicDownloadQuantity;
    }

    public void setAcademicDownloadQuantity(Integer academicDownloadQuantity) {
        this.academicDownloadQuantity = academicDownloadQuantity;
    }
}