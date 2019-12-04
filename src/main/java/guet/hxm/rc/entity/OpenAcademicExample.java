package guet.hxm.rc.entity;

import java.util.ArrayList;
import java.util.List;

public class OpenAcademicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OpenAcademicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAcademicIdIsNull() {
            addCriterion("academic_id is null");
            return (Criteria) this;
        }

        public Criteria andAcademicIdIsNotNull() {
            addCriterion("academic_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicIdEqualTo(Long value) {
            addCriterion("academic_id =", value, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdNotEqualTo(Long value) {
            addCriterion("academic_id <>", value, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdGreaterThan(Long value) {
            addCriterion("academic_id >", value, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("academic_id >=", value, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdLessThan(Long value) {
            addCriterion("academic_id <", value, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdLessThanOrEqualTo(Long value) {
            addCriterion("academic_id <=", value, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdIn(List<Long> values) {
            addCriterion("academic_id in", values, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdNotIn(List<Long> values) {
            addCriterion("academic_id not in", values, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdBetween(Long value1, Long value2) {
            addCriterion("academic_id between", value1, value2, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicIdNotBetween(Long value1, Long value2) {
            addCriterion("academic_id not between", value1, value2, "academicId");
            return (Criteria) this;
        }

        public Criteria andAcademicNameIsNull() {
            addCriterion("academic_name is null");
            return (Criteria) this;
        }

        public Criteria andAcademicNameIsNotNull() {
            addCriterion("academic_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicNameEqualTo(String value) {
            addCriterion("academic_name =", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameNotEqualTo(String value) {
            addCriterion("academic_name <>", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameGreaterThan(String value) {
            addCriterion("academic_name >", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameGreaterThanOrEqualTo(String value) {
            addCriterion("academic_name >=", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameLessThan(String value) {
            addCriterion("academic_name <", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameLessThanOrEqualTo(String value) {
            addCriterion("academic_name <=", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameLike(String value) {
            addCriterion("academic_name like", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameNotLike(String value) {
            addCriterion("academic_name not like", value, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameIn(List<String> values) {
            addCriterion("academic_name in", values, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameNotIn(List<String> values) {
            addCriterion("academic_name not in", values, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameBetween(String value1, String value2) {
            addCriterion("academic_name between", value1, value2, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicNameNotBetween(String value1, String value2) {
            addCriterion("academic_name not between", value1, value2, "academicName");
            return (Criteria) this;
        }

        public Criteria andAcademicAuthorIsNull() {
            addCriterion("academic_author is null");
            return (Criteria) this;
        }

        public Criteria andAcademicAuthorIsNotNull() {
            addCriterion("academic_author is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicAuthorEqualTo(String value) {
            addCriterion("academic_author =", value, "academicAuthor");
            return (Criteria) this;
        }

        public Criteria andAcademicAuthorNotEqualTo(String value) {
            addCriterion("academic_author <>", value, "academicAuthor");
            return (Criteria) this;
        }

        public Criteria andAcademicAuthorGreaterThan(String value) {
            addCriterion("academic_author >", value, "academicAuthor");
            return (Criteria) this;
        }

        public Criteria andAcademicAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("academic_author >=", value, "academicAuthor");
            return (Criteria) this;
        }

        public Criteria andAcademicAuthorLessThan(String value) {
            addCriterion("academic_author <", value, "academicAuthor");
            return (Criteria) this;
        }

        public Criteria andAcademicAuthorLessThanOrEqualTo(String value) {
            addCriterion("academic_author <=", value, "academicAuthor");
            return (Criteria) this;
        }

        public Criteria andAcademicAuthorLike(String value) {
            addCriterion("academic_author like", value, "academicAuthor");
            return (Criteria) this;
        }

        public Criteria andAcademicAuthorNotLike(String value) {
            addCriterion("academic_author not like", value, "academicAuthor");
            return (Criteria) this;
        }

        public Criteria andAcademicAuthorIn(List<String> values) {
            addCriterion("academic_author in", values, "academicAuthor");
            return (Criteria) this;
        }

        public Criteria andAcademicAuthorNotIn(List<String> values) {
            addCriterion("academic_author not in", values, "academicAuthor");
            return (Criteria) this;
        }

        public Criteria andAcademicAuthorBetween(String value1, String value2) {
            addCriterion("academic_author between", value1, value2, "academicAuthor");
            return (Criteria) this;
        }

        public Criteria andAcademicAuthorNotBetween(String value1, String value2) {
            addCriterion("academic_author not between", value1, value2, "academicAuthor");
            return (Criteria) this;
        }

        public Criteria andAcademicYearIsNull() {
            addCriterion("academic_year is null");
            return (Criteria) this;
        }

        public Criteria andAcademicYearIsNotNull() {
            addCriterion("academic_year is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicYearEqualTo(String value) {
            addCriterion("academic_year =", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearNotEqualTo(String value) {
            addCriterion("academic_year <>", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearGreaterThan(String value) {
            addCriterion("academic_year >", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearGreaterThanOrEqualTo(String value) {
            addCriterion("academic_year >=", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearLessThan(String value) {
            addCriterion("academic_year <", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearLessThanOrEqualTo(String value) {
            addCriterion("academic_year <=", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearLike(String value) {
            addCriterion("academic_year like", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearNotLike(String value) {
            addCriterion("academic_year not like", value, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearIn(List<String> values) {
            addCriterion("academic_year in", values, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearNotIn(List<String> values) {
            addCriterion("academic_year not in", values, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearBetween(String value1, String value2) {
            addCriterion("academic_year between", value1, value2, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicYearNotBetween(String value1, String value2) {
            addCriterion("academic_year not between", value1, value2, "academicYear");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeIsNull() {
            addCriterion("academic_type is null");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeIsNotNull() {
            addCriterion("academic_type is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeEqualTo(Integer value) {
            addCriterion("academic_type =", value, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeNotEqualTo(Integer value) {
            addCriterion("academic_type <>", value, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeGreaterThan(Integer value) {
            addCriterion("academic_type >", value, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("academic_type >=", value, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeLessThan(Integer value) {
            addCriterion("academic_type <", value, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeLessThanOrEqualTo(Integer value) {
            addCriterion("academic_type <=", value, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeIn(List<Integer> values) {
            addCriterion("academic_type in", values, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeNotIn(List<Integer> values) {
            addCriterion("academic_type not in", values, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeBetween(Integer value1, Integer value2) {
            addCriterion("academic_type between", value1, value2, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("academic_type not between", value1, value2, "academicType");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadLinkIsNull() {
            addCriterion("academic_download_link is null");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadLinkIsNotNull() {
            addCriterion("academic_download_link is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadLinkEqualTo(String value) {
            addCriterion("academic_download_link =", value, "academicDownloadLink");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadLinkNotEqualTo(String value) {
            addCriterion("academic_download_link <>", value, "academicDownloadLink");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadLinkGreaterThan(String value) {
            addCriterion("academic_download_link >", value, "academicDownloadLink");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadLinkGreaterThanOrEqualTo(String value) {
            addCriterion("academic_download_link >=", value, "academicDownloadLink");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadLinkLessThan(String value) {
            addCriterion("academic_download_link <", value, "academicDownloadLink");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadLinkLessThanOrEqualTo(String value) {
            addCriterion("academic_download_link <=", value, "academicDownloadLink");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadLinkLike(String value) {
            addCriterion("academic_download_link like", value, "academicDownloadLink");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadLinkNotLike(String value) {
            addCriterion("academic_download_link not like", value, "academicDownloadLink");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadLinkIn(List<String> values) {
            addCriterion("academic_download_link in", values, "academicDownloadLink");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadLinkNotIn(List<String> values) {
            addCriterion("academic_download_link not in", values, "academicDownloadLink");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadLinkBetween(String value1, String value2) {
            addCriterion("academic_download_link between", value1, value2, "academicDownloadLink");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadLinkNotBetween(String value1, String value2) {
            addCriterion("academic_download_link not between", value1, value2, "academicDownloadLink");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadQuantityIsNull() {
            addCriterion("academic_download_quantity is null");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadQuantityIsNotNull() {
            addCriterion("academic_download_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadQuantityEqualTo(Integer value) {
            addCriterion("academic_download_quantity =", value, "academicDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadQuantityNotEqualTo(Integer value) {
            addCriterion("academic_download_quantity <>", value, "academicDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadQuantityGreaterThan(Integer value) {
            addCriterion("academic_download_quantity >", value, "academicDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("academic_download_quantity >=", value, "academicDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadQuantityLessThan(Integer value) {
            addCriterion("academic_download_quantity <", value, "academicDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("academic_download_quantity <=", value, "academicDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadQuantityIn(List<Integer> values) {
            addCriterion("academic_download_quantity in", values, "academicDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadQuantityNotIn(List<Integer> values) {
            addCriterion("academic_download_quantity not in", values, "academicDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadQuantityBetween(Integer value1, Integer value2) {
            addCriterion("academic_download_quantity between", value1, value2, "academicDownloadQuantity");
            return (Criteria) this;
        }

        public Criteria andAcademicDownloadQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("academic_download_quantity not between", value1, value2, "academicDownloadQuantity");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}