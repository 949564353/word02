package com.hongang.ppt.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppPlanExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPlanTypeIsNull() {
            addCriterion("plan_type is null");
            return (Criteria) this;
        }

        public Criteria andPlanTypeIsNotNull() {
            addCriterion("plan_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTypeEqualTo(String value) {
            addCriterion("plan_type =", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotEqualTo(String value) {
            addCriterion("plan_type <>", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeGreaterThan(String value) {
            addCriterion("plan_type >", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeGreaterThanOrEqualTo(String value) {
            addCriterion("plan_type >=", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeLessThan(String value) {
            addCriterion("plan_type <", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeLessThanOrEqualTo(String value) {
            addCriterion("plan_type <=", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeLike(String value) {
            addCriterion("plan_type like", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotLike(String value) {
            addCriterion("plan_type not like", value, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeIn(List<String> values) {
            addCriterion("plan_type in", values, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotIn(List<String> values) {
            addCriterion("plan_type not in", values, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeBetween(String value1, String value2) {
            addCriterion("plan_type between", value1, value2, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanTypeNotBetween(String value1, String value2) {
            addCriterion("plan_type not between", value1, value2, "planType");
            return (Criteria) this;
        }

        public Criteria andPlanDescIsNull() {
            addCriterion("plan_desc is null");
            return (Criteria) this;
        }

        public Criteria andPlanDescIsNotNull() {
            addCriterion("plan_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDescEqualTo(String value) {
            addCriterion("plan_desc =", value, "planDesc");
            return (Criteria) this;
        }

        public Criteria andPlanDescNotEqualTo(String value) {
            addCriterion("plan_desc <>", value, "planDesc");
            return (Criteria) this;
        }

        public Criteria andPlanDescGreaterThan(String value) {
            addCriterion("plan_desc >", value, "planDesc");
            return (Criteria) this;
        }

        public Criteria andPlanDescGreaterThanOrEqualTo(String value) {
            addCriterion("plan_desc >=", value, "planDesc");
            return (Criteria) this;
        }

        public Criteria andPlanDescLessThan(String value) {
            addCriterion("plan_desc <", value, "planDesc");
            return (Criteria) this;
        }

        public Criteria andPlanDescLessThanOrEqualTo(String value) {
            addCriterion("plan_desc <=", value, "planDesc");
            return (Criteria) this;
        }

        public Criteria andPlanDescLike(String value) {
            addCriterion("plan_desc like", value, "planDesc");
            return (Criteria) this;
        }

        public Criteria andPlanDescNotLike(String value) {
            addCriterion("plan_desc not like", value, "planDesc");
            return (Criteria) this;
        }

        public Criteria andPlanDescIn(List<String> values) {
            addCriterion("plan_desc in", values, "planDesc");
            return (Criteria) this;
        }

        public Criteria andPlanDescNotIn(List<String> values) {
            addCriterion("plan_desc not in", values, "planDesc");
            return (Criteria) this;
        }

        public Criteria andPlanDescBetween(String value1, String value2) {
            addCriterion("plan_desc between", value1, value2, "planDesc");
            return (Criteria) this;
        }

        public Criteria andPlanDescNotBetween(String value1, String value2) {
            addCriterion("plan_desc not between", value1, value2, "planDesc");
            return (Criteria) this;
        }

        public Criteria andPlanSortIsNull() {
            addCriterion("plan_sort is null");
            return (Criteria) this;
        }

        public Criteria andPlanSortIsNotNull() {
            addCriterion("plan_sort is not null");
            return (Criteria) this;
        }

        public Criteria andPlanSortEqualTo(Integer value) {
            addCriterion("plan_sort =", value, "planSort");
            return (Criteria) this;
        }

        public Criteria andPlanSortNotEqualTo(Integer value) {
            addCriterion("plan_sort <>", value, "planSort");
            return (Criteria) this;
        }

        public Criteria andPlanSortGreaterThan(Integer value) {
            addCriterion("plan_sort >", value, "planSort");
            return (Criteria) this;
        }

        public Criteria andPlanSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_sort >=", value, "planSort");
            return (Criteria) this;
        }

        public Criteria andPlanSortLessThan(Integer value) {
            addCriterion("plan_sort <", value, "planSort");
            return (Criteria) this;
        }

        public Criteria andPlanSortLessThanOrEqualTo(Integer value) {
            addCriterion("plan_sort <=", value, "planSort");
            return (Criteria) this;
        }

        public Criteria andPlanSortIn(List<Integer> values) {
            addCriterion("plan_sort in", values, "planSort");
            return (Criteria) this;
        }

        public Criteria andPlanSortNotIn(List<Integer> values) {
            addCriterion("plan_sort not in", values, "planSort");
            return (Criteria) this;
        }

        public Criteria andPlanSortBetween(Integer value1, Integer value2) {
            addCriterion("plan_sort between", value1, value2, "planSort");
            return (Criteria) this;
        }

        public Criteria andPlanSortNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_sort not between", value1, value2, "planSort");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Integer value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Integer value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Integer value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Integer value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Integer value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Integer> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Integer> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Integer value1, Integer value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Integer value1, Integer value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Long value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Long value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Long value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Long value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Long value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Long value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Long> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Long> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Long value1, Long value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Long value1, Long value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andPlanPriceIsNull() {
            addCriterion("plan_price is null");
            return (Criteria) this;
        }

        public Criteria andPlanPriceIsNotNull() {
            addCriterion("plan_price is not null");
            return (Criteria) this;
        }

        public Criteria andPlanPriceEqualTo(Long value) {
            addCriterion("plan_price =", value, "planPrice");
            return (Criteria) this;
        }

        public Criteria andPlanPriceNotEqualTo(Long value) {
            addCriterion("plan_price <>", value, "planPrice");
            return (Criteria) this;
        }

        public Criteria andPlanPriceGreaterThan(Long value) {
            addCriterion("plan_price >", value, "planPrice");
            return (Criteria) this;
        }

        public Criteria andPlanPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("plan_price >=", value, "planPrice");
            return (Criteria) this;
        }

        public Criteria andPlanPriceLessThan(Long value) {
            addCriterion("plan_price <", value, "planPrice");
            return (Criteria) this;
        }

        public Criteria andPlanPriceLessThanOrEqualTo(Long value) {
            addCriterion("plan_price <=", value, "planPrice");
            return (Criteria) this;
        }

        public Criteria andPlanPriceIn(List<Long> values) {
            addCriterion("plan_price in", values, "planPrice");
            return (Criteria) this;
        }

        public Criteria andPlanPriceNotIn(List<Long> values) {
            addCriterion("plan_price not in", values, "planPrice");
            return (Criteria) this;
        }

        public Criteria andPlanPriceBetween(Long value1, Long value2) {
            addCriterion("plan_price between", value1, value2, "planPrice");
            return (Criteria) this;
        }

        public Criteria andPlanPriceNotBetween(Long value1, Long value2) {
            addCriterion("plan_price not between", value1, value2, "planPrice");
            return (Criteria) this;
        }

        public Criteria andPlanDaysIsNull() {
            addCriterion("plan_days is null");
            return (Criteria) this;
        }

        public Criteria andPlanDaysIsNotNull() {
            addCriterion("plan_days is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDaysEqualTo(Integer value) {
            addCriterion("plan_days =", value, "planDays");
            return (Criteria) this;
        }

        public Criteria andPlanDaysNotEqualTo(Integer value) {
            addCriterion("plan_days <>", value, "planDays");
            return (Criteria) this;
        }

        public Criteria andPlanDaysGreaterThan(Integer value) {
            addCriterion("plan_days >", value, "planDays");
            return (Criteria) this;
        }

        public Criteria andPlanDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_days >=", value, "planDays");
            return (Criteria) this;
        }

        public Criteria andPlanDaysLessThan(Integer value) {
            addCriterion("plan_days <", value, "planDays");
            return (Criteria) this;
        }

        public Criteria andPlanDaysLessThanOrEqualTo(Integer value) {
            addCriterion("plan_days <=", value, "planDays");
            return (Criteria) this;
        }

        public Criteria andPlanDaysIn(List<Integer> values) {
            addCriterion("plan_days in", values, "planDays");
            return (Criteria) this;
        }

        public Criteria andPlanDaysNotIn(List<Integer> values) {
            addCriterion("plan_days not in", values, "planDays");
            return (Criteria) this;
        }

        public Criteria andPlanDaysBetween(Integer value1, Integer value2) {
            addCriterion("plan_days between", value1, value2, "planDays");
            return (Criteria) this;
        }

        public Criteria andPlanDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_days not between", value1, value2, "planDays");
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
