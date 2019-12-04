package guet.hxm.rc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplicationExample() {
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

        public Criteria andApplicationIdIsNull() {
            addCriterion("application_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("application_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdEqualTo(Long value) {
            addCriterion("application_id =", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotEqualTo(Long value) {
            addCriterion("application_id <>", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThan(Long value) {
            addCriterion("application_id >", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("application_id >=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThan(Long value) {
            addCriterion("application_id <", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(Long value) {
            addCriterion("application_id <=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIn(List<Long> values) {
            addCriterion("application_id in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotIn(List<Long> values) {
            addCriterion("application_id not in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdBetween(Long value1, Long value2) {
            addCriterion("application_id between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotBetween(Long value1, Long value2) {
            addCriterion("application_id not between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNativeAddIsNull() {
            addCriterion("native_add is null");
            return (Criteria) this;
        }

        public Criteria andNativeAddIsNotNull() {
            addCriterion("native_add is not null");
            return (Criteria) this;
        }

        public Criteria andNativeAddEqualTo(String value) {
            addCriterion("native_add =", value, "nativeAdd");
            return (Criteria) this;
        }

        public Criteria andNativeAddNotEqualTo(String value) {
            addCriterion("native_add <>", value, "nativeAdd");
            return (Criteria) this;
        }

        public Criteria andNativeAddGreaterThan(String value) {
            addCriterion("native_add >", value, "nativeAdd");
            return (Criteria) this;
        }

        public Criteria andNativeAddGreaterThanOrEqualTo(String value) {
            addCriterion("native_add >=", value, "nativeAdd");
            return (Criteria) this;
        }

        public Criteria andNativeAddLessThan(String value) {
            addCriterion("native_add <", value, "nativeAdd");
            return (Criteria) this;
        }

        public Criteria andNativeAddLessThanOrEqualTo(String value) {
            addCriterion("native_add <=", value, "nativeAdd");
            return (Criteria) this;
        }

        public Criteria andNativeAddLike(String value) {
            addCriterion("native_add like", value, "nativeAdd");
            return (Criteria) this;
        }

        public Criteria andNativeAddNotLike(String value) {
            addCriterion("native_add not like", value, "nativeAdd");
            return (Criteria) this;
        }

        public Criteria andNativeAddIn(List<String> values) {
            addCriterion("native_add in", values, "nativeAdd");
            return (Criteria) this;
        }

        public Criteria andNativeAddNotIn(List<String> values) {
            addCriterion("native_add not in", values, "nativeAdd");
            return (Criteria) this;
        }

        public Criteria andNativeAddBetween(String value1, String value2) {
            addCriterion("native_add between", value1, value2, "nativeAdd");
            return (Criteria) this;
        }

        public Criteria andNativeAddNotBetween(String value1, String value2) {
            addCriterion("native_add not between", value1, value2, "nativeAdd");
            return (Criteria) this;
        }

        public Criteria andDomicileIsNull() {
            addCriterion("domicile is null");
            return (Criteria) this;
        }

        public Criteria andDomicileIsNotNull() {
            addCriterion("domicile is not null");
            return (Criteria) this;
        }

        public Criteria andDomicileEqualTo(String value) {
            addCriterion("domicile =", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileNotEqualTo(String value) {
            addCriterion("domicile <>", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileGreaterThan(String value) {
            addCriterion("domicile >", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileGreaterThanOrEqualTo(String value) {
            addCriterion("domicile >=", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileLessThan(String value) {
            addCriterion("domicile <", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileLessThanOrEqualTo(String value) {
            addCriterion("domicile <=", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileLike(String value) {
            addCriterion("domicile like", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileNotLike(String value) {
            addCriterion("domicile not like", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileIn(List<String> values) {
            addCriterion("domicile in", values, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileNotIn(List<String> values) {
            addCriterion("domicile not in", values, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileBetween(String value1, String value2) {
            addCriterion("domicile between", value1, value2, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileNotBetween(String value1, String value2) {
            addCriterion("domicile not between", value1, value2, "domicile");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andHomeAddIsNull() {
            addCriterion("home_add is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddIsNotNull() {
            addCriterion("home_add is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddEqualTo(String value) {
            addCriterion("home_add =", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotEqualTo(String value) {
            addCriterion("home_add <>", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddGreaterThan(String value) {
            addCriterion("home_add >", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddGreaterThanOrEqualTo(String value) {
            addCriterion("home_add >=", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddLessThan(String value) {
            addCriterion("home_add <", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddLessThanOrEqualTo(String value) {
            addCriterion("home_add <=", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddLike(String value) {
            addCriterion("home_add like", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotLike(String value) {
            addCriterion("home_add not like", value, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddIn(List<String> values) {
            addCriterion("home_add in", values, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotIn(List<String> values) {
            addCriterion("home_add not in", values, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddBetween(String value1, String value2) {
            addCriterion("home_add between", value1, value2, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andHomeAddNotBetween(String value1, String value2) {
            addCriterion("home_add not between", value1, value2, "homeAdd");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNull() {
            addCriterion("agent_name is null");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNotNull() {
            addCriterion("agent_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgentNameEqualTo(String value) {
            addCriterion("agent_name =", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotEqualTo(String value) {
            addCriterion("agent_name <>", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThan(String value) {
            addCriterion("agent_name >", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_name >=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThan(String value) {
            addCriterion("agent_name <", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThanOrEqualTo(String value) {
            addCriterion("agent_name <=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLike(String value) {
            addCriterion("agent_name like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotLike(String value) {
            addCriterion("agent_name not like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameIn(List<String> values) {
            addCriterion("agent_name in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotIn(List<String> values) {
            addCriterion("agent_name not in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameBetween(String value1, String value2) {
            addCriterion("agent_name between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotBetween(String value1, String value2) {
            addCriterion("agent_name not between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentRelativeIsNull() {
            addCriterion("agent_relative is null");
            return (Criteria) this;
        }

        public Criteria andAgentRelativeIsNotNull() {
            addCriterion("agent_relative is not null");
            return (Criteria) this;
        }

        public Criteria andAgentRelativeEqualTo(String value) {
            addCriterion("agent_relative =", value, "agentRelative");
            return (Criteria) this;
        }

        public Criteria andAgentRelativeNotEqualTo(String value) {
            addCriterion("agent_relative <>", value, "agentRelative");
            return (Criteria) this;
        }

        public Criteria andAgentRelativeGreaterThan(String value) {
            addCriterion("agent_relative >", value, "agentRelative");
            return (Criteria) this;
        }

        public Criteria andAgentRelativeGreaterThanOrEqualTo(String value) {
            addCriterion("agent_relative >=", value, "agentRelative");
            return (Criteria) this;
        }

        public Criteria andAgentRelativeLessThan(String value) {
            addCriterion("agent_relative <", value, "agentRelative");
            return (Criteria) this;
        }

        public Criteria andAgentRelativeLessThanOrEqualTo(String value) {
            addCriterion("agent_relative <=", value, "agentRelative");
            return (Criteria) this;
        }

        public Criteria andAgentRelativeLike(String value) {
            addCriterion("agent_relative like", value, "agentRelative");
            return (Criteria) this;
        }

        public Criteria andAgentRelativeNotLike(String value) {
            addCriterion("agent_relative not like", value, "agentRelative");
            return (Criteria) this;
        }

        public Criteria andAgentRelativeIn(List<String> values) {
            addCriterion("agent_relative in", values, "agentRelative");
            return (Criteria) this;
        }

        public Criteria andAgentRelativeNotIn(List<String> values) {
            addCriterion("agent_relative not in", values, "agentRelative");
            return (Criteria) this;
        }

        public Criteria andAgentRelativeBetween(String value1, String value2) {
            addCriterion("agent_relative between", value1, value2, "agentRelative");
            return (Criteria) this;
        }

        public Criteria andAgentRelativeNotBetween(String value1, String value2) {
            addCriterion("agent_relative not between", value1, value2, "agentRelative");
            return (Criteria) this;
        }

        public Criteria andAgentTelephoneIsNull() {
            addCriterion("agent_telephone is null");
            return (Criteria) this;
        }

        public Criteria andAgentTelephoneIsNotNull() {
            addCriterion("agent_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andAgentTelephoneEqualTo(String value) {
            addCriterion("agent_telephone =", value, "agentTelephone");
            return (Criteria) this;
        }

        public Criteria andAgentTelephoneNotEqualTo(String value) {
            addCriterion("agent_telephone <>", value, "agentTelephone");
            return (Criteria) this;
        }

        public Criteria andAgentTelephoneGreaterThan(String value) {
            addCriterion("agent_telephone >", value, "agentTelephone");
            return (Criteria) this;
        }

        public Criteria andAgentTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("agent_telephone >=", value, "agentTelephone");
            return (Criteria) this;
        }

        public Criteria andAgentTelephoneLessThan(String value) {
            addCriterion("agent_telephone <", value, "agentTelephone");
            return (Criteria) this;
        }

        public Criteria andAgentTelephoneLessThanOrEqualTo(String value) {
            addCriterion("agent_telephone <=", value, "agentTelephone");
            return (Criteria) this;
        }

        public Criteria andAgentTelephoneLike(String value) {
            addCriterion("agent_telephone like", value, "agentTelephone");
            return (Criteria) this;
        }

        public Criteria andAgentTelephoneNotLike(String value) {
            addCriterion("agent_telephone not like", value, "agentTelephone");
            return (Criteria) this;
        }

        public Criteria andAgentTelephoneIn(List<String> values) {
            addCriterion("agent_telephone in", values, "agentTelephone");
            return (Criteria) this;
        }

        public Criteria andAgentTelephoneNotIn(List<String> values) {
            addCriterion("agent_telephone not in", values, "agentTelephone");
            return (Criteria) this;
        }

        public Criteria andAgentTelephoneBetween(String value1, String value2) {
            addCriterion("agent_telephone between", value1, value2, "agentTelephone");
            return (Criteria) this;
        }

        public Criteria andAgentTelephoneNotBetween(String value1, String value2) {
            addCriterion("agent_telephone not between", value1, value2, "agentTelephone");
            return (Criteria) this;
        }

        public Criteria andAcademicAchiIsNull() {
            addCriterion("academic_achi is null");
            return (Criteria) this;
        }

        public Criteria andAcademicAchiIsNotNull() {
            addCriterion("academic_achi is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicAchiEqualTo(String value) {
            addCriterion("academic_achi =", value, "academicAchi");
            return (Criteria) this;
        }

        public Criteria andAcademicAchiNotEqualTo(String value) {
            addCriterion("academic_achi <>", value, "academicAchi");
            return (Criteria) this;
        }

        public Criteria andAcademicAchiGreaterThan(String value) {
            addCriterion("academic_achi >", value, "academicAchi");
            return (Criteria) this;
        }

        public Criteria andAcademicAchiGreaterThanOrEqualTo(String value) {
            addCriterion("academic_achi >=", value, "academicAchi");
            return (Criteria) this;
        }

        public Criteria andAcademicAchiLessThan(String value) {
            addCriterion("academic_achi <", value, "academicAchi");
            return (Criteria) this;
        }

        public Criteria andAcademicAchiLessThanOrEqualTo(String value) {
            addCriterion("academic_achi <=", value, "academicAchi");
            return (Criteria) this;
        }

        public Criteria andAcademicAchiLike(String value) {
            addCriterion("academic_achi like", value, "academicAchi");
            return (Criteria) this;
        }

        public Criteria andAcademicAchiNotLike(String value) {
            addCriterion("academic_achi not like", value, "academicAchi");
            return (Criteria) this;
        }

        public Criteria andAcademicAchiIn(List<String> values) {
            addCriterion("academic_achi in", values, "academicAchi");
            return (Criteria) this;
        }

        public Criteria andAcademicAchiNotIn(List<String> values) {
            addCriterion("academic_achi not in", values, "academicAchi");
            return (Criteria) this;
        }

        public Criteria andAcademicAchiBetween(String value1, String value2) {
            addCriterion("academic_achi between", value1, value2, "academicAchi");
            return (Criteria) this;
        }

        public Criteria andAcademicAchiNotBetween(String value1, String value2) {
            addCriterion("academic_achi not between", value1, value2, "academicAchi");
            return (Criteria) this;
        }

        public Criteria andOnlineDataIsNull() {
            addCriterion("online_data is null");
            return (Criteria) this;
        }

        public Criteria andOnlineDataIsNotNull() {
            addCriterion("online_data is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineDataEqualTo(String value) {
            addCriterion("online_data =", value, "onlineData");
            return (Criteria) this;
        }

        public Criteria andOnlineDataNotEqualTo(String value) {
            addCriterion("online_data <>", value, "onlineData");
            return (Criteria) this;
        }

        public Criteria andOnlineDataGreaterThan(String value) {
            addCriterion("online_data >", value, "onlineData");
            return (Criteria) this;
        }

        public Criteria andOnlineDataGreaterThanOrEqualTo(String value) {
            addCriterion("online_data >=", value, "onlineData");
            return (Criteria) this;
        }

        public Criteria andOnlineDataLessThan(String value) {
            addCriterion("online_data <", value, "onlineData");
            return (Criteria) this;
        }

        public Criteria andOnlineDataLessThanOrEqualTo(String value) {
            addCriterion("online_data <=", value, "onlineData");
            return (Criteria) this;
        }

        public Criteria andOnlineDataLike(String value) {
            addCriterion("online_data like", value, "onlineData");
            return (Criteria) this;
        }

        public Criteria andOnlineDataNotLike(String value) {
            addCriterion("online_data not like", value, "onlineData");
            return (Criteria) this;
        }

        public Criteria andOnlineDataIn(List<String> values) {
            addCriterion("online_data in", values, "onlineData");
            return (Criteria) this;
        }

        public Criteria andOnlineDataNotIn(List<String> values) {
            addCriterion("online_data not in", values, "onlineData");
            return (Criteria) this;
        }

        public Criteria andOnlineDataBetween(String value1, String value2) {
            addCriterion("online_data between", value1, value2, "onlineData");
            return (Criteria) this;
        }

        public Criteria andOnlineDataNotBetween(String value1, String value2) {
            addCriterion("online_data not between", value1, value2, "onlineData");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("school is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("school is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("school =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("school <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("school >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("school >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("school <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("school <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("school like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("school not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("school in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("school not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("school between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("school not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andResearchFieldIsNull() {
            addCriterion("research_field is null");
            return (Criteria) this;
        }

        public Criteria andResearchFieldIsNotNull() {
            addCriterion("research_field is not null");
            return (Criteria) this;
        }

        public Criteria andResearchFieldEqualTo(String value) {
            addCriterion("research_field =", value, "researchField");
            return (Criteria) this;
        }

        public Criteria andResearchFieldNotEqualTo(String value) {
            addCriterion("research_field <>", value, "researchField");
            return (Criteria) this;
        }

        public Criteria andResearchFieldGreaterThan(String value) {
            addCriterion("research_field >", value, "researchField");
            return (Criteria) this;
        }

        public Criteria andResearchFieldGreaterThanOrEqualTo(String value) {
            addCriterion("research_field >=", value, "researchField");
            return (Criteria) this;
        }

        public Criteria andResearchFieldLessThan(String value) {
            addCriterion("research_field <", value, "researchField");
            return (Criteria) this;
        }

        public Criteria andResearchFieldLessThanOrEqualTo(String value) {
            addCriterion("research_field <=", value, "researchField");
            return (Criteria) this;
        }

        public Criteria andResearchFieldLike(String value) {
            addCriterion("research_field like", value, "researchField");
            return (Criteria) this;
        }

        public Criteria andResearchFieldNotLike(String value) {
            addCriterion("research_field not like", value, "researchField");
            return (Criteria) this;
        }

        public Criteria andResearchFieldIn(List<String> values) {
            addCriterion("research_field in", values, "researchField");
            return (Criteria) this;
        }

        public Criteria andResearchFieldNotIn(List<String> values) {
            addCriterion("research_field not in", values, "researchField");
            return (Criteria) this;
        }

        public Criteria andResearchFieldBetween(String value1, String value2) {
            addCriterion("research_field between", value1, value2, "researchField");
            return (Criteria) this;
        }

        public Criteria andResearchFieldNotBetween(String value1, String value2) {
            addCriterion("research_field not between", value1, value2, "researchField");
            return (Criteria) this;
        }

        public Criteria andStartEduTimeIsNull() {
            addCriterion("start_edu_time is null");
            return (Criteria) this;
        }

        public Criteria andStartEduTimeIsNotNull() {
            addCriterion("start_edu_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartEduTimeEqualTo(Date value) {
            addCriterionForJDBCDate("start_edu_time =", value, "startEduTime");
            return (Criteria) this;
        }

        public Criteria andStartEduTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_edu_time <>", value, "startEduTime");
            return (Criteria) this;
        }

        public Criteria andStartEduTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("start_edu_time >", value, "startEduTime");
            return (Criteria) this;
        }

        public Criteria andStartEduTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_edu_time >=", value, "startEduTime");
            return (Criteria) this;
        }

        public Criteria andStartEduTimeLessThan(Date value) {
            addCriterionForJDBCDate("start_edu_time <", value, "startEduTime");
            return (Criteria) this;
        }

        public Criteria andStartEduTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_edu_time <=", value, "startEduTime");
            return (Criteria) this;
        }

        public Criteria andStartEduTimeIn(List<Date> values) {
            addCriterionForJDBCDate("start_edu_time in", values, "startEduTime");
            return (Criteria) this;
        }

        public Criteria andStartEduTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_edu_time not in", values, "startEduTime");
            return (Criteria) this;
        }

        public Criteria andStartEduTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_edu_time between", value1, value2, "startEduTime");
            return (Criteria) this;
        }

        public Criteria andStartEduTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_edu_time not between", value1, value2, "startEduTime");
            return (Criteria) this;
        }

        public Criteria andEndEduTimeIsNull() {
            addCriterion("end_edu_time is null");
            return (Criteria) this;
        }

        public Criteria andEndEduTimeIsNotNull() {
            addCriterion("end_edu_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndEduTimeEqualTo(Date value) {
            addCriterionForJDBCDate("end_edu_time =", value, "endEduTime");
            return (Criteria) this;
        }

        public Criteria andEndEduTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_edu_time <>", value, "endEduTime");
            return (Criteria) this;
        }

        public Criteria andEndEduTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("end_edu_time >", value, "endEduTime");
            return (Criteria) this;
        }

        public Criteria andEndEduTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_edu_time >=", value, "endEduTime");
            return (Criteria) this;
        }

        public Criteria andEndEduTimeLessThan(Date value) {
            addCriterionForJDBCDate("end_edu_time <", value, "endEduTime");
            return (Criteria) this;
        }

        public Criteria andEndEduTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_edu_time <=", value, "endEduTime");
            return (Criteria) this;
        }

        public Criteria andEndEduTimeIn(List<Date> values) {
            addCriterionForJDBCDate("end_edu_time in", values, "endEduTime");
            return (Criteria) this;
        }

        public Criteria andEndEduTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_edu_time not in", values, "endEduTime");
            return (Criteria) this;
        }

        public Criteria andEndEduTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_edu_time between", value1, value2, "endEduTime");
            return (Criteria) this;
        }

        public Criteria andEndEduTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_edu_time not between", value1, value2, "endEduTime");
            return (Criteria) this;
        }

        public Criteria andDegreeStatusIsNull() {
            addCriterion("degree_status is null");
            return (Criteria) this;
        }

        public Criteria andDegreeStatusIsNotNull() {
            addCriterion("degree_status is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeStatusEqualTo(String value) {
            addCriterion("degree_status =", value, "degreeStatus");
            return (Criteria) this;
        }

        public Criteria andDegreeStatusNotEqualTo(String value) {
            addCriterion("degree_status <>", value, "degreeStatus");
            return (Criteria) this;
        }

        public Criteria andDegreeStatusGreaterThan(String value) {
            addCriterion("degree_status >", value, "degreeStatus");
            return (Criteria) this;
        }

        public Criteria andDegreeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("degree_status >=", value, "degreeStatus");
            return (Criteria) this;
        }

        public Criteria andDegreeStatusLessThan(String value) {
            addCriterion("degree_status <", value, "degreeStatus");
            return (Criteria) this;
        }

        public Criteria andDegreeStatusLessThanOrEqualTo(String value) {
            addCriterion("degree_status <=", value, "degreeStatus");
            return (Criteria) this;
        }

        public Criteria andDegreeStatusLike(String value) {
            addCriterion("degree_status like", value, "degreeStatus");
            return (Criteria) this;
        }

        public Criteria andDegreeStatusNotLike(String value) {
            addCriterion("degree_status not like", value, "degreeStatus");
            return (Criteria) this;
        }

        public Criteria andDegreeStatusIn(List<String> values) {
            addCriterion("degree_status in", values, "degreeStatus");
            return (Criteria) this;
        }

        public Criteria andDegreeStatusNotIn(List<String> values) {
            addCriterion("degree_status not in", values, "degreeStatus");
            return (Criteria) this;
        }

        public Criteria andDegreeStatusBetween(String value1, String value2) {
            addCriterion("degree_status between", value1, value2, "degreeStatus");
            return (Criteria) this;
        }

        public Criteria andDegreeStatusNotBetween(String value1, String value2) {
            addCriterion("degree_status not between", value1, value2, "degreeStatus");
            return (Criteria) this;
        }

        public Criteria andDegreeNameIsNull() {
            addCriterion("degree_name is null");
            return (Criteria) this;
        }

        public Criteria andDegreeNameIsNotNull() {
            addCriterion("degree_name is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeNameEqualTo(String value) {
            addCriterion("degree_name =", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameNotEqualTo(String value) {
            addCriterion("degree_name <>", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameGreaterThan(String value) {
            addCriterion("degree_name >", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("degree_name >=", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameLessThan(String value) {
            addCriterion("degree_name <", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameLessThanOrEqualTo(String value) {
            addCriterion("degree_name <=", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameLike(String value) {
            addCriterion("degree_name like", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameNotLike(String value) {
            addCriterion("degree_name not like", value, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameIn(List<String> values) {
            addCriterion("degree_name in", values, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameNotIn(List<String> values) {
            addCriterion("degree_name not in", values, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameBetween(String value1, String value2) {
            addCriterion("degree_name between", value1, value2, "degreeName");
            return (Criteria) this;
        }

        public Criteria andDegreeNameNotBetween(String value1, String value2) {
            addCriterion("degree_name not between", value1, value2, "degreeName");
            return (Criteria) this;
        }

        public Criteria andCourceScoreIsNull() {
            addCriterion("cource_score is null");
            return (Criteria) this;
        }

        public Criteria andCourceScoreIsNotNull() {
            addCriterion("cource_score is not null");
            return (Criteria) this;
        }

        public Criteria andCourceScoreEqualTo(String value) {
            addCriterion("cource_score =", value, "courceScore");
            return (Criteria) this;
        }

        public Criteria andCourceScoreNotEqualTo(String value) {
            addCriterion("cource_score <>", value, "courceScore");
            return (Criteria) this;
        }

        public Criteria andCourceScoreGreaterThan(String value) {
            addCriterion("cource_score >", value, "courceScore");
            return (Criteria) this;
        }

        public Criteria andCourceScoreGreaterThanOrEqualTo(String value) {
            addCriterion("cource_score >=", value, "courceScore");
            return (Criteria) this;
        }

        public Criteria andCourceScoreLessThan(String value) {
            addCriterion("cource_score <", value, "courceScore");
            return (Criteria) this;
        }

        public Criteria andCourceScoreLessThanOrEqualTo(String value) {
            addCriterion("cource_score <=", value, "courceScore");
            return (Criteria) this;
        }

        public Criteria andCourceScoreLike(String value) {
            addCriterion("cource_score like", value, "courceScore");
            return (Criteria) this;
        }

        public Criteria andCourceScoreNotLike(String value) {
            addCriterion("cource_score not like", value, "courceScore");
            return (Criteria) this;
        }

        public Criteria andCourceScoreIn(List<String> values) {
            addCriterion("cource_score in", values, "courceScore");
            return (Criteria) this;
        }

        public Criteria andCourceScoreNotIn(List<String> values) {
            addCriterion("cource_score not in", values, "courceScore");
            return (Criteria) this;
        }

        public Criteria andCourceScoreBetween(String value1, String value2) {
            addCriterion("cource_score between", value1, value2, "courceScore");
            return (Criteria) this;
        }

        public Criteria andCourceScoreNotBetween(String value1, String value2) {
            addCriterion("cource_score not between", value1, value2, "courceScore");
            return (Criteria) this;
        }

        public Criteria andMainLanguageIsNull() {
            addCriterion("main_language is null");
            return (Criteria) this;
        }

        public Criteria andMainLanguageIsNotNull() {
            addCriterion("main_language is not null");
            return (Criteria) this;
        }

        public Criteria andMainLanguageEqualTo(String value) {
            addCriterion("main_language =", value, "mainLanguage");
            return (Criteria) this;
        }

        public Criteria andMainLanguageNotEqualTo(String value) {
            addCriterion("main_language <>", value, "mainLanguage");
            return (Criteria) this;
        }

        public Criteria andMainLanguageGreaterThan(String value) {
            addCriterion("main_language >", value, "mainLanguage");
            return (Criteria) this;
        }

        public Criteria andMainLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("main_language >=", value, "mainLanguage");
            return (Criteria) this;
        }

        public Criteria andMainLanguageLessThan(String value) {
            addCriterion("main_language <", value, "mainLanguage");
            return (Criteria) this;
        }

        public Criteria andMainLanguageLessThanOrEqualTo(String value) {
            addCriterion("main_language <=", value, "mainLanguage");
            return (Criteria) this;
        }

        public Criteria andMainLanguageLike(String value) {
            addCriterion("main_language like", value, "mainLanguage");
            return (Criteria) this;
        }

        public Criteria andMainLanguageNotLike(String value) {
            addCriterion("main_language not like", value, "mainLanguage");
            return (Criteria) this;
        }

        public Criteria andMainLanguageIn(List<String> values) {
            addCriterion("main_language in", values, "mainLanguage");
            return (Criteria) this;
        }

        public Criteria andMainLanguageNotIn(List<String> values) {
            addCriterion("main_language not in", values, "mainLanguage");
            return (Criteria) this;
        }

        public Criteria andMainLanguageBetween(String value1, String value2) {
            addCriterion("main_language between", value1, value2, "mainLanguage");
            return (Criteria) this;
        }

        public Criteria andMainLanguageNotBetween(String value1, String value2) {
            addCriterion("main_language not between", value1, value2, "mainLanguage");
            return (Criteria) this;
        }

        public Criteria andLanguageNameIsNull() {
            addCriterion("language_name is null");
            return (Criteria) this;
        }

        public Criteria andLanguageNameIsNotNull() {
            addCriterion("language_name is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageNameEqualTo(String value) {
            addCriterion("language_name =", value, "languageName");
            return (Criteria) this;
        }

        public Criteria andLanguageNameNotEqualTo(String value) {
            addCriterion("language_name <>", value, "languageName");
            return (Criteria) this;
        }

        public Criteria andLanguageNameGreaterThan(String value) {
            addCriterion("language_name >", value, "languageName");
            return (Criteria) this;
        }

        public Criteria andLanguageNameGreaterThanOrEqualTo(String value) {
            addCriterion("language_name >=", value, "languageName");
            return (Criteria) this;
        }

        public Criteria andLanguageNameLessThan(String value) {
            addCriterion("language_name <", value, "languageName");
            return (Criteria) this;
        }

        public Criteria andLanguageNameLessThanOrEqualTo(String value) {
            addCriterion("language_name <=", value, "languageName");
            return (Criteria) this;
        }

        public Criteria andLanguageNameLike(String value) {
            addCriterion("language_name like", value, "languageName");
            return (Criteria) this;
        }

        public Criteria andLanguageNameNotLike(String value) {
            addCriterion("language_name not like", value, "languageName");
            return (Criteria) this;
        }

        public Criteria andLanguageNameIn(List<String> values) {
            addCriterion("language_name in", values, "languageName");
            return (Criteria) this;
        }

        public Criteria andLanguageNameNotIn(List<String> values) {
            addCriterion("language_name not in", values, "languageName");
            return (Criteria) this;
        }

        public Criteria andLanguageNameBetween(String value1, String value2) {
            addCriterion("language_name between", value1, value2, "languageName");
            return (Criteria) this;
        }

        public Criteria andLanguageNameNotBetween(String value1, String value2) {
            addCriterion("language_name not between", value1, value2, "languageName");
            return (Criteria) this;
        }

        public Criteria andTestTimeIsNull() {
            addCriterion("test_time is null");
            return (Criteria) this;
        }

        public Criteria andTestTimeIsNotNull() {
            addCriterion("test_time is not null");
            return (Criteria) this;
        }

        public Criteria andTestTimeEqualTo(Date value) {
            addCriterionForJDBCDate("test_time =", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("test_time <>", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("test_time >", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("test_time >=", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeLessThan(Date value) {
            addCriterionForJDBCDate("test_time <", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("test_time <=", value, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeIn(List<Date> values) {
            addCriterionForJDBCDate("test_time in", values, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("test_time not in", values, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("test_time between", value1, value2, "testTime");
            return (Criteria) this;
        }

        public Criteria andTestTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("test_time not between", value1, value2, "testTime");
            return (Criteria) this;
        }

        public Criteria andLanguageScoreIsNull() {
            addCriterion("language_score is null");
            return (Criteria) this;
        }

        public Criteria andLanguageScoreIsNotNull() {
            addCriterion("language_score is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageScoreEqualTo(String value) {
            addCriterion("language_score =", value, "languageScore");
            return (Criteria) this;
        }

        public Criteria andLanguageScoreNotEqualTo(String value) {
            addCriterion("language_score <>", value, "languageScore");
            return (Criteria) this;
        }

        public Criteria andLanguageScoreGreaterThan(String value) {
            addCriterion("language_score >", value, "languageScore");
            return (Criteria) this;
        }

        public Criteria andLanguageScoreGreaterThanOrEqualTo(String value) {
            addCriterion("language_score >=", value, "languageScore");
            return (Criteria) this;
        }

        public Criteria andLanguageScoreLessThan(String value) {
            addCriterion("language_score <", value, "languageScore");
            return (Criteria) this;
        }

        public Criteria andLanguageScoreLessThanOrEqualTo(String value) {
            addCriterion("language_score <=", value, "languageScore");
            return (Criteria) this;
        }

        public Criteria andLanguageScoreLike(String value) {
            addCriterion("language_score like", value, "languageScore");
            return (Criteria) this;
        }

        public Criteria andLanguageScoreNotLike(String value) {
            addCriterion("language_score not like", value, "languageScore");
            return (Criteria) this;
        }

        public Criteria andLanguageScoreIn(List<String> values) {
            addCriterion("language_score in", values, "languageScore");
            return (Criteria) this;
        }

        public Criteria andLanguageScoreNotIn(List<String> values) {
            addCriterion("language_score not in", values, "languageScore");
            return (Criteria) this;
        }

        public Criteria andLanguageScoreBetween(String value1, String value2) {
            addCriterion("language_score between", value1, value2, "languageScore");
            return (Criteria) this;
        }

        public Criteria andLanguageScoreNotBetween(String value1, String value2) {
            addCriterion("language_score not between", value1, value2, "languageScore");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIsNull() {
            addCriterion("project_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIsNotNull() {
            addCriterion("project_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_time =", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_time <>", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("project_start_time >", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_time >=", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("project_start_time <", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_start_time <=", value, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("project_start_time in", values, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_start_time not in", values, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_start_time between", value1, value2, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_start_time not between", value1, value2, "projectStartTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIsNull() {
            addCriterion("project_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIsNotNull() {
            addCriterion("project_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("project_end_time =", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("project_end_time <>", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("project_end_time >", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_end_time >=", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("project_end_time <", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("project_end_time <=", value, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("project_end_time in", values, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("project_end_time not in", values, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_end_time between", value1, value2, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("project_end_time not between", value1, value2, "projectEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectAddIsNull() {
            addCriterion("project_add is null");
            return (Criteria) this;
        }

        public Criteria andProjectAddIsNotNull() {
            addCriterion("project_add is not null");
            return (Criteria) this;
        }

        public Criteria andProjectAddEqualTo(String value) {
            addCriterion("project_add =", value, "projectAdd");
            return (Criteria) this;
        }

        public Criteria andProjectAddNotEqualTo(String value) {
            addCriterion("project_add <>", value, "projectAdd");
            return (Criteria) this;
        }

        public Criteria andProjectAddGreaterThan(String value) {
            addCriterion("project_add >", value, "projectAdd");
            return (Criteria) this;
        }

        public Criteria andProjectAddGreaterThanOrEqualTo(String value) {
            addCriterion("project_add >=", value, "projectAdd");
            return (Criteria) this;
        }

        public Criteria andProjectAddLessThan(String value) {
            addCriterion("project_add <", value, "projectAdd");
            return (Criteria) this;
        }

        public Criteria andProjectAddLessThanOrEqualTo(String value) {
            addCriterion("project_add <=", value, "projectAdd");
            return (Criteria) this;
        }

        public Criteria andProjectAddLike(String value) {
            addCriterion("project_add like", value, "projectAdd");
            return (Criteria) this;
        }

        public Criteria andProjectAddNotLike(String value) {
            addCriterion("project_add not like", value, "projectAdd");
            return (Criteria) this;
        }

        public Criteria andProjectAddIn(List<String> values) {
            addCriterion("project_add in", values, "projectAdd");
            return (Criteria) this;
        }

        public Criteria andProjectAddNotIn(List<String> values) {
            addCriterion("project_add not in", values, "projectAdd");
            return (Criteria) this;
        }

        public Criteria andProjectAddBetween(String value1, String value2) {
            addCriterion("project_add between", value1, value2, "projectAdd");
            return (Criteria) this;
        }

        public Criteria andProjectAddNotBetween(String value1, String value2) {
            addCriterion("project_add not between", value1, value2, "projectAdd");
            return (Criteria) this;
        }

        public Criteria andProjectExplainIsNull() {
            addCriterion("project_explain is null");
            return (Criteria) this;
        }

        public Criteria andProjectExplainIsNotNull() {
            addCriterion("project_explain is not null");
            return (Criteria) this;
        }

        public Criteria andProjectExplainEqualTo(String value) {
            addCriterion("project_explain =", value, "projectExplain");
            return (Criteria) this;
        }

        public Criteria andProjectExplainNotEqualTo(String value) {
            addCriterion("project_explain <>", value, "projectExplain");
            return (Criteria) this;
        }

        public Criteria andProjectExplainGreaterThan(String value) {
            addCriterion("project_explain >", value, "projectExplain");
            return (Criteria) this;
        }

        public Criteria andProjectExplainGreaterThanOrEqualTo(String value) {
            addCriterion("project_explain >=", value, "projectExplain");
            return (Criteria) this;
        }

        public Criteria andProjectExplainLessThan(String value) {
            addCriterion("project_explain <", value, "projectExplain");
            return (Criteria) this;
        }

        public Criteria andProjectExplainLessThanOrEqualTo(String value) {
            addCriterion("project_explain <=", value, "projectExplain");
            return (Criteria) this;
        }

        public Criteria andProjectExplainLike(String value) {
            addCriterion("project_explain like", value, "projectExplain");
            return (Criteria) this;
        }

        public Criteria andProjectExplainNotLike(String value) {
            addCriterion("project_explain not like", value, "projectExplain");
            return (Criteria) this;
        }

        public Criteria andProjectExplainIn(List<String> values) {
            addCriterion("project_explain in", values, "projectExplain");
            return (Criteria) this;
        }

        public Criteria andProjectExplainNotIn(List<String> values) {
            addCriterion("project_explain not in", values, "projectExplain");
            return (Criteria) this;
        }

        public Criteria andProjectExplainBetween(String value1, String value2) {
            addCriterion("project_explain between", value1, value2, "projectExplain");
            return (Criteria) this;
        }

        public Criteria andProjectExplainNotBetween(String value1, String value2) {
            addCriterion("project_explain not between", value1, value2, "projectExplain");
            return (Criteria) this;
        }

        public Criteria andExperienceTypeIsNull() {
            addCriterion("experience_type is null");
            return (Criteria) this;
        }

        public Criteria andExperienceTypeIsNotNull() {
            addCriterion("experience_type is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceTypeEqualTo(String value) {
            addCriterion("experience_type =", value, "experienceType");
            return (Criteria) this;
        }

        public Criteria andExperienceTypeNotEqualTo(String value) {
            addCriterion("experience_type <>", value, "experienceType");
            return (Criteria) this;
        }

        public Criteria andExperienceTypeGreaterThan(String value) {
            addCriterion("experience_type >", value, "experienceType");
            return (Criteria) this;
        }

        public Criteria andExperienceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("experience_type >=", value, "experienceType");
            return (Criteria) this;
        }

        public Criteria andExperienceTypeLessThan(String value) {
            addCriterion("experience_type <", value, "experienceType");
            return (Criteria) this;
        }

        public Criteria andExperienceTypeLessThanOrEqualTo(String value) {
            addCriterion("experience_type <=", value, "experienceType");
            return (Criteria) this;
        }

        public Criteria andExperienceTypeLike(String value) {
            addCriterion("experience_type like", value, "experienceType");
            return (Criteria) this;
        }

        public Criteria andExperienceTypeNotLike(String value) {
            addCriterion("experience_type not like", value, "experienceType");
            return (Criteria) this;
        }

        public Criteria andExperienceTypeIn(List<String> values) {
            addCriterion("experience_type in", values, "experienceType");
            return (Criteria) this;
        }

        public Criteria andExperienceTypeNotIn(List<String> values) {
            addCriterion("experience_type not in", values, "experienceType");
            return (Criteria) this;
        }

        public Criteria andExperienceTypeBetween(String value1, String value2) {
            addCriterion("experience_type between", value1, value2, "experienceType");
            return (Criteria) this;
        }

        public Criteria andExperienceTypeNotBetween(String value1, String value2) {
            addCriterion("experience_type not between", value1, value2, "experienceType");
            return (Criteria) this;
        }

        public Criteria andExperStartTimeIsNull() {
            addCriterion("exper_start_time is null");
            return (Criteria) this;
        }

        public Criteria andExperStartTimeIsNotNull() {
            addCriterion("exper_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andExperStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("exper_start_time =", value, "experStartTime");
            return (Criteria) this;
        }

        public Criteria andExperStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("exper_start_time <>", value, "experStartTime");
            return (Criteria) this;
        }

        public Criteria andExperStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("exper_start_time >", value, "experStartTime");
            return (Criteria) this;
        }

        public Criteria andExperStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exper_start_time >=", value, "experStartTime");
            return (Criteria) this;
        }

        public Criteria andExperStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("exper_start_time <", value, "experStartTime");
            return (Criteria) this;
        }

        public Criteria andExperStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exper_start_time <=", value, "experStartTime");
            return (Criteria) this;
        }

        public Criteria andExperStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("exper_start_time in", values, "experStartTime");
            return (Criteria) this;
        }

        public Criteria andExperStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("exper_start_time not in", values, "experStartTime");
            return (Criteria) this;
        }

        public Criteria andExperStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exper_start_time between", value1, value2, "experStartTime");
            return (Criteria) this;
        }

        public Criteria andExperStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exper_start_time not between", value1, value2, "experStartTime");
            return (Criteria) this;
        }

        public Criteria andExperEndTimeIsNull() {
            addCriterion("exper_end_time is null");
            return (Criteria) this;
        }

        public Criteria andExperEndTimeIsNotNull() {
            addCriterion("exper_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andExperEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("exper_end_time =", value, "experEndTime");
            return (Criteria) this;
        }

        public Criteria andExperEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("exper_end_time <>", value, "experEndTime");
            return (Criteria) this;
        }

        public Criteria andExperEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("exper_end_time >", value, "experEndTime");
            return (Criteria) this;
        }

        public Criteria andExperEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exper_end_time >=", value, "experEndTime");
            return (Criteria) this;
        }

        public Criteria andExperEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("exper_end_time <", value, "experEndTime");
            return (Criteria) this;
        }

        public Criteria andExperEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("exper_end_time <=", value, "experEndTime");
            return (Criteria) this;
        }

        public Criteria andExperEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("exper_end_time in", values, "experEndTime");
            return (Criteria) this;
        }

        public Criteria andExperEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("exper_end_time not in", values, "experEndTime");
            return (Criteria) this;
        }

        public Criteria andExperEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exper_end_time between", value1, value2, "experEndTime");
            return (Criteria) this;
        }

        public Criteria andExperEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("exper_end_time not between", value1, value2, "experEndTime");
            return (Criteria) this;
        }

        public Criteria andExperienceAddIsNull() {
            addCriterion("experience_add is null");
            return (Criteria) this;
        }

        public Criteria andExperienceAddIsNotNull() {
            addCriterion("experience_add is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceAddEqualTo(String value) {
            addCriterion("experience_add =", value, "experienceAdd");
            return (Criteria) this;
        }

        public Criteria andExperienceAddNotEqualTo(String value) {
            addCriterion("experience_add <>", value, "experienceAdd");
            return (Criteria) this;
        }

        public Criteria andExperienceAddGreaterThan(String value) {
            addCriterion("experience_add >", value, "experienceAdd");
            return (Criteria) this;
        }

        public Criteria andExperienceAddGreaterThanOrEqualTo(String value) {
            addCriterion("experience_add >=", value, "experienceAdd");
            return (Criteria) this;
        }

        public Criteria andExperienceAddLessThan(String value) {
            addCriterion("experience_add <", value, "experienceAdd");
            return (Criteria) this;
        }

        public Criteria andExperienceAddLessThanOrEqualTo(String value) {
            addCriterion("experience_add <=", value, "experienceAdd");
            return (Criteria) this;
        }

        public Criteria andExperienceAddLike(String value) {
            addCriterion("experience_add like", value, "experienceAdd");
            return (Criteria) this;
        }

        public Criteria andExperienceAddNotLike(String value) {
            addCriterion("experience_add not like", value, "experienceAdd");
            return (Criteria) this;
        }

        public Criteria andExperienceAddIn(List<String> values) {
            addCriterion("experience_add in", values, "experienceAdd");
            return (Criteria) this;
        }

        public Criteria andExperienceAddNotIn(List<String> values) {
            addCriterion("experience_add not in", values, "experienceAdd");
            return (Criteria) this;
        }

        public Criteria andExperienceAddBetween(String value1, String value2) {
            addCriterion("experience_add between", value1, value2, "experienceAdd");
            return (Criteria) this;
        }

        public Criteria andExperienceAddNotBetween(String value1, String value2) {
            addCriterion("experience_add not between", value1, value2, "experienceAdd");
            return (Criteria) this;
        }

        public Criteria andExperienceExplainIsNull() {
            addCriterion("experience_explain is null");
            return (Criteria) this;
        }

        public Criteria andExperienceExplainIsNotNull() {
            addCriterion("experience_explain is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceExplainEqualTo(String value) {
            addCriterion("experience_explain =", value, "experienceExplain");
            return (Criteria) this;
        }

        public Criteria andExperienceExplainNotEqualTo(String value) {
            addCriterion("experience_explain <>", value, "experienceExplain");
            return (Criteria) this;
        }

        public Criteria andExperienceExplainGreaterThan(String value) {
            addCriterion("experience_explain >", value, "experienceExplain");
            return (Criteria) this;
        }

        public Criteria andExperienceExplainGreaterThanOrEqualTo(String value) {
            addCriterion("experience_explain >=", value, "experienceExplain");
            return (Criteria) this;
        }

        public Criteria andExperienceExplainLessThan(String value) {
            addCriterion("experience_explain <", value, "experienceExplain");
            return (Criteria) this;
        }

        public Criteria andExperienceExplainLessThanOrEqualTo(String value) {
            addCriterion("experience_explain <=", value, "experienceExplain");
            return (Criteria) this;
        }

        public Criteria andExperienceExplainLike(String value) {
            addCriterion("experience_explain like", value, "experienceExplain");
            return (Criteria) this;
        }

        public Criteria andExperienceExplainNotLike(String value) {
            addCriterion("experience_explain not like", value, "experienceExplain");
            return (Criteria) this;
        }

        public Criteria andExperienceExplainIn(List<String> values) {
            addCriterion("experience_explain in", values, "experienceExplain");
            return (Criteria) this;
        }

        public Criteria andExperienceExplainNotIn(List<String> values) {
            addCriterion("experience_explain not in", values, "experienceExplain");
            return (Criteria) this;
        }

        public Criteria andExperienceExplainBetween(String value1, String value2) {
            addCriterion("experience_explain between", value1, value2, "experienceExplain");
            return (Criteria) this;
        }

        public Criteria andExperienceExplainNotBetween(String value1, String value2) {
            addCriterion("experience_explain not between", value1, value2, "experienceExplain");
            return (Criteria) this;
        }

        public Criteria andHonorIsNull() {
            addCriterion("honor is null");
            return (Criteria) this;
        }

        public Criteria andHonorIsNotNull() {
            addCriterion("honor is not null");
            return (Criteria) this;
        }

        public Criteria andHonorEqualTo(String value) {
            addCriterion("honor =", value, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorNotEqualTo(String value) {
            addCriterion("honor <>", value, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorGreaterThan(String value) {
            addCriterion("honor >", value, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorGreaterThanOrEqualTo(String value) {
            addCriterion("honor >=", value, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorLessThan(String value) {
            addCriterion("honor <", value, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorLessThanOrEqualTo(String value) {
            addCriterion("honor <=", value, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorLike(String value) {
            addCriterion("honor like", value, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorNotLike(String value) {
            addCriterion("honor not like", value, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorIn(List<String> values) {
            addCriterion("honor in", values, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorNotIn(List<String> values) {
            addCriterion("honor not in", values, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorBetween(String value1, String value2) {
            addCriterion("honor between", value1, value2, "honor");
            return (Criteria) this;
        }

        public Criteria andHonorNotBetween(String value1, String value2) {
            addCriterion("honor not between", value1, value2, "honor");
            return (Criteria) this;
        }

        public Criteria andSanctionIsNull() {
            addCriterion("sanction is null");
            return (Criteria) this;
        }

        public Criteria andSanctionIsNotNull() {
            addCriterion("sanction is not null");
            return (Criteria) this;
        }

        public Criteria andSanctionEqualTo(String value) {
            addCriterion("sanction =", value, "sanction");
            return (Criteria) this;
        }

        public Criteria andSanctionNotEqualTo(String value) {
            addCriterion("sanction <>", value, "sanction");
            return (Criteria) this;
        }

        public Criteria andSanctionGreaterThan(String value) {
            addCriterion("sanction >", value, "sanction");
            return (Criteria) this;
        }

        public Criteria andSanctionGreaterThanOrEqualTo(String value) {
            addCriterion("sanction >=", value, "sanction");
            return (Criteria) this;
        }

        public Criteria andSanctionLessThan(String value) {
            addCriterion("sanction <", value, "sanction");
            return (Criteria) this;
        }

        public Criteria andSanctionLessThanOrEqualTo(String value) {
            addCriterion("sanction <=", value, "sanction");
            return (Criteria) this;
        }

        public Criteria andSanctionLike(String value) {
            addCriterion("sanction like", value, "sanction");
            return (Criteria) this;
        }

        public Criteria andSanctionNotLike(String value) {
            addCriterion("sanction not like", value, "sanction");
            return (Criteria) this;
        }

        public Criteria andSanctionIn(List<String> values) {
            addCriterion("sanction in", values, "sanction");
            return (Criteria) this;
        }

        public Criteria andSanctionNotIn(List<String> values) {
            addCriterion("sanction not in", values, "sanction");
            return (Criteria) this;
        }

        public Criteria andSanctionBetween(String value1, String value2) {
            addCriterion("sanction between", value1, value2, "sanction");
            return (Criteria) this;
        }

        public Criteria andSanctionNotBetween(String value1, String value2) {
            addCriterion("sanction not between", value1, value2, "sanction");
            return (Criteria) this;
        }

        public Criteria andSanctionExpainIsNull() {
            addCriterion("sanction_expain is null");
            return (Criteria) this;
        }

        public Criteria andSanctionExpainIsNotNull() {
            addCriterion("sanction_expain is not null");
            return (Criteria) this;
        }

        public Criteria andSanctionExpainEqualTo(String value) {
            addCriterion("sanction_expain =", value, "sanctionExpain");
            return (Criteria) this;
        }

        public Criteria andSanctionExpainNotEqualTo(String value) {
            addCriterion("sanction_expain <>", value, "sanctionExpain");
            return (Criteria) this;
        }

        public Criteria andSanctionExpainGreaterThan(String value) {
            addCriterion("sanction_expain >", value, "sanctionExpain");
            return (Criteria) this;
        }

        public Criteria andSanctionExpainGreaterThanOrEqualTo(String value) {
            addCriterion("sanction_expain >=", value, "sanctionExpain");
            return (Criteria) this;
        }

        public Criteria andSanctionExpainLessThan(String value) {
            addCriterion("sanction_expain <", value, "sanctionExpain");
            return (Criteria) this;
        }

        public Criteria andSanctionExpainLessThanOrEqualTo(String value) {
            addCriterion("sanction_expain <=", value, "sanctionExpain");
            return (Criteria) this;
        }

        public Criteria andSanctionExpainLike(String value) {
            addCriterion("sanction_expain like", value, "sanctionExpain");
            return (Criteria) this;
        }

        public Criteria andSanctionExpainNotLike(String value) {
            addCriterion("sanction_expain not like", value, "sanctionExpain");
            return (Criteria) this;
        }

        public Criteria andSanctionExpainIn(List<String> values) {
            addCriterion("sanction_expain in", values, "sanctionExpain");
            return (Criteria) this;
        }

        public Criteria andSanctionExpainNotIn(List<String> values) {
            addCriterion("sanction_expain not in", values, "sanctionExpain");
            return (Criteria) this;
        }

        public Criteria andSanctionExpainBetween(String value1, String value2) {
            addCriterion("sanction_expain between", value1, value2, "sanctionExpain");
            return (Criteria) this;
        }

        public Criteria andSanctionExpainNotBetween(String value1, String value2) {
            addCriterion("sanction_expain not between", value1, value2, "sanctionExpain");
            return (Criteria) this;
        }

        public Criteria andRefereeNameIsNull() {
            addCriterion("referee_name is null");
            return (Criteria) this;
        }

        public Criteria andRefereeNameIsNotNull() {
            addCriterion("referee_name is not null");
            return (Criteria) this;
        }

        public Criteria andRefereeNameEqualTo(String value) {
            addCriterion("referee_name =", value, "refereeName");
            return (Criteria) this;
        }

        public Criteria andRefereeNameNotEqualTo(String value) {
            addCriterion("referee_name <>", value, "refereeName");
            return (Criteria) this;
        }

        public Criteria andRefereeNameGreaterThan(String value) {
            addCriterion("referee_name >", value, "refereeName");
            return (Criteria) this;
        }

        public Criteria andRefereeNameGreaterThanOrEqualTo(String value) {
            addCriterion("referee_name >=", value, "refereeName");
            return (Criteria) this;
        }

        public Criteria andRefereeNameLessThan(String value) {
            addCriterion("referee_name <", value, "refereeName");
            return (Criteria) this;
        }

        public Criteria andRefereeNameLessThanOrEqualTo(String value) {
            addCriterion("referee_name <=", value, "refereeName");
            return (Criteria) this;
        }

        public Criteria andRefereeNameLike(String value) {
            addCriterion("referee_name like", value, "refereeName");
            return (Criteria) this;
        }

        public Criteria andRefereeNameNotLike(String value) {
            addCriterion("referee_name not like", value, "refereeName");
            return (Criteria) this;
        }

        public Criteria andRefereeNameIn(List<String> values) {
            addCriterion("referee_name in", values, "refereeName");
            return (Criteria) this;
        }

        public Criteria andRefereeNameNotIn(List<String> values) {
            addCriterion("referee_name not in", values, "refereeName");
            return (Criteria) this;
        }

        public Criteria andRefereeNameBetween(String value1, String value2) {
            addCriterion("referee_name between", value1, value2, "refereeName");
            return (Criteria) this;
        }

        public Criteria andRefereeNameNotBetween(String value1, String value2) {
            addCriterion("referee_name not between", value1, value2, "refereeName");
            return (Criteria) this;
        }

        public Criteria andRefereeTelephoneIsNull() {
            addCriterion("referee_telephone is null");
            return (Criteria) this;
        }

        public Criteria andRefereeTelephoneIsNotNull() {
            addCriterion("referee_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andRefereeTelephoneEqualTo(String value) {
            addCriterion("referee_telephone =", value, "refereeTelephone");
            return (Criteria) this;
        }

        public Criteria andRefereeTelephoneNotEqualTo(String value) {
            addCriterion("referee_telephone <>", value, "refereeTelephone");
            return (Criteria) this;
        }

        public Criteria andRefereeTelephoneGreaterThan(String value) {
            addCriterion("referee_telephone >", value, "refereeTelephone");
            return (Criteria) this;
        }

        public Criteria andRefereeTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("referee_telephone >=", value, "refereeTelephone");
            return (Criteria) this;
        }

        public Criteria andRefereeTelephoneLessThan(String value) {
            addCriterion("referee_telephone <", value, "refereeTelephone");
            return (Criteria) this;
        }

        public Criteria andRefereeTelephoneLessThanOrEqualTo(String value) {
            addCriterion("referee_telephone <=", value, "refereeTelephone");
            return (Criteria) this;
        }

        public Criteria andRefereeTelephoneLike(String value) {
            addCriterion("referee_telephone like", value, "refereeTelephone");
            return (Criteria) this;
        }

        public Criteria andRefereeTelephoneNotLike(String value) {
            addCriterion("referee_telephone not like", value, "refereeTelephone");
            return (Criteria) this;
        }

        public Criteria andRefereeTelephoneIn(List<String> values) {
            addCriterion("referee_telephone in", values, "refereeTelephone");
            return (Criteria) this;
        }

        public Criteria andRefereeTelephoneNotIn(List<String> values) {
            addCriterion("referee_telephone not in", values, "refereeTelephone");
            return (Criteria) this;
        }

        public Criteria andRefereeTelephoneBetween(String value1, String value2) {
            addCriterion("referee_telephone between", value1, value2, "refereeTelephone");
            return (Criteria) this;
        }

        public Criteria andRefereeTelephoneNotBetween(String value1, String value2) {
            addCriterion("referee_telephone not between", value1, value2, "refereeTelephone");
            return (Criteria) this;
        }

        public Criteria andRefereeCompanyIsNull() {
            addCriterion("referee_company is null");
            return (Criteria) this;
        }

        public Criteria andRefereeCompanyIsNotNull() {
            addCriterion("referee_company is not null");
            return (Criteria) this;
        }

        public Criteria andRefereeCompanyEqualTo(String value) {
            addCriterion("referee_company =", value, "refereeCompany");
            return (Criteria) this;
        }

        public Criteria andRefereeCompanyNotEqualTo(String value) {
            addCriterion("referee_company <>", value, "refereeCompany");
            return (Criteria) this;
        }

        public Criteria andRefereeCompanyGreaterThan(String value) {
            addCriterion("referee_company >", value, "refereeCompany");
            return (Criteria) this;
        }

        public Criteria andRefereeCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("referee_company >=", value, "refereeCompany");
            return (Criteria) this;
        }

        public Criteria andRefereeCompanyLessThan(String value) {
            addCriterion("referee_company <", value, "refereeCompany");
            return (Criteria) this;
        }

        public Criteria andRefereeCompanyLessThanOrEqualTo(String value) {
            addCriterion("referee_company <=", value, "refereeCompany");
            return (Criteria) this;
        }

        public Criteria andRefereeCompanyLike(String value) {
            addCriterion("referee_company like", value, "refereeCompany");
            return (Criteria) this;
        }

        public Criteria andRefereeCompanyNotLike(String value) {
            addCriterion("referee_company not like", value, "refereeCompany");
            return (Criteria) this;
        }

        public Criteria andRefereeCompanyIn(List<String> values) {
            addCriterion("referee_company in", values, "refereeCompany");
            return (Criteria) this;
        }

        public Criteria andRefereeCompanyNotIn(List<String> values) {
            addCriterion("referee_company not in", values, "refereeCompany");
            return (Criteria) this;
        }

        public Criteria andRefereeCompanyBetween(String value1, String value2) {
            addCriterion("referee_company between", value1, value2, "refereeCompany");
            return (Criteria) this;
        }

        public Criteria andRefereeCompanyNotBetween(String value1, String value2) {
            addCriterion("referee_company not between", value1, value2, "refereeCompany");
            return (Criteria) this;
        }

        public Criteria andRefereeEmailIsNull() {
            addCriterion("referee_email is null");
            return (Criteria) this;
        }

        public Criteria andRefereeEmailIsNotNull() {
            addCriterion("referee_email is not null");
            return (Criteria) this;
        }

        public Criteria andRefereeEmailEqualTo(String value) {
            addCriterion("referee_email =", value, "refereeEmail");
            return (Criteria) this;
        }

        public Criteria andRefereeEmailNotEqualTo(String value) {
            addCriterion("referee_email <>", value, "refereeEmail");
            return (Criteria) this;
        }

        public Criteria andRefereeEmailGreaterThan(String value) {
            addCriterion("referee_email >", value, "refereeEmail");
            return (Criteria) this;
        }

        public Criteria andRefereeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("referee_email >=", value, "refereeEmail");
            return (Criteria) this;
        }

        public Criteria andRefereeEmailLessThan(String value) {
            addCriterion("referee_email <", value, "refereeEmail");
            return (Criteria) this;
        }

        public Criteria andRefereeEmailLessThanOrEqualTo(String value) {
            addCriterion("referee_email <=", value, "refereeEmail");
            return (Criteria) this;
        }

        public Criteria andRefereeEmailLike(String value) {
            addCriterion("referee_email like", value, "refereeEmail");
            return (Criteria) this;
        }

        public Criteria andRefereeEmailNotLike(String value) {
            addCriterion("referee_email not like", value, "refereeEmail");
            return (Criteria) this;
        }

        public Criteria andRefereeEmailIn(List<String> values) {
            addCriterion("referee_email in", values, "refereeEmail");
            return (Criteria) this;
        }

        public Criteria andRefereeEmailNotIn(List<String> values) {
            addCriterion("referee_email not in", values, "refereeEmail");
            return (Criteria) this;
        }

        public Criteria andRefereeEmailBetween(String value1, String value2) {
            addCriterion("referee_email between", value1, value2, "refereeEmail");
            return (Criteria) this;
        }

        public Criteria andRefereeEmailNotBetween(String value1, String value2) {
            addCriterion("referee_email not between", value1, value2, "refereeEmail");
            return (Criteria) this;
        }

        public Criteria andResumeFileIsNull() {
            addCriterion("resume_file is null");
            return (Criteria) this;
        }

        public Criteria andResumeFileIsNotNull() {
            addCriterion("resume_file is not null");
            return (Criteria) this;
        }

        public Criteria andResumeFileEqualTo(String value) {
            addCriterion("resume_file =", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileNotEqualTo(String value) {
            addCriterion("resume_file <>", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileGreaterThan(String value) {
            addCriterion("resume_file >", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileGreaterThanOrEqualTo(String value) {
            addCriterion("resume_file >=", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileLessThan(String value) {
            addCriterion("resume_file <", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileLessThanOrEqualTo(String value) {
            addCriterion("resume_file <=", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileLike(String value) {
            addCriterion("resume_file like", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileNotLike(String value) {
            addCriterion("resume_file not like", value, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileIn(List<String> values) {
            addCriterion("resume_file in", values, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileNotIn(List<String> values) {
            addCriterion("resume_file not in", values, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileBetween(String value1, String value2) {
            addCriterion("resume_file between", value1, value2, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andResumeFileNotBetween(String value1, String value2) {
            addCriterion("resume_file not between", value1, value2, "resumeFile");
            return (Criteria) this;
        }

        public Criteria andAcademicFileIsNull() {
            addCriterion("academic_file is null");
            return (Criteria) this;
        }

        public Criteria andAcademicFileIsNotNull() {
            addCriterion("academic_file is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicFileEqualTo(String value) {
            addCriterion("academic_file =", value, "academicFile");
            return (Criteria) this;
        }

        public Criteria andAcademicFileNotEqualTo(String value) {
            addCriterion("academic_file <>", value, "academicFile");
            return (Criteria) this;
        }

        public Criteria andAcademicFileGreaterThan(String value) {
            addCriterion("academic_file >", value, "academicFile");
            return (Criteria) this;
        }

        public Criteria andAcademicFileGreaterThanOrEqualTo(String value) {
            addCriterion("academic_file >=", value, "academicFile");
            return (Criteria) this;
        }

        public Criteria andAcademicFileLessThan(String value) {
            addCriterion("academic_file <", value, "academicFile");
            return (Criteria) this;
        }

        public Criteria andAcademicFileLessThanOrEqualTo(String value) {
            addCriterion("academic_file <=", value, "academicFile");
            return (Criteria) this;
        }

        public Criteria andAcademicFileLike(String value) {
            addCriterion("academic_file like", value, "academicFile");
            return (Criteria) this;
        }

        public Criteria andAcademicFileNotLike(String value) {
            addCriterion("academic_file not like", value, "academicFile");
            return (Criteria) this;
        }

        public Criteria andAcademicFileIn(List<String> values) {
            addCriterion("academic_file in", values, "academicFile");
            return (Criteria) this;
        }

        public Criteria andAcademicFileNotIn(List<String> values) {
            addCriterion("academic_file not in", values, "academicFile");
            return (Criteria) this;
        }

        public Criteria andAcademicFileBetween(String value1, String value2) {
            addCriterion("academic_file between", value1, value2, "academicFile");
            return (Criteria) this;
        }

        public Criteria andAcademicFileNotBetween(String value1, String value2) {
            addCriterion("academic_file not between", value1, value2, "academicFile");
            return (Criteria) this;
        }

        public Criteria andScoreFileIsNull() {
            addCriterion("score_file is null");
            return (Criteria) this;
        }

        public Criteria andScoreFileIsNotNull() {
            addCriterion("score_file is not null");
            return (Criteria) this;
        }

        public Criteria andScoreFileEqualTo(String value) {
            addCriterion("score_file =", value, "scoreFile");
            return (Criteria) this;
        }

        public Criteria andScoreFileNotEqualTo(String value) {
            addCriterion("score_file <>", value, "scoreFile");
            return (Criteria) this;
        }

        public Criteria andScoreFileGreaterThan(String value) {
            addCriterion("score_file >", value, "scoreFile");
            return (Criteria) this;
        }

        public Criteria andScoreFileGreaterThanOrEqualTo(String value) {
            addCriterion("score_file >=", value, "scoreFile");
            return (Criteria) this;
        }

        public Criteria andScoreFileLessThan(String value) {
            addCriterion("score_file <", value, "scoreFile");
            return (Criteria) this;
        }

        public Criteria andScoreFileLessThanOrEqualTo(String value) {
            addCriterion("score_file <=", value, "scoreFile");
            return (Criteria) this;
        }

        public Criteria andScoreFileLike(String value) {
            addCriterion("score_file like", value, "scoreFile");
            return (Criteria) this;
        }

        public Criteria andScoreFileNotLike(String value) {
            addCriterion("score_file not like", value, "scoreFile");
            return (Criteria) this;
        }

        public Criteria andScoreFileIn(List<String> values) {
            addCriterion("score_file in", values, "scoreFile");
            return (Criteria) this;
        }

        public Criteria andScoreFileNotIn(List<String> values) {
            addCriterion("score_file not in", values, "scoreFile");
            return (Criteria) this;
        }

        public Criteria andScoreFileBetween(String value1, String value2) {
            addCriterion("score_file between", value1, value2, "scoreFile");
            return (Criteria) this;
        }

        public Criteria andScoreFileNotBetween(String value1, String value2) {
            addCriterion("score_file not between", value1, value2, "scoreFile");
            return (Criteria) this;
        }

        public Criteria andLanguageFileIsNull() {
            addCriterion("language_file is null");
            return (Criteria) this;
        }

        public Criteria andLanguageFileIsNotNull() {
            addCriterion("language_file is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageFileEqualTo(String value) {
            addCriterion("language_file =", value, "languageFile");
            return (Criteria) this;
        }

        public Criteria andLanguageFileNotEqualTo(String value) {
            addCriterion("language_file <>", value, "languageFile");
            return (Criteria) this;
        }

        public Criteria andLanguageFileGreaterThan(String value) {
            addCriterion("language_file >", value, "languageFile");
            return (Criteria) this;
        }

        public Criteria andLanguageFileGreaterThanOrEqualTo(String value) {
            addCriterion("language_file >=", value, "languageFile");
            return (Criteria) this;
        }

        public Criteria andLanguageFileLessThan(String value) {
            addCriterion("language_file <", value, "languageFile");
            return (Criteria) this;
        }

        public Criteria andLanguageFileLessThanOrEqualTo(String value) {
            addCriterion("language_file <=", value, "languageFile");
            return (Criteria) this;
        }

        public Criteria andLanguageFileLike(String value) {
            addCriterion("language_file like", value, "languageFile");
            return (Criteria) this;
        }

        public Criteria andLanguageFileNotLike(String value) {
            addCriterion("language_file not like", value, "languageFile");
            return (Criteria) this;
        }

        public Criteria andLanguageFileIn(List<String> values) {
            addCriterion("language_file in", values, "languageFile");
            return (Criteria) this;
        }

        public Criteria andLanguageFileNotIn(List<String> values) {
            addCriterion("language_file not in", values, "languageFile");
            return (Criteria) this;
        }

        public Criteria andLanguageFileBetween(String value1, String value2) {
            addCriterion("language_file between", value1, value2, "languageFile");
            return (Criteria) this;
        }

        public Criteria andLanguageFileNotBetween(String value1, String value2) {
            addCriterion("language_file not between", value1, value2, "languageFile");
            return (Criteria) this;
        }

        public Criteria andDegreeFileIsNull() {
            addCriterion("degree_file is null");
            return (Criteria) this;
        }

        public Criteria andDegreeFileIsNotNull() {
            addCriterion("degree_file is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeFileEqualTo(String value) {
            addCriterion("degree_file =", value, "degreeFile");
            return (Criteria) this;
        }

        public Criteria andDegreeFileNotEqualTo(String value) {
            addCriterion("degree_file <>", value, "degreeFile");
            return (Criteria) this;
        }

        public Criteria andDegreeFileGreaterThan(String value) {
            addCriterion("degree_file >", value, "degreeFile");
            return (Criteria) this;
        }

        public Criteria andDegreeFileGreaterThanOrEqualTo(String value) {
            addCriterion("degree_file >=", value, "degreeFile");
            return (Criteria) this;
        }

        public Criteria andDegreeFileLessThan(String value) {
            addCriterion("degree_file <", value, "degreeFile");
            return (Criteria) this;
        }

        public Criteria andDegreeFileLessThanOrEqualTo(String value) {
            addCriterion("degree_file <=", value, "degreeFile");
            return (Criteria) this;
        }

        public Criteria andDegreeFileLike(String value) {
            addCriterion("degree_file like", value, "degreeFile");
            return (Criteria) this;
        }

        public Criteria andDegreeFileNotLike(String value) {
            addCriterion("degree_file not like", value, "degreeFile");
            return (Criteria) this;
        }

        public Criteria andDegreeFileIn(List<String> values) {
            addCriterion("degree_file in", values, "degreeFile");
            return (Criteria) this;
        }

        public Criteria andDegreeFileNotIn(List<String> values) {
            addCriterion("degree_file not in", values, "degreeFile");
            return (Criteria) this;
        }

        public Criteria andDegreeFileBetween(String value1, String value2) {
            addCriterion("degree_file between", value1, value2, "degreeFile");
            return (Criteria) this;
        }

        public Criteria andDegreeFileNotBetween(String value1, String value2) {
            addCriterion("degree_file not between", value1, value2, "degreeFile");
            return (Criteria) this;
        }

        public Criteria andAnnounceNameIsNull() {
            addCriterion("announce_name is null");
            return (Criteria) this;
        }

        public Criteria andAnnounceNameIsNotNull() {
            addCriterion("announce_name is not null");
            return (Criteria) this;
        }

        public Criteria andAnnounceNameEqualTo(String value) {
            addCriterion("announce_name =", value, "announceName");
            return (Criteria) this;
        }

        public Criteria andAnnounceNameNotEqualTo(String value) {
            addCriterion("announce_name <>", value, "announceName");
            return (Criteria) this;
        }

        public Criteria andAnnounceNameGreaterThan(String value) {
            addCriterion("announce_name >", value, "announceName");
            return (Criteria) this;
        }

        public Criteria andAnnounceNameGreaterThanOrEqualTo(String value) {
            addCriterion("announce_name >=", value, "announceName");
            return (Criteria) this;
        }

        public Criteria andAnnounceNameLessThan(String value) {
            addCriterion("announce_name <", value, "announceName");
            return (Criteria) this;
        }

        public Criteria andAnnounceNameLessThanOrEqualTo(String value) {
            addCriterion("announce_name <=", value, "announceName");
            return (Criteria) this;
        }

        public Criteria andAnnounceNameLike(String value) {
            addCriterion("announce_name like", value, "announceName");
            return (Criteria) this;
        }

        public Criteria andAnnounceNameNotLike(String value) {
            addCriterion("announce_name not like", value, "announceName");
            return (Criteria) this;
        }

        public Criteria andAnnounceNameIn(List<String> values) {
            addCriterion("announce_name in", values, "announceName");
            return (Criteria) this;
        }

        public Criteria andAnnounceNameNotIn(List<String> values) {
            addCriterion("announce_name not in", values, "announceName");
            return (Criteria) this;
        }

        public Criteria andAnnounceNameBetween(String value1, String value2) {
            addCriterion("announce_name between", value1, value2, "announceName");
            return (Criteria) this;
        }

        public Criteria andAnnounceNameNotBetween(String value1, String value2) {
            addCriterion("announce_name not between", value1, value2, "announceName");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeIsNull() {
            addCriterion("announce_time is null");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeIsNotNull() {
            addCriterion("announce_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeEqualTo(Date value) {
            addCriterionForJDBCDate("announce_time =", value, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("announce_time <>", value, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("announce_time >", value, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("announce_time >=", value, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeLessThan(Date value) {
            addCriterionForJDBCDate("announce_time <", value, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("announce_time <=", value, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeIn(List<Date> values) {
            addCriterionForJDBCDate("announce_time in", values, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("announce_time not in", values, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("announce_time between", value1, value2, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("announce_time not between", value1, value2, "announceTime");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIsNull() {
            addCriterion("application_status is null");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIsNotNull() {
            addCriterion("application_status is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusEqualTo(String value) {
            addCriterion("application_status =", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotEqualTo(String value) {
            addCriterion("application_status <>", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusGreaterThan(String value) {
            addCriterion("application_status >", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusGreaterThanOrEqualTo(String value) {
            addCriterion("application_status >=", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusLessThan(String value) {
            addCriterion("application_status <", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusLessThanOrEqualTo(String value) {
            addCriterion("application_status <=", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusLike(String value) {
            addCriterion("application_status like", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotLike(String value) {
            addCriterion("application_status not like", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIn(List<String> values) {
            addCriterion("application_status in", values, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotIn(List<String> values) {
            addCriterion("application_status not in", values, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusBetween(String value1, String value2) {
            addCriterion("application_status between", value1, value2, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotBetween(String value1, String value2) {
            addCriterion("application_status not between", value1, value2, "applicationStatus");
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