package guet.hxm.rc.entity;

import java.util.ArrayList;
import java.util.List;

public class PartnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PartnerExample() {
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

        public Criteria andPartnerIdIsNull() {
            addCriterion("partner_id is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIsNotNull() {
            addCriterion("partner_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerIdEqualTo(Long value) {
            addCriterion("partner_id =", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotEqualTo(Long value) {
            addCriterion("partner_id <>", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThan(Long value) {
            addCriterion("partner_id >", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("partner_id >=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThan(Long value) {
            addCriterion("partner_id <", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdLessThanOrEqualTo(Long value) {
            addCriterion("partner_id <=", value, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdIn(List<Long> values) {
            addCriterion("partner_id in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotIn(List<Long> values) {
            addCriterion("partner_id not in", values, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdBetween(Long value1, Long value2) {
            addCriterion("partner_id between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerIdNotBetween(Long value1, Long value2) {
            addCriterion("partner_id not between", value1, value2, "partnerId");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIsNull() {
            addCriterion("partner_name is null");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIsNotNull() {
            addCriterion("partner_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerNameEqualTo(String value) {
            addCriterion("partner_name =", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotEqualTo(String value) {
            addCriterion("partner_name <>", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameGreaterThan(String value) {
            addCriterion("partner_name >", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("partner_name >=", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLessThan(String value) {
            addCriterion("partner_name <", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLessThanOrEqualTo(String value) {
            addCriterion("partner_name <=", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameLike(String value) {
            addCriterion("partner_name like", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotLike(String value) {
            addCriterion("partner_name not like", value, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameIn(List<String> values) {
            addCriterion("partner_name in", values, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotIn(List<String> values) {
            addCriterion("partner_name not in", values, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameBetween(String value1, String value2) {
            addCriterion("partner_name between", value1, value2, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerNameNotBetween(String value1, String value2) {
            addCriterion("partner_name not between", value1, value2, "partnerName");
            return (Criteria) this;
        }

        public Criteria andPartnerLinkAddrIsNull() {
            addCriterion("partner_link_addr is null");
            return (Criteria) this;
        }

        public Criteria andPartnerLinkAddrIsNotNull() {
            addCriterion("partner_link_addr is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerLinkAddrEqualTo(String value) {
            addCriterion("partner_link_addr =", value, "partnerLinkAddr");
            return (Criteria) this;
        }

        public Criteria andPartnerLinkAddrNotEqualTo(String value) {
            addCriterion("partner_link_addr <>", value, "partnerLinkAddr");
            return (Criteria) this;
        }

        public Criteria andPartnerLinkAddrGreaterThan(String value) {
            addCriterion("partner_link_addr >", value, "partnerLinkAddr");
            return (Criteria) this;
        }

        public Criteria andPartnerLinkAddrGreaterThanOrEqualTo(String value) {
            addCriterion("partner_link_addr >=", value, "partnerLinkAddr");
            return (Criteria) this;
        }

        public Criteria andPartnerLinkAddrLessThan(String value) {
            addCriterion("partner_link_addr <", value, "partnerLinkAddr");
            return (Criteria) this;
        }

        public Criteria andPartnerLinkAddrLessThanOrEqualTo(String value) {
            addCriterion("partner_link_addr <=", value, "partnerLinkAddr");
            return (Criteria) this;
        }

        public Criteria andPartnerLinkAddrLike(String value) {
            addCriterion("partner_link_addr like", value, "partnerLinkAddr");
            return (Criteria) this;
        }

        public Criteria andPartnerLinkAddrNotLike(String value) {
            addCriterion("partner_link_addr not like", value, "partnerLinkAddr");
            return (Criteria) this;
        }

        public Criteria andPartnerLinkAddrIn(List<String> values) {
            addCriterion("partner_link_addr in", values, "partnerLinkAddr");
            return (Criteria) this;
        }

        public Criteria andPartnerLinkAddrNotIn(List<String> values) {
            addCriterion("partner_link_addr not in", values, "partnerLinkAddr");
            return (Criteria) this;
        }

        public Criteria andPartnerLinkAddrBetween(String value1, String value2) {
            addCriterion("partner_link_addr between", value1, value2, "partnerLinkAddr");
            return (Criteria) this;
        }

        public Criteria andPartnerLinkAddrNotBetween(String value1, String value2) {
            addCriterion("partner_link_addr not between", value1, value2, "partnerLinkAddr");
            return (Criteria) this;
        }

        public Criteria andPartnerIsBlankIsNull() {
            addCriterion("partner_is_blank is null");
            return (Criteria) this;
        }

        public Criteria andPartnerIsBlankIsNotNull() {
            addCriterion("partner_is_blank is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerIsBlankEqualTo(String value) {
            addCriterion("partner_is_blank =", value, "partnerIsBlank");
            return (Criteria) this;
        }

        public Criteria andPartnerIsBlankNotEqualTo(String value) {
            addCriterion("partner_is_blank <>", value, "partnerIsBlank");
            return (Criteria) this;
        }

        public Criteria andPartnerIsBlankGreaterThan(String value) {
            addCriterion("partner_is_blank >", value, "partnerIsBlank");
            return (Criteria) this;
        }

        public Criteria andPartnerIsBlankGreaterThanOrEqualTo(String value) {
            addCriterion("partner_is_blank >=", value, "partnerIsBlank");
            return (Criteria) this;
        }

        public Criteria andPartnerIsBlankLessThan(String value) {
            addCriterion("partner_is_blank <", value, "partnerIsBlank");
            return (Criteria) this;
        }

        public Criteria andPartnerIsBlankLessThanOrEqualTo(String value) {
            addCriterion("partner_is_blank <=", value, "partnerIsBlank");
            return (Criteria) this;
        }

        public Criteria andPartnerIsBlankLike(String value) {
            addCriterion("partner_is_blank like", value, "partnerIsBlank");
            return (Criteria) this;
        }

        public Criteria andPartnerIsBlankNotLike(String value) {
            addCriterion("partner_is_blank not like", value, "partnerIsBlank");
            return (Criteria) this;
        }

        public Criteria andPartnerIsBlankIn(List<String> values) {
            addCriterion("partner_is_blank in", values, "partnerIsBlank");
            return (Criteria) this;
        }

        public Criteria andPartnerIsBlankNotIn(List<String> values) {
            addCriterion("partner_is_blank not in", values, "partnerIsBlank");
            return (Criteria) this;
        }

        public Criteria andPartnerIsBlankBetween(String value1, String value2) {
            addCriterion("partner_is_blank between", value1, value2, "partnerIsBlank");
            return (Criteria) this;
        }

        public Criteria andPartnerIsBlankNotBetween(String value1, String value2) {
            addCriterion("partner_is_blank not between", value1, value2, "partnerIsBlank");
            return (Criteria) this;
        }

        public Criteria andPartnerImgIsNull() {
            addCriterion("partner_img is null");
            return (Criteria) this;
        }

        public Criteria andPartnerImgIsNotNull() {
            addCriterion("partner_img is not null");
            return (Criteria) this;
        }

        public Criteria andPartnerImgEqualTo(String value) {
            addCriterion("partner_img =", value, "partnerImg");
            return (Criteria) this;
        }

        public Criteria andPartnerImgNotEqualTo(String value) {
            addCriterion("partner_img <>", value, "partnerImg");
            return (Criteria) this;
        }

        public Criteria andPartnerImgGreaterThan(String value) {
            addCriterion("partner_img >", value, "partnerImg");
            return (Criteria) this;
        }

        public Criteria andPartnerImgGreaterThanOrEqualTo(String value) {
            addCriterion("partner_img >=", value, "partnerImg");
            return (Criteria) this;
        }

        public Criteria andPartnerImgLessThan(String value) {
            addCriterion("partner_img <", value, "partnerImg");
            return (Criteria) this;
        }

        public Criteria andPartnerImgLessThanOrEqualTo(String value) {
            addCriterion("partner_img <=", value, "partnerImg");
            return (Criteria) this;
        }

        public Criteria andPartnerImgLike(String value) {
            addCriterion("partner_img like", value, "partnerImg");
            return (Criteria) this;
        }

        public Criteria andPartnerImgNotLike(String value) {
            addCriterion("partner_img not like", value, "partnerImg");
            return (Criteria) this;
        }

        public Criteria andPartnerImgIn(List<String> values) {
            addCriterion("partner_img in", values, "partnerImg");
            return (Criteria) this;
        }

        public Criteria andPartnerImgNotIn(List<String> values) {
            addCriterion("partner_img not in", values, "partnerImg");
            return (Criteria) this;
        }

        public Criteria andPartnerImgBetween(String value1, String value2) {
            addCriterion("partner_img between", value1, value2, "partnerImg");
            return (Criteria) this;
        }

        public Criteria andPartnerImgNotBetween(String value1, String value2) {
            addCriterion("partner_img not between", value1, value2, "partnerImg");
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