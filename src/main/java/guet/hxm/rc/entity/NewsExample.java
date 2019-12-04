package guet.hxm.rc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andNewsIdIsNull() {
            addCriterion("news_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("news_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(Long value) {
            addCriterion("news_id =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(Long value) {
            addCriterion("news_id <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(Long value) {
            addCriterion("news_id >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("news_id >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(Long value) {
            addCriterion("news_id <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(Long value) {
            addCriterion("news_id <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<Long> values) {
            addCriterion("news_id in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<Long> values) {
            addCriterion("news_id not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(Long value1, Long value2) {
            addCriterion("news_id between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(Long value1, Long value2) {
            addCriterion("news_id not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsImageIsNull() {
            addCriterion("news_image is null");
            return (Criteria) this;
        }

        public Criteria andNewsImageIsNotNull() {
            addCriterion("news_image is not null");
            return (Criteria) this;
        }

        public Criteria andNewsImageEqualTo(String value) {
            addCriterion("news_image =", value, "newsImage");
            return (Criteria) this;
        }

        public Criteria andNewsImageNotEqualTo(String value) {
            addCriterion("news_image <>", value, "newsImage");
            return (Criteria) this;
        }

        public Criteria andNewsImageGreaterThan(String value) {
            addCriterion("news_image >", value, "newsImage");
            return (Criteria) this;
        }

        public Criteria andNewsImageGreaterThanOrEqualTo(String value) {
            addCriterion("news_image >=", value, "newsImage");
            return (Criteria) this;
        }

        public Criteria andNewsImageLessThan(String value) {
            addCriterion("news_image <", value, "newsImage");
            return (Criteria) this;
        }

        public Criteria andNewsImageLessThanOrEqualTo(String value) {
            addCriterion("news_image <=", value, "newsImage");
            return (Criteria) this;
        }

        public Criteria andNewsImageLike(String value) {
            addCriterion("news_image like", value, "newsImage");
            return (Criteria) this;
        }

        public Criteria andNewsImageNotLike(String value) {
            addCriterion("news_image not like", value, "newsImage");
            return (Criteria) this;
        }

        public Criteria andNewsImageIn(List<String> values) {
            addCriterion("news_image in", values, "newsImage");
            return (Criteria) this;
        }

        public Criteria andNewsImageNotIn(List<String> values) {
            addCriterion("news_image not in", values, "newsImage");
            return (Criteria) this;
        }

        public Criteria andNewsImageBetween(String value1, String value2) {
            addCriterion("news_image between", value1, value2, "newsImage");
            return (Criteria) this;
        }

        public Criteria andNewsImageNotBetween(String value1, String value2) {
            addCriterion("news_image not between", value1, value2, "newsImage");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNull() {
            addCriterion("news_title is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIsNotNull() {
            addCriterion("news_title is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitleEqualTo(String value) {
            addCriterion("news_title =", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotEqualTo(String value) {
            addCriterion("news_title <>", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThan(String value) {
            addCriterion("news_title >", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("news_title >=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThan(String value) {
            addCriterion("news_title <", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLessThanOrEqualTo(String value) {
            addCriterion("news_title <=", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleLike(String value) {
            addCriterion("news_title like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotLike(String value) {
            addCriterion("news_title not like", value, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleIn(List<String> values) {
            addCriterion("news_title in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotIn(List<String> values) {
            addCriterion("news_title not in", values, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleBetween(String value1, String value2) {
            addCriterion("news_title between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTitleNotBetween(String value1, String value2) {
            addCriterion("news_title not between", value1, value2, "newsTitle");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdIsNull() {
            addCriterion("news_type_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdIsNotNull() {
            addCriterion("news_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdEqualTo(Integer value) {
            addCriterion("news_type_id =", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdNotEqualTo(Integer value) {
            addCriterion("news_type_id <>", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdGreaterThan(Integer value) {
            addCriterion("news_type_id >", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_type_id >=", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdLessThan(Integer value) {
            addCriterion("news_type_id <", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("news_type_id <=", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdIn(List<Integer> values) {
            addCriterion("news_type_id in", values, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdNotIn(List<Integer> values) {
            addCriterion("news_type_id not in", values, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("news_type_id between", value1, value2, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("news_type_id not between", value1, value2, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsContentIsNull() {
            addCriterion("news_content is null");
            return (Criteria) this;
        }

        public Criteria andNewsContentIsNotNull() {
            addCriterion("news_content is not null");
            return (Criteria) this;
        }

        public Criteria andNewsContentEqualTo(String value) {
            addCriterion("news_content =", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentNotEqualTo(String value) {
            addCriterion("news_content <>", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentGreaterThan(String value) {
            addCriterion("news_content >", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentGreaterThanOrEqualTo(String value) {
            addCriterion("news_content >=", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentLessThan(String value) {
            addCriterion("news_content <", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentLessThanOrEqualTo(String value) {
            addCriterion("news_content <=", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentLike(String value) {
            addCriterion("news_content like", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentNotLike(String value) {
            addCriterion("news_content not like", value, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentIn(List<String> values) {
            addCriterion("news_content in", values, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentNotIn(List<String> values) {
            addCriterion("news_content not in", values, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentBetween(String value1, String value2) {
            addCriterion("news_content between", value1, value2, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsContentNotBetween(String value1, String value2) {
            addCriterion("news_content not between", value1, value2, "newsContent");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorIsNull() {
            addCriterion("news_author is null");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorIsNotNull() {
            addCriterion("news_author is not null");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorEqualTo(String value) {
            addCriterion("news_author =", value, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorNotEqualTo(String value) {
            addCriterion("news_author <>", value, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorGreaterThan(String value) {
            addCriterion("news_author >", value, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("news_author >=", value, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorLessThan(String value) {
            addCriterion("news_author <", value, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorLessThanOrEqualTo(String value) {
            addCriterion("news_author <=", value, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorLike(String value) {
            addCriterion("news_author like", value, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorNotLike(String value) {
            addCriterion("news_author not like", value, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorIn(List<String> values) {
            addCriterion("news_author in", values, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorNotIn(List<String> values) {
            addCriterion("news_author not in", values, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorBetween(String value1, String value2) {
            addCriterion("news_author between", value1, value2, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsAuthorNotBetween(String value1, String value2) {
            addCriterion("news_author not between", value1, value2, "newsAuthor");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIsNull() {
            addCriterion("news_time is null");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIsNotNull() {
            addCriterion("news_time is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTimeEqualTo(Date value) {
            addCriterionForJDBCDate("news_time =", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("news_time <>", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("news_time >", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("news_time >=", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLessThan(Date value) {
            addCriterionForJDBCDate("news_time <", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("news_time <=", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIn(List<Date> values) {
            addCriterionForJDBCDate("news_time in", values, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("news_time not in", values, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("news_time between", value1, value2, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("news_time not between", value1, value2, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsStatusIsNull() {
            addCriterion("news_status is null");
            return (Criteria) this;
        }

        public Criteria andNewsStatusIsNotNull() {
            addCriterion("news_status is not null");
            return (Criteria) this;
        }

        public Criteria andNewsStatusEqualTo(String value) {
            addCriterion("news_status =", value, "newsStatus");
            return (Criteria) this;
        }

        public Criteria andNewsStatusNotEqualTo(String value) {
            addCriterion("news_status <>", value, "newsStatus");
            return (Criteria) this;
        }

        public Criteria andNewsStatusGreaterThan(String value) {
            addCriterion("news_status >", value, "newsStatus");
            return (Criteria) this;
        }

        public Criteria andNewsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("news_status >=", value, "newsStatus");
            return (Criteria) this;
        }

        public Criteria andNewsStatusLessThan(String value) {
            addCriterion("news_status <", value, "newsStatus");
            return (Criteria) this;
        }

        public Criteria andNewsStatusLessThanOrEqualTo(String value) {
            addCriterion("news_status <=", value, "newsStatus");
            return (Criteria) this;
        }

        public Criteria andNewsStatusLike(String value) {
            addCriterion("news_status like", value, "newsStatus");
            return (Criteria) this;
        }

        public Criteria andNewsStatusNotLike(String value) {
            addCriterion("news_status not like", value, "newsStatus");
            return (Criteria) this;
        }

        public Criteria andNewsStatusIn(List<String> values) {
            addCriterion("news_status in", values, "newsStatus");
            return (Criteria) this;
        }

        public Criteria andNewsStatusNotIn(List<String> values) {
            addCriterion("news_status not in", values, "newsStatus");
            return (Criteria) this;
        }

        public Criteria andNewsStatusBetween(String value1, String value2) {
            addCriterion("news_status between", value1, value2, "newsStatus");
            return (Criteria) this;
        }

        public Criteria andNewsStatusNotBetween(String value1, String value2) {
            addCriterion("news_status not between", value1, value2, "newsStatus");
            return (Criteria) this;
        }

        public Criteria andNewsVisitIsNull() {
            addCriterion("news_visit is null");
            return (Criteria) this;
        }

        public Criteria andNewsVisitIsNotNull() {
            addCriterion("news_visit is not null");
            return (Criteria) this;
        }

        public Criteria andNewsVisitEqualTo(Long value) {
            addCriterion("news_visit =", value, "newsVisit");
            return (Criteria) this;
        }

        public Criteria andNewsVisitNotEqualTo(Long value) {
            addCriterion("news_visit <>", value, "newsVisit");
            return (Criteria) this;
        }

        public Criteria andNewsVisitGreaterThan(Long value) {
            addCriterion("news_visit >", value, "newsVisit");
            return (Criteria) this;
        }

        public Criteria andNewsVisitGreaterThanOrEqualTo(Long value) {
            addCriterion("news_visit >=", value, "newsVisit");
            return (Criteria) this;
        }

        public Criteria andNewsVisitLessThan(Long value) {
            addCriterion("news_visit <", value, "newsVisit");
            return (Criteria) this;
        }

        public Criteria andNewsVisitLessThanOrEqualTo(Long value) {
            addCriterion("news_visit <=", value, "newsVisit");
            return (Criteria) this;
        }

        public Criteria andNewsVisitIn(List<Long> values) {
            addCriterion("news_visit in", values, "newsVisit");
            return (Criteria) this;
        }

        public Criteria andNewsVisitNotIn(List<Long> values) {
            addCriterion("news_visit not in", values, "newsVisit");
            return (Criteria) this;
        }

        public Criteria andNewsVisitBetween(Long value1, Long value2) {
            addCriterion("news_visit between", value1, value2, "newsVisit");
            return (Criteria) this;
        }

        public Criteria andNewsVisitNotBetween(Long value1, Long value2) {
            addCriterion("news_visit not between", value1, value2, "newsVisit");
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