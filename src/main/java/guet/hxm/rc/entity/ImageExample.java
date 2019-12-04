package guet.hxm.rc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
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

        public Criteria andImageIdIsNull() {
            addCriterion("image_id is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("image_id is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(Long value) {
            addCriterion("image_id =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(Long value) {
            addCriterion("image_id <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(Long value) {
            addCriterion("image_id >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("image_id >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(Long value) {
            addCriterion("image_id <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(Long value) {
            addCriterion("image_id <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<Long> values) {
            addCriterion("image_id in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<Long> values) {
            addCriterion("image_id not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(Long value1, Long value2) {
            addCriterion("image_id between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(Long value1, Long value2) {
            addCriterion("image_id not between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNull() {
            addCriterion("image_name is null");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNotNull() {
            addCriterion("image_name is not null");
            return (Criteria) this;
        }

        public Criteria andImageNameEqualTo(String value) {
            addCriterion("image_name =", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotEqualTo(String value) {
            addCriterion("image_name <>", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThan(String value) {
            addCriterion("image_name >", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThanOrEqualTo(String value) {
            addCriterion("image_name >=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThan(String value) {
            addCriterion("image_name <", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThanOrEqualTo(String value) {
            addCriterion("image_name <=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLike(String value) {
            addCriterion("image_name like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotLike(String value) {
            addCriterion("image_name not like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameIn(List<String> values) {
            addCriterion("image_name in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotIn(List<String> values) {
            addCriterion("image_name not in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameBetween(String value1, String value2) {
            addCriterion("image_name between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotBetween(String value1, String value2) {
            addCriterion("image_name not between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlAddrIsNull() {
            addCriterion("image_url_addr is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlAddrIsNotNull() {
            addCriterion("image_url_addr is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlAddrEqualTo(String value) {
            addCriterion("image_url_addr =", value, "imageUrlAddr");
            return (Criteria) this;
        }

        public Criteria andImageUrlAddrNotEqualTo(String value) {
            addCriterion("image_url_addr <>", value, "imageUrlAddr");
            return (Criteria) this;
        }

        public Criteria andImageUrlAddrGreaterThan(String value) {
            addCriterion("image_url_addr >", value, "imageUrlAddr");
            return (Criteria) this;
        }

        public Criteria andImageUrlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("image_url_addr >=", value, "imageUrlAddr");
            return (Criteria) this;
        }

        public Criteria andImageUrlAddrLessThan(String value) {
            addCriterion("image_url_addr <", value, "imageUrlAddr");
            return (Criteria) this;
        }

        public Criteria andImageUrlAddrLessThanOrEqualTo(String value) {
            addCriterion("image_url_addr <=", value, "imageUrlAddr");
            return (Criteria) this;
        }

        public Criteria andImageUrlAddrLike(String value) {
            addCriterion("image_url_addr like", value, "imageUrlAddr");
            return (Criteria) this;
        }

        public Criteria andImageUrlAddrNotLike(String value) {
            addCriterion("image_url_addr not like", value, "imageUrlAddr");
            return (Criteria) this;
        }

        public Criteria andImageUrlAddrIn(List<String> values) {
            addCriterion("image_url_addr in", values, "imageUrlAddr");
            return (Criteria) this;
        }

        public Criteria andImageUrlAddrNotIn(List<String> values) {
            addCriterion("image_url_addr not in", values, "imageUrlAddr");
            return (Criteria) this;
        }

        public Criteria andImageUrlAddrBetween(String value1, String value2) {
            addCriterion("image_url_addr between", value1, value2, "imageUrlAddr");
            return (Criteria) this;
        }

        public Criteria andImageUrlAddrNotBetween(String value1, String value2) {
            addCriterion("image_url_addr not between", value1, value2, "imageUrlAddr");
            return (Criteria) this;
        }

        public Criteria andImageTypeIsNull() {
            addCriterion("image_type is null");
            return (Criteria) this;
        }

        public Criteria andImageTypeIsNotNull() {
            addCriterion("image_type is not null");
            return (Criteria) this;
        }

        public Criteria andImageTypeEqualTo(String value) {
            addCriterion("image_type =", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotEqualTo(String value) {
            addCriterion("image_type <>", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeGreaterThan(String value) {
            addCriterion("image_type >", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("image_type >=", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeLessThan(String value) {
            addCriterion("image_type <", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeLessThanOrEqualTo(String value) {
            addCriterion("image_type <=", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeLike(String value) {
            addCriterion("image_type like", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotLike(String value) {
            addCriterion("image_type not like", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeIn(List<String> values) {
            addCriterion("image_type in", values, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotIn(List<String> values) {
            addCriterion("image_type not in", values, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeBetween(String value1, String value2) {
            addCriterion("image_type between", value1, value2, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotBetween(String value1, String value2) {
            addCriterion("image_type not between", value1, value2, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageOrderIsNull() {
            addCriterion("image_order is null");
            return (Criteria) this;
        }

        public Criteria andImageOrderIsNotNull() {
            addCriterion("image_order is not null");
            return (Criteria) this;
        }

        public Criteria andImageOrderEqualTo(Integer value) {
            addCriterion("image_order =", value, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderNotEqualTo(Integer value) {
            addCriterion("image_order <>", value, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderGreaterThan(Integer value) {
            addCriterion("image_order >", value, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("image_order >=", value, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderLessThan(Integer value) {
            addCriterion("image_order <", value, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderLessThanOrEqualTo(Integer value) {
            addCriterion("image_order <=", value, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderIn(List<Integer> values) {
            addCriterion("image_order in", values, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderNotIn(List<Integer> values) {
            addCriterion("image_order not in", values, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderBetween(Integer value1, Integer value2) {
            addCriterion("image_order between", value1, value2, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("image_order not between", value1, value2, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageDescIsNull() {
            addCriterion("image_desc is null");
            return (Criteria) this;
        }

        public Criteria andImageDescIsNotNull() {
            addCriterion("image_desc is not null");
            return (Criteria) this;
        }

        public Criteria andImageDescEqualTo(String value) {
            addCriterion("image_desc =", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescNotEqualTo(String value) {
            addCriterion("image_desc <>", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescGreaterThan(String value) {
            addCriterion("image_desc >", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescGreaterThanOrEqualTo(String value) {
            addCriterion("image_desc >=", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescLessThan(String value) {
            addCriterion("image_desc <", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescLessThanOrEqualTo(String value) {
            addCriterion("image_desc <=", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescLike(String value) {
            addCriterion("image_desc like", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescNotLike(String value) {
            addCriterion("image_desc not like", value, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescIn(List<String> values) {
            addCriterion("image_desc in", values, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescNotIn(List<String> values) {
            addCriterion("image_desc not in", values, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescBetween(String value1, String value2) {
            addCriterion("image_desc between", value1, value2, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageDescNotBetween(String value1, String value2) {
            addCriterion("image_desc not between", value1, value2, "imageDesc");
            return (Criteria) this;
        }

        public Criteria andImageAuthorIsNull() {
            addCriterion("image_author is null");
            return (Criteria) this;
        }

        public Criteria andImageAuthorIsNotNull() {
            addCriterion("image_author is not null");
            return (Criteria) this;
        }

        public Criteria andImageAuthorEqualTo(String value) {
            addCriterion("image_author =", value, "imageAuthor");
            return (Criteria) this;
        }

        public Criteria andImageAuthorNotEqualTo(String value) {
            addCriterion("image_author <>", value, "imageAuthor");
            return (Criteria) this;
        }

        public Criteria andImageAuthorGreaterThan(String value) {
            addCriterion("image_author >", value, "imageAuthor");
            return (Criteria) this;
        }

        public Criteria andImageAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("image_author >=", value, "imageAuthor");
            return (Criteria) this;
        }

        public Criteria andImageAuthorLessThan(String value) {
            addCriterion("image_author <", value, "imageAuthor");
            return (Criteria) this;
        }

        public Criteria andImageAuthorLessThanOrEqualTo(String value) {
            addCriterion("image_author <=", value, "imageAuthor");
            return (Criteria) this;
        }

        public Criteria andImageAuthorLike(String value) {
            addCriterion("image_author like", value, "imageAuthor");
            return (Criteria) this;
        }

        public Criteria andImageAuthorNotLike(String value) {
            addCriterion("image_author not like", value, "imageAuthor");
            return (Criteria) this;
        }

        public Criteria andImageAuthorIn(List<String> values) {
            addCriterion("image_author in", values, "imageAuthor");
            return (Criteria) this;
        }

        public Criteria andImageAuthorNotIn(List<String> values) {
            addCriterion("image_author not in", values, "imageAuthor");
            return (Criteria) this;
        }

        public Criteria andImageAuthorBetween(String value1, String value2) {
            addCriterion("image_author between", value1, value2, "imageAuthor");
            return (Criteria) this;
        }

        public Criteria andImageAuthorNotBetween(String value1, String value2) {
            addCriterion("image_author not between", value1, value2, "imageAuthor");
            return (Criteria) this;
        }

        public Criteria andImageTimeIsNull() {
            addCriterion("image_time is null");
            return (Criteria) this;
        }

        public Criteria andImageTimeIsNotNull() {
            addCriterion("image_time is not null");
            return (Criteria) this;
        }

        public Criteria andImageTimeEqualTo(Date value) {
            addCriterionForJDBCDate("image_time =", value, "imageTime");
            return (Criteria) this;
        }

        public Criteria andImageTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("image_time <>", value, "imageTime");
            return (Criteria) this;
        }

        public Criteria andImageTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("image_time >", value, "imageTime");
            return (Criteria) this;
        }

        public Criteria andImageTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("image_time >=", value, "imageTime");
            return (Criteria) this;
        }

        public Criteria andImageTimeLessThan(Date value) {
            addCriterionForJDBCDate("image_time <", value, "imageTime");
            return (Criteria) this;
        }

        public Criteria andImageTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("image_time <=", value, "imageTime");
            return (Criteria) this;
        }

        public Criteria andImageTimeIn(List<Date> values) {
            addCriterionForJDBCDate("image_time in", values, "imageTime");
            return (Criteria) this;
        }

        public Criteria andImageTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("image_time not in", values, "imageTime");
            return (Criteria) this;
        }

        public Criteria andImageTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("image_time between", value1, value2, "imageTime");
            return (Criteria) this;
        }

        public Criteria andImageTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("image_time not between", value1, value2, "imageTime");
            return (Criteria) this;
        }

        public Criteria andImageIsBlankIsNull() {
            addCriterion("image_is_blank is null");
            return (Criteria) this;
        }

        public Criteria andImageIsBlankIsNotNull() {
            addCriterion("image_is_blank is not null");
            return (Criteria) this;
        }

        public Criteria andImageIsBlankEqualTo(String value) {
            addCriterion("image_is_blank =", value, "imageIsBlank");
            return (Criteria) this;
        }

        public Criteria andImageIsBlankNotEqualTo(String value) {
            addCriterion("image_is_blank <>", value, "imageIsBlank");
            return (Criteria) this;
        }

        public Criteria andImageIsBlankGreaterThan(String value) {
            addCriterion("image_is_blank >", value, "imageIsBlank");
            return (Criteria) this;
        }

        public Criteria andImageIsBlankGreaterThanOrEqualTo(String value) {
            addCriterion("image_is_blank >=", value, "imageIsBlank");
            return (Criteria) this;
        }

        public Criteria andImageIsBlankLessThan(String value) {
            addCriterion("image_is_blank <", value, "imageIsBlank");
            return (Criteria) this;
        }

        public Criteria andImageIsBlankLessThanOrEqualTo(String value) {
            addCriterion("image_is_blank <=", value, "imageIsBlank");
            return (Criteria) this;
        }

        public Criteria andImageIsBlankLike(String value) {
            addCriterion("image_is_blank like", value, "imageIsBlank");
            return (Criteria) this;
        }

        public Criteria andImageIsBlankNotLike(String value) {
            addCriterion("image_is_blank not like", value, "imageIsBlank");
            return (Criteria) this;
        }

        public Criteria andImageIsBlankIn(List<String> values) {
            addCriterion("image_is_blank in", values, "imageIsBlank");
            return (Criteria) this;
        }

        public Criteria andImageIsBlankNotIn(List<String> values) {
            addCriterion("image_is_blank not in", values, "imageIsBlank");
            return (Criteria) this;
        }

        public Criteria andImageIsBlankBetween(String value1, String value2) {
            addCriterion("image_is_blank between", value1, value2, "imageIsBlank");
            return (Criteria) this;
        }

        public Criteria andImageIsBlankNotBetween(String value1, String value2) {
            addCriterion("image_is_blank not between", value1, value2, "imageIsBlank");
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