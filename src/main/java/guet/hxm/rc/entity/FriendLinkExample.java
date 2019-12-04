package guet.hxm.rc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FriendLinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FriendLinkExample() {
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

        public Criteria andLinkIdIsNull() {
            addCriterion("link_id is null");
            return (Criteria) this;
        }

        public Criteria andLinkIdIsNotNull() {
            addCriterion("link_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinkIdEqualTo(Long value) {
            addCriterion("link_id =", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotEqualTo(Long value) {
            addCriterion("link_id <>", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdGreaterThan(Long value) {
            addCriterion("link_id >", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("link_id >=", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLessThan(Long value) {
            addCriterion("link_id <", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLessThanOrEqualTo(Long value) {
            addCriterion("link_id <=", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdIn(List<Long> values) {
            addCriterion("link_id in", values, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotIn(List<Long> values) {
            addCriterion("link_id not in", values, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdBetween(Long value1, Long value2) {
            addCriterion("link_id between", value1, value2, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotBetween(Long value1, Long value2) {
            addCriterion("link_id not between", value1, value2, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNull() {
            addCriterion("link_name is null");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNotNull() {
            addCriterion("link_name is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNameEqualTo(String value) {
            addCriterion("link_name =", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotEqualTo(String value) {
            addCriterion("link_name <>", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThan(String value) {
            addCriterion("link_name >", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("link_name >=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThan(String value) {
            addCriterion("link_name <", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThanOrEqualTo(String value) {
            addCriterion("link_name <=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLike(String value) {
            addCriterion("link_name like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotLike(String value) {
            addCriterion("link_name not like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameIn(List<String> values) {
            addCriterion("link_name in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotIn(List<String> values) {
            addCriterion("link_name not in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameBetween(String value1, String value2) {
            addCriterion("link_name between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotBetween(String value1, String value2) {
            addCriterion("link_name not between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkImageIsNull() {
            addCriterion("link_image is null");
            return (Criteria) this;
        }

        public Criteria andLinkImageIsNotNull() {
            addCriterion("link_image is not null");
            return (Criteria) this;
        }

        public Criteria andLinkImageEqualTo(String value) {
            addCriterion("link_image =", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageNotEqualTo(String value) {
            addCriterion("link_image <>", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageGreaterThan(String value) {
            addCriterion("link_image >", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageGreaterThanOrEqualTo(String value) {
            addCriterion("link_image >=", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageLessThan(String value) {
            addCriterion("link_image <", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageLessThanOrEqualTo(String value) {
            addCriterion("link_image <=", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageLike(String value) {
            addCriterion("link_image like", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageNotLike(String value) {
            addCriterion("link_image not like", value, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageIn(List<String> values) {
            addCriterion("link_image in", values, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageNotIn(List<String> values) {
            addCriterion("link_image not in", values, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageBetween(String value1, String value2) {
            addCriterion("link_image between", value1, value2, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkImageNotBetween(String value1, String value2) {
            addCriterion("link_image not between", value1, value2, "linkImage");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNull() {
            addCriterion("link_url is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("link_url is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("link_url =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("link_url <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("link_url >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("link_url >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("link_url <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("link_url <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("link_url like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("link_url not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("link_url in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("link_url not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("link_url between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("link_url not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andIsBlankIsNull() {
            addCriterion("is_blank is null");
            return (Criteria) this;
        }

        public Criteria andIsBlankIsNotNull() {
            addCriterion("is_blank is not null");
            return (Criteria) this;
        }

        public Criteria andIsBlankEqualTo(String value) {
            addCriterion("is_blank =", value, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankNotEqualTo(String value) {
            addCriterion("is_blank <>", value, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankGreaterThan(String value) {
            addCriterion("is_blank >", value, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankGreaterThanOrEqualTo(String value) {
            addCriterion("is_blank >=", value, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankLessThan(String value) {
            addCriterion("is_blank <", value, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankLessThanOrEqualTo(String value) {
            addCriterion("is_blank <=", value, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankLike(String value) {
            addCriterion("is_blank like", value, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankNotLike(String value) {
            addCriterion("is_blank not like", value, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankIn(List<String> values) {
            addCriterion("is_blank in", values, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankNotIn(List<String> values) {
            addCriterion("is_blank not in", values, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankBetween(String value1, String value2) {
            addCriterion("is_blank between", value1, value2, "isBlank");
            return (Criteria) this;
        }

        public Criteria andIsBlankNotBetween(String value1, String value2) {
            addCriterion("is_blank not between", value1, value2, "isBlank");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterionForJDBCDate("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterionForJDBCDate("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterionForJDBCDate("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIsNull() {
            addCriterion("link_order is null");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIsNotNull() {
            addCriterion("link_order is not null");
            return (Criteria) this;
        }

        public Criteria andLinkOrderEqualTo(Integer value) {
            addCriterion("link_order =", value, "linkOrder");
            return (Criteria) this;
        }

        public Criteria andLinkOrderNotEqualTo(Integer value) {
            addCriterion("link_order <>", value, "linkOrder");
            return (Criteria) this;
        }

        public Criteria andLinkOrderGreaterThan(Integer value) {
            addCriterion("link_order >", value, "linkOrder");
            return (Criteria) this;
        }

        public Criteria andLinkOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("link_order >=", value, "linkOrder");
            return (Criteria) this;
        }

        public Criteria andLinkOrderLessThan(Integer value) {
            addCriterion("link_order <", value, "linkOrder");
            return (Criteria) this;
        }

        public Criteria andLinkOrderLessThanOrEqualTo(Integer value) {
            addCriterion("link_order <=", value, "linkOrder");
            return (Criteria) this;
        }

        public Criteria andLinkOrderIn(List<Integer> values) {
            addCriterion("link_order in", values, "linkOrder");
            return (Criteria) this;
        }

        public Criteria andLinkOrderNotIn(List<Integer> values) {
            addCriterion("link_order not in", values, "linkOrder");
            return (Criteria) this;
        }

        public Criteria andLinkOrderBetween(Integer value1, Integer value2) {
            addCriterion("link_order between", value1, value2, "linkOrder");
            return (Criteria) this;
        }

        public Criteria andLinkOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("link_order not between", value1, value2, "linkOrder");
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