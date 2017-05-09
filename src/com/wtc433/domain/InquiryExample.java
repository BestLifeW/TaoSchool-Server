package com.wtc433.domain;

import java.util.ArrayList;
import java.util.List;

public class InquiryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InquiryExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIshopnameIsNull() {
            addCriterion("ishopname is null");
            return (Criteria) this;
        }

        public Criteria andIshopnameIsNotNull() {
            addCriterion("ishopname is not null");
            return (Criteria) this;
        }

        public Criteria andIshopnameEqualTo(String value) {
            addCriterion("ishopname =", value, "ishopname");
            return (Criteria) this;
        }

        public Criteria andIshopnameNotEqualTo(String value) {
            addCriterion("ishopname <>", value, "ishopname");
            return (Criteria) this;
        }

        public Criteria andIshopnameGreaterThan(String value) {
            addCriterion("ishopname >", value, "ishopname");
            return (Criteria) this;
        }

        public Criteria andIshopnameGreaterThanOrEqualTo(String value) {
            addCriterion("ishopname >=", value, "ishopname");
            return (Criteria) this;
        }

        public Criteria andIshopnameLessThan(String value) {
            addCriterion("ishopname <", value, "ishopname");
            return (Criteria) this;
        }

        public Criteria andIshopnameLessThanOrEqualTo(String value) {
            addCriterion("ishopname <=", value, "ishopname");
            return (Criteria) this;
        }

        public Criteria andIshopnameLike(String value) {
            addCriterion("ishopname like", value, "ishopname");
            return (Criteria) this;
        }

        public Criteria andIshopnameNotLike(String value) {
            addCriterion("ishopname not like", value, "ishopname");
            return (Criteria) this;
        }

        public Criteria andIshopnameIn(List<String> values) {
            addCriterion("ishopname in", values, "ishopname");
            return (Criteria) this;
        }

        public Criteria andIshopnameNotIn(List<String> values) {
            addCriterion("ishopname not in", values, "ishopname");
            return (Criteria) this;
        }

        public Criteria andIshopnameBetween(String value1, String value2) {
            addCriterion("ishopname between", value1, value2, "ishopname");
            return (Criteria) this;
        }

        public Criteria andIshopnameNotBetween(String value1, String value2) {
            addCriterion("ishopname not between", value1, value2, "ishopname");
            return (Criteria) this;
        }

        public Criteria andIdescriptionIsNull() {
            addCriterion("idescription is null");
            return (Criteria) this;
        }

        public Criteria andIdescriptionIsNotNull() {
            addCriterion("idescription is not null");
            return (Criteria) this;
        }

        public Criteria andIdescriptionEqualTo(String value) {
            addCriterion("idescription =", value, "idescription");
            return (Criteria) this;
        }

        public Criteria andIdescriptionNotEqualTo(String value) {
            addCriterion("idescription <>", value, "idescription");
            return (Criteria) this;
        }

        public Criteria andIdescriptionGreaterThan(String value) {
            addCriterion("idescription >", value, "idescription");
            return (Criteria) this;
        }

        public Criteria andIdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("idescription >=", value, "idescription");
            return (Criteria) this;
        }

        public Criteria andIdescriptionLessThan(String value) {
            addCriterion("idescription <", value, "idescription");
            return (Criteria) this;
        }

        public Criteria andIdescriptionLessThanOrEqualTo(String value) {
            addCriterion("idescription <=", value, "idescription");
            return (Criteria) this;
        }

        public Criteria andIdescriptionLike(String value) {
            addCriterion("idescription like", value, "idescription");
            return (Criteria) this;
        }

        public Criteria andIdescriptionNotLike(String value) {
            addCriterion("idescription not like", value, "idescription");
            return (Criteria) this;
        }

        public Criteria andIdescriptionIn(List<String> values) {
            addCriterion("idescription in", values, "idescription");
            return (Criteria) this;
        }

        public Criteria andIdescriptionNotIn(List<String> values) {
            addCriterion("idescription not in", values, "idescription");
            return (Criteria) this;
        }

        public Criteria andIdescriptionBetween(String value1, String value2) {
            addCriterion("idescription between", value1, value2, "idescription");
            return (Criteria) this;
        }

        public Criteria andIdescriptionNotBetween(String value1, String value2) {
            addCriterion("idescription not between", value1, value2, "idescription");
            return (Criteria) this;
        }

        public Criteria andItimeIsNull() {
            addCriterion("itime is null");
            return (Criteria) this;
        }

        public Criteria andItimeIsNotNull() {
            addCriterion("itime is not null");
            return (Criteria) this;
        }

        public Criteria andItimeEqualTo(String value) {
            addCriterion("itime =", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeNotEqualTo(String value) {
            addCriterion("itime <>", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeGreaterThan(String value) {
            addCriterion("itime >", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeGreaterThanOrEqualTo(String value) {
            addCriterion("itime >=", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeLessThan(String value) {
            addCriterion("itime <", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeLessThanOrEqualTo(String value) {
            addCriterion("itime <=", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeLike(String value) {
            addCriterion("itime like", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeNotLike(String value) {
            addCriterion("itime not like", value, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeIn(List<String> values) {
            addCriterion("itime in", values, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeNotIn(List<String> values) {
            addCriterion("itime not in", values, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeBetween(String value1, String value2) {
            addCriterion("itime between", value1, value2, "itime");
            return (Criteria) this;
        }

        public Criteria andItimeNotBetween(String value1, String value2) {
            addCriterion("itime not between", value1, value2, "itime");
            return (Criteria) this;
        }

        public Criteria andIusernameIsNull() {
            addCriterion("iusername is null");
            return (Criteria) this;
        }

        public Criteria andIusernameIsNotNull() {
            addCriterion("iusername is not null");
            return (Criteria) this;
        }

        public Criteria andIusernameEqualTo(String value) {
            addCriterion("iusername =", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameNotEqualTo(String value) {
            addCriterion("iusername <>", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameGreaterThan(String value) {
            addCriterion("iusername >", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameGreaterThanOrEqualTo(String value) {
            addCriterion("iusername >=", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameLessThan(String value) {
            addCriterion("iusername <", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameLessThanOrEqualTo(String value) {
            addCriterion("iusername <=", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameLike(String value) {
            addCriterion("iusername like", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameNotLike(String value) {
            addCriterion("iusername not like", value, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameIn(List<String> values) {
            addCriterion("iusername in", values, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameNotIn(List<String> values) {
            addCriterion("iusername not in", values, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameBetween(String value1, String value2) {
            addCriterion("iusername between", value1, value2, "iusername");
            return (Criteria) this;
        }

        public Criteria andIusernameNotBetween(String value1, String value2) {
            addCriterion("iusername not between", value1, value2, "iusername");
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