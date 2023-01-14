package com.t.zero.b.i.pump.db.model.auto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PumpForcesAndMomentsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public PumpForcesAndMomentsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
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

        public Criteria andPvCodeIsNull() {
            addCriterion("pv_code is null");
            return (Criteria) this;
        }

        public Criteria andPvCodeIsNotNull() {
            addCriterion("pv_code is not null");
            return (Criteria) this;
        }

        public Criteria andPvCodeEqualTo(String value) {
            addCriterion("pv_code =", value, "pvCode");
            return (Criteria) this;
        }

        public Criteria andPvCodeNotEqualTo(String value) {
            addCriterion("pv_code <>", value, "pvCode");
            return (Criteria) this;
        }

        public Criteria andPvCodeGreaterThan(String value) {
            addCriterion("pv_code >", value, "pvCode");
            return (Criteria) this;
        }

        public Criteria andPvCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pv_code >=", value, "pvCode");
            return (Criteria) this;
        }

        public Criteria andPvCodeLessThan(String value) {
            addCriterion("pv_code <", value, "pvCode");
            return (Criteria) this;
        }

        public Criteria andPvCodeLessThanOrEqualTo(String value) {
            addCriterion("pv_code <=", value, "pvCode");
            return (Criteria) this;
        }

        public Criteria andPvCodeLike(String value) {
            addCriterion("pv_code like", value, "pvCode");
            return (Criteria) this;
        }

        public Criteria andPvCodeNotLike(String value) {
            addCriterion("pv_code not like", value, "pvCode");
            return (Criteria) this;
        }

        public Criteria andPvCodeIn(List<String> values) {
            addCriterion("pv_code in", values, "pvCode");
            return (Criteria) this;
        }

        public Criteria andPvCodeNotIn(List<String> values) {
            addCriterion("pv_code not in", values, "pvCode");
            return (Criteria) this;
        }

        public Criteria andPvCodeBetween(String value1, String value2) {
            addCriterion("pv_code between", value1, value2, "pvCode");
            return (Criteria) this;
        }

        public Criteria andPvCodeNotBetween(String value1, String value2) {
            addCriterion("pv_code not between", value1, value2, "pvCode");
            return (Criteria) this;
        }

        public Criteria andDnIsNull() {
            addCriterion("dn is null");
            return (Criteria) this;
        }

        public Criteria andDnIsNotNull() {
            addCriterion("dn is not null");
            return (Criteria) this;
        }

        public Criteria andDnEqualTo(String value) {
            addCriterion("dn =", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotEqualTo(String value) {
            addCriterion("dn <>", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnGreaterThan(String value) {
            addCriterion("dn >", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnGreaterThanOrEqualTo(String value) {
            addCriterion("dn >=", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnLessThan(String value) {
            addCriterion("dn <", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnLessThanOrEqualTo(String value) {
            addCriterion("dn <=", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnLike(String value) {
            addCriterion("dn like", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotLike(String value) {
            addCriterion("dn not like", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnIn(List<String> values) {
            addCriterion("dn in", values, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotIn(List<String> values) {
            addCriterion("dn not in", values, "dn");
            return (Criteria) this;
        }

        public Criteria andDnBetween(String value1, String value2) {
            addCriterion("dn between", value1, value2, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotBetween(String value1, String value2) {
            addCriterion("dn not between", value1, value2, "dn");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andPumpSourceIsNull() {
            addCriterion("pump_source is null");
            return (Criteria) this;
        }

        public Criteria andPumpSourceIsNotNull() {
            addCriterion("pump_source is not null");
            return (Criteria) this;
        }

        public Criteria andPumpSourceEqualTo(String value) {
            addCriterion("pump_source =", value, "pumpSource");
            return (Criteria) this;
        }

        public Criteria andPumpSourceNotEqualTo(String value) {
            addCriterion("pump_source <>", value, "pumpSource");
            return (Criteria) this;
        }

        public Criteria andPumpSourceGreaterThan(String value) {
            addCriterion("pump_source >", value, "pumpSource");
            return (Criteria) this;
        }

        public Criteria andPumpSourceGreaterThanOrEqualTo(String value) {
            addCriterion("pump_source >=", value, "pumpSource");
            return (Criteria) this;
        }

        public Criteria andPumpSourceLessThan(String value) {
            addCriterion("pump_source <", value, "pumpSource");
            return (Criteria) this;
        }

        public Criteria andPumpSourceLessThanOrEqualTo(String value) {
            addCriterion("pump_source <=", value, "pumpSource");
            return (Criteria) this;
        }

        public Criteria andPumpSourceLike(String value) {
            addCriterion("pump_source like", value, "pumpSource");
            return (Criteria) this;
        }

        public Criteria andPumpSourceNotLike(String value) {
            addCriterion("pump_source not like", value, "pumpSource");
            return (Criteria) this;
        }

        public Criteria andPumpSourceIn(List<String> values) {
            addCriterion("pump_source in", values, "pumpSource");
            return (Criteria) this;
        }

        public Criteria andPumpSourceNotIn(List<String> values) {
            addCriterion("pump_source not in", values, "pumpSource");
            return (Criteria) this;
        }

        public Criteria andPumpSourceBetween(String value1, String value2) {
            addCriterion("pump_source between", value1, value2, "pumpSource");
            return (Criteria) this;
        }

        public Criteria andPumpSourceNotBetween(String value1, String value2) {
            addCriterion("pump_source not between", value1, value2, "pumpSource");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIsNull() {
            addCriterion("created_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIsNotNull() {
            addCriterion("created_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdEqualTo(String value) {
            addCriterion("created_user_id =", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotEqualTo(String value) {
            addCriterion("created_user_id <>", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdGreaterThan(String value) {
            addCriterion("created_user_id >", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("created_user_id >=", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLessThan(String value) {
            addCriterion("created_user_id <", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLessThanOrEqualTo(String value) {
            addCriterion("created_user_id <=", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdLike(String value) {
            addCriterion("created_user_id like", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotLike(String value) {
            addCriterion("created_user_id not like", value, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdIn(List<String> values) {
            addCriterion("created_user_id in", values, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotIn(List<String> values) {
            addCriterion("created_user_id not in", values, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdBetween(String value1, String value2) {
            addCriterion("created_user_id between", value1, value2, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIdNotBetween(String value1, String value2) {
            addCriterion("created_user_id not between", value1, value2, "createdUserId");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(LocalDateTime value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(LocalDateTime value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(LocalDateTime value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(LocalDateTime value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<LocalDateTime> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<LocalDateTime> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdIsNull() {
            addCriterion("updated_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdIsNotNull() {
            addCriterion("updated_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdEqualTo(String value) {
            addCriterion("updated_user_id =", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdNotEqualTo(String value) {
            addCriterion("updated_user_id <>", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdGreaterThan(String value) {
            addCriterion("updated_user_id >", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("updated_user_id >=", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdLessThan(String value) {
            addCriterion("updated_user_id <", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdLessThanOrEqualTo(String value) {
            addCriterion("updated_user_id <=", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdLike(String value) {
            addCriterion("updated_user_id like", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdNotLike(String value) {
            addCriterion("updated_user_id not like", value, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdIn(List<String> values) {
            addCriterion("updated_user_id in", values, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdNotIn(List<String> values) {
            addCriterion("updated_user_id not in", values, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdBetween(String value1, String value2) {
            addCriterion("updated_user_id between", value1, value2, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedUserIdNotBetween(String value1, String value2) {
            addCriterion("updated_user_id not between", value1, value2, "updatedUserId");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(LocalDateTime value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(LocalDateTime value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(LocalDateTime value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(LocalDateTime value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<LocalDateTime> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<LocalDateTime> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagEqualTo(String value) {
            addCriterion("is_deleted =", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagGreaterThan(String value) {
            addCriterion("is_deleted >", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagLessThan(String value) {
            addCriterion("is_deleted <", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagLike(String value) {
            addCriterion("is_deleted like", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagNotLike(String value) {
            addCriterion("is_deleted not like", value, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagIn(List<String> values) {
            addCriterion("is_deleted in", values, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "deletedFlag");
            return (Criteria) this;
        }

        public Criteria andDeletedFlagNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "deletedFlag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated do_not_delete_during_merge Sat Jan 14 17:17:13 CST 2023
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
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