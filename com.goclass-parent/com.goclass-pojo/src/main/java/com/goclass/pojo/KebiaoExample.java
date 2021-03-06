package com.goclass.pojo;

import java.util.ArrayList;
import java.util.List;

public class KebiaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KebiaoExample() {
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

        public Criteria andSchedulIdIsNull() {
            addCriterion("schedul_id is null");
            return (Criteria) this;
        }

        public Criteria andSchedulIdIsNotNull() {
            addCriterion("schedul_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulIdEqualTo(Long value) {
            addCriterion("schedul_id =", value, "schedulId");
            return (Criteria) this;
        }

        public Criteria andSchedulIdNotEqualTo(Long value) {
            addCriterion("schedul_id <>", value, "schedulId");
            return (Criteria) this;
        }

        public Criteria andSchedulIdGreaterThan(Long value) {
            addCriterion("schedul_id >", value, "schedulId");
            return (Criteria) this;
        }

        public Criteria andSchedulIdGreaterThanOrEqualTo(Long value) {
            addCriterion("schedul_id >=", value, "schedulId");
            return (Criteria) this;
        }

        public Criteria andSchedulIdLessThan(Long value) {
            addCriterion("schedul_id <", value, "schedulId");
            return (Criteria) this;
        }

        public Criteria andSchedulIdLessThanOrEqualTo(Long value) {
            addCriterion("schedul_id <=", value, "schedulId");
            return (Criteria) this;
        }

        public Criteria andSchedulIdIn(List<Long> values) {
            addCriterion("schedul_id in", values, "schedulId");
            return (Criteria) this;
        }

        public Criteria andSchedulIdNotIn(List<Long> values) {
            addCriterion("schedul_id not in", values, "schedulId");
            return (Criteria) this;
        }

        public Criteria andSchedulIdBetween(Long value1, Long value2) {
            addCriterion("schedul_id between", value1, value2, "schedulId");
            return (Criteria) this;
        }

        public Criteria andSchedulIdNotBetween(Long value1, Long value2) {
            addCriterion("schedul_id not between", value1, value2, "schedulId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Long value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Long value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Long value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Long value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Long value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Long value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Long> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Long> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Long value1, Long value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Long value1, Long value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andSchedulIsNull() {
            addCriterion("schedul is null");
            return (Criteria) this;
        }

        public Criteria andSchedulIsNotNull() {
            addCriterion("schedul is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulEqualTo(String value) {
            addCriterion("schedul =", value, "schedul");
            return (Criteria) this;
        }

        public Criteria andSchedulNotEqualTo(String value) {
            addCriterion("schedul <>", value, "schedul");
            return (Criteria) this;
        }

        public Criteria andSchedulGreaterThan(String value) {
            addCriterion("schedul >", value, "schedul");
            return (Criteria) this;
        }

        public Criteria andSchedulGreaterThanOrEqualTo(String value) {
            addCriterion("schedul >=", value, "schedul");
            return (Criteria) this;
        }

        public Criteria andSchedulLessThan(String value) {
            addCriterion("schedul <", value, "schedul");
            return (Criteria) this;
        }

        public Criteria andSchedulLessThanOrEqualTo(String value) {
            addCriterion("schedul <=", value, "schedul");
            return (Criteria) this;
        }

        public Criteria andSchedulLike(String value) {
            addCriterion("schedul like", value, "schedul");
            return (Criteria) this;
        }

        public Criteria andSchedulNotLike(String value) {
            addCriterion("schedul not like", value, "schedul");
            return (Criteria) this;
        }

        public Criteria andSchedulIn(List<String> values) {
            addCriterion("schedul in", values, "schedul");
            return (Criteria) this;
        }

        public Criteria andSchedulNotIn(List<String> values) {
            addCriterion("schedul not in", values, "schedul");
            return (Criteria) this;
        }

        public Criteria andSchedulBetween(String value1, String value2) {
            addCriterion("schedul between", value1, value2, "schedul");
            return (Criteria) this;
        }

        public Criteria andSchedulNotBetween(String value1, String value2) {
            addCriterion("schedul not between", value1, value2, "schedul");
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