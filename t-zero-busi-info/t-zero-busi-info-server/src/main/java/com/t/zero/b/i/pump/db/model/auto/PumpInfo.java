package com.t.zero.b.i.pump.db.model.auto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PumpInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.pv_code
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String pvCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.pump_name
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String pumpName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.pump_model
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String pumpModel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.dnd
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String dnd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.dns
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String dns;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.pump_category
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String pumpCategory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.x_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float xMax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.y_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float yMax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.x_b
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float xB;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.y_b
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float yB;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.stage_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float stageMax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.stage_min
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float stageMin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.qmin
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float qmin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.shut_down_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float shutDownMax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.q_max_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float qMaxMax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.shut_down_min
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float shutDownMin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.q_min_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float qMinMax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.rotation_ratio
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float rotationRatio;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.npshr
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float npshr;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.max_point
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float maxPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.sta_point
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float staPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.min_point
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float minPoint;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.phi
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float phi;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.phi_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float phiMax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.phi_min
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float phiMin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.y_start
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Float yStart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.pump_source
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String pumpSource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.created_user_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String createdUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.created_time
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private LocalDateTime createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.updated_user_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String updatedUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.updated_time
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private LocalDateTime updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.is_deleted
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String deletedFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_info.pv_desc
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String pvDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pump_info
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.id
     *
     * @return the value of pump_info.id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.id
     *
     * @param id the value for pump_info.id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.pv_code
     *
     * @return the value of pump_info.pv_code
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getPvCode() {
        return pvCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.pv_code
     *
     * @param pvCode the value for pump_info.pv_code
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setPvCode(String pvCode) {
        this.pvCode = pvCode == null ? null : pvCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.pump_name
     *
     * @return the value of pump_info.pump_name
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getPumpName() {
        return pumpName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.pump_name
     *
     * @param pumpName the value for pump_info.pump_name
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setPumpName(String pumpName) {
        this.pumpName = pumpName == null ? null : pumpName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.pump_model
     *
     * @return the value of pump_info.pump_model
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getPumpModel() {
        return pumpModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.pump_model
     *
     * @param pumpModel the value for pump_info.pump_model
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setPumpModel(String pumpModel) {
        this.pumpModel = pumpModel == null ? null : pumpModel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.dnd
     *
     * @return the value of pump_info.dnd
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getDnd() {
        return dnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.dnd
     *
     * @param dnd the value for pump_info.dnd
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setDnd(String dnd) {
        this.dnd = dnd == null ? null : dnd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.dns
     *
     * @return the value of pump_info.dns
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getDns() {
        return dns;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.dns
     *
     * @param dns the value for pump_info.dns
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setDns(String dns) {
        this.dns = dns == null ? null : dns.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.pump_category
     *
     * @return the value of pump_info.pump_category
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getPumpCategory() {
        return pumpCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.pump_category
     *
     * @param pumpCategory the value for pump_info.pump_category
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setPumpCategory(String pumpCategory) {
        this.pumpCategory = pumpCategory == null ? null : pumpCategory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.x_max
     *
     * @return the value of pump_info.x_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getxMax() {
        return xMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.x_max
     *
     * @param xMax the value for pump_info.x_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setxMax(Float xMax) {
        this.xMax = xMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.y_max
     *
     * @return the value of pump_info.y_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getyMax() {
        return yMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.y_max
     *
     * @param yMax the value for pump_info.y_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setyMax(Float yMax) {
        this.yMax = yMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.x_b
     *
     * @return the value of pump_info.x_b
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getxB() {
        return xB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.x_b
     *
     * @param xB the value for pump_info.x_b
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setxB(Float xB) {
        this.xB = xB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.y_b
     *
     * @return the value of pump_info.y_b
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getyB() {
        return yB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.y_b
     *
     * @param yB the value for pump_info.y_b
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setyB(Float yB) {
        this.yB = yB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.stage_max
     *
     * @return the value of pump_info.stage_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getStageMax() {
        return stageMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.stage_max
     *
     * @param stageMax the value for pump_info.stage_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setStageMax(Float stageMax) {
        this.stageMax = stageMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.stage_min
     *
     * @return the value of pump_info.stage_min
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getStageMin() {
        return stageMin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.stage_min
     *
     * @param stageMin the value for pump_info.stage_min
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setStageMin(Float stageMin) {
        this.stageMin = stageMin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.qmin
     *
     * @return the value of pump_info.qmin
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getQmin() {
        return qmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.qmin
     *
     * @param qmin the value for pump_info.qmin
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setQmin(Float qmin) {
        this.qmin = qmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.shut_down_max
     *
     * @return the value of pump_info.shut_down_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getShutDownMax() {
        return shutDownMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.shut_down_max
     *
     * @param shutDownMax the value for pump_info.shut_down_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setShutDownMax(Float shutDownMax) {
        this.shutDownMax = shutDownMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.q_max_max
     *
     * @return the value of pump_info.q_max_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getqMaxMax() {
        return qMaxMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.q_max_max
     *
     * @param qMaxMax the value for pump_info.q_max_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setqMaxMax(Float qMaxMax) {
        this.qMaxMax = qMaxMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.shut_down_min
     *
     * @return the value of pump_info.shut_down_min
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getShutDownMin() {
        return shutDownMin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.shut_down_min
     *
     * @param shutDownMin the value for pump_info.shut_down_min
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setShutDownMin(Float shutDownMin) {
        this.shutDownMin = shutDownMin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.q_min_max
     *
     * @return the value of pump_info.q_min_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getqMinMax() {
        return qMinMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.q_min_max
     *
     * @param qMinMax the value for pump_info.q_min_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setqMinMax(Float qMinMax) {
        this.qMinMax = qMinMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.rotation_ratio
     *
     * @return the value of pump_info.rotation_ratio
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getRotationRatio() {
        return rotationRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.rotation_ratio
     *
     * @param rotationRatio the value for pump_info.rotation_ratio
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setRotationRatio(Float rotationRatio) {
        this.rotationRatio = rotationRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.npshr
     *
     * @return the value of pump_info.npshr
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getNpshr() {
        return npshr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.npshr
     *
     * @param npshr the value for pump_info.npshr
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setNpshr(Float npshr) {
        this.npshr = npshr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.max_point
     *
     * @return the value of pump_info.max_point
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getMaxPoint() {
        return maxPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.max_point
     *
     * @param maxPoint the value for pump_info.max_point
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setMaxPoint(Float maxPoint) {
        this.maxPoint = maxPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.sta_point
     *
     * @return the value of pump_info.sta_point
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getStaPoint() {
        return staPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.sta_point
     *
     * @param staPoint the value for pump_info.sta_point
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setStaPoint(Float staPoint) {
        this.staPoint = staPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.min_point
     *
     * @return the value of pump_info.min_point
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getMinPoint() {
        return minPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.min_point
     *
     * @param minPoint the value for pump_info.min_point
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setMinPoint(Float minPoint) {
        this.minPoint = minPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.phi
     *
     * @return the value of pump_info.phi
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getPhi() {
        return phi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.phi
     *
     * @param phi the value for pump_info.phi
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setPhi(Float phi) {
        this.phi = phi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.phi_max
     *
     * @return the value of pump_info.phi_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getPhiMax() {
        return phiMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.phi_max
     *
     * @param phiMax the value for pump_info.phi_max
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setPhiMax(Float phiMax) {
        this.phiMax = phiMax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.phi_min
     *
     * @return the value of pump_info.phi_min
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getPhiMin() {
        return phiMin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.phi_min
     *
     * @param phiMin the value for pump_info.phi_min
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setPhiMin(Float phiMin) {
        this.phiMin = phiMin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.y_start
     *
     * @return the value of pump_info.y_start
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Float getyStart() {
        return yStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.y_start
     *
     * @param yStart the value for pump_info.y_start
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setyStart(Float yStart) {
        this.yStart = yStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.pump_source
     *
     * @return the value of pump_info.pump_source
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getPumpSource() {
        return pumpSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.pump_source
     *
     * @param pumpSource the value for pump_info.pump_source
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setPumpSource(String pumpSource) {
        this.pumpSource = pumpSource == null ? null : pumpSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.created_user_id
     *
     * @return the value of pump_info.created_user_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.created_user_id
     *
     * @param createdUserId the value for pump_info.created_user_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId == null ? null : createdUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.created_time
     *
     * @return the value of pump_info.created_time
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.created_time
     *
     * @param createdTime the value for pump_info.created_time
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.updated_user_id
     *
     * @return the value of pump_info.updated_user_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getUpdatedUserId() {
        return updatedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.updated_user_id
     *
     * @param updatedUserId the value for pump_info.updated_user_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId == null ? null : updatedUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.updated_time
     *
     * @return the value of pump_info.updated_time
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.updated_time
     *
     * @param updatedTime the value for pump_info.updated_time
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.is_deleted
     *
     * @return the value of pump_info.is_deleted
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.is_deleted
     *
     * @param deletedFlag the value for pump_info.is_deleted
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag == null ? null : deletedFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_info.pv_desc
     *
     * @return the value of pump_info.pv_desc
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getPvDesc() {
        return pvDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_info.pv_desc
     *
     * @param pvDesc the value for pump_info.pv_desc
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setPvDesc(String pvDesc) {
        this.pvDesc = pvDesc == null ? null : pvDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pvCode=").append(pvCode);
        sb.append(", pumpName=").append(pumpName);
        sb.append(", pumpModel=").append(pumpModel);
        sb.append(", dnd=").append(dnd);
        sb.append(", dns=").append(dns);
        sb.append(", pumpCategory=").append(pumpCategory);
        sb.append(", xMax=").append(xMax);
        sb.append(", yMax=").append(yMax);
        sb.append(", xB=").append(xB);
        sb.append(", yB=").append(yB);
        sb.append(", stageMax=").append(stageMax);
        sb.append(", stageMin=").append(stageMin);
        sb.append(", qmin=").append(qmin);
        sb.append(", shutDownMax=").append(shutDownMax);
        sb.append(", qMaxMax=").append(qMaxMax);
        sb.append(", shutDownMin=").append(shutDownMin);
        sb.append(", qMinMax=").append(qMinMax);
        sb.append(", rotationRatio=").append(rotationRatio);
        sb.append(", npshr=").append(npshr);
        sb.append(", maxPoint=").append(maxPoint);
        sb.append(", staPoint=").append(staPoint);
        sb.append(", minPoint=").append(minPoint);
        sb.append(", phi=").append(phi);
        sb.append(", phiMax=").append(phiMax);
        sb.append(", phiMin=").append(phiMin);
        sb.append(", yStart=").append(yStart);
        sb.append(", pumpSource=").append(pumpSource);
        sb.append(", createdUserId=").append(createdUserId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedUserId=").append(updatedUserId);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", deletedFlag=").append(deletedFlag);
        sb.append(", pvDesc=").append(pvDesc);
        sb.append("]");
        return sb.toString();
    }
}