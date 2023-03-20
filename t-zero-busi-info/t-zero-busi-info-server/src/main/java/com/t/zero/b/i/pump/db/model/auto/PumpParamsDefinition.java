package com.t.zero.b.i.pump.db.model.auto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PumpParamsDefinition implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_params_definition.id
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_params_definition.pv_code
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    private String pvCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_params_definition.pv_language
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    private String pvLanguage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_params_definition.pv_key
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    private String pvKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_params_definition.pv_label
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    private String pvLabel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_params_definition.pv_order
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    private Integer pvOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_params_definition.pump_source
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    private String pumpSource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_params_definition.created_user_id
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    private String createdUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_params_definition.created_time
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    private LocalDateTime createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_params_definition.updated_user_id
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    private String updatedUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_params_definition.updated_time
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    private LocalDateTime updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_params_definition.is_deleted
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    private String deletedFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_params_definition.pv_desc
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    private String pvDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pump_params_definition
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_params_definition.id
     *
     * @return the value of pump_params_definition.id
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_params_definition.id
     *
     * @param id the value for pump_params_definition.id
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_params_definition.pv_code
     *
     * @return the value of pump_params_definition.pv_code
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public String getPvCode() {
        return pvCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_params_definition.pv_code
     *
     * @param pvCode the value for pump_params_definition.pv_code
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public void setPvCode(String pvCode) {
        this.pvCode = pvCode == null ? null : pvCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_params_definition.pv_language
     *
     * @return the value of pump_params_definition.pv_language
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public String getPvLanguage() {
        return pvLanguage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_params_definition.pv_language
     *
     * @param pvLanguage the value for pump_params_definition.pv_language
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public void setPvLanguage(String pvLanguage) {
        this.pvLanguage = pvLanguage == null ? null : pvLanguage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_params_definition.pv_key
     *
     * @return the value of pump_params_definition.pv_key
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public String getPvKey() {
        return pvKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_params_definition.pv_key
     *
     * @param pvKey the value for pump_params_definition.pv_key
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public void setPvKey(String pvKey) {
        this.pvKey = pvKey == null ? null : pvKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_params_definition.pv_label
     *
     * @return the value of pump_params_definition.pv_label
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public String getPvLabel() {
        return pvLabel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_params_definition.pv_label
     *
     * @param pvLabel the value for pump_params_definition.pv_label
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public void setPvLabel(String pvLabel) {
        this.pvLabel = pvLabel == null ? null : pvLabel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_params_definition.pv_order
     *
     * @return the value of pump_params_definition.pv_order
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public Integer getPvOrder() {
        return pvOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_params_definition.pv_order
     *
     * @param pvOrder the value for pump_params_definition.pv_order
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public void setPvOrder(Integer pvOrder) {
        this.pvOrder = pvOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_params_definition.pump_source
     *
     * @return the value of pump_params_definition.pump_source
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public String getPumpSource() {
        return pumpSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_params_definition.pump_source
     *
     * @param pumpSource the value for pump_params_definition.pump_source
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public void setPumpSource(String pumpSource) {
        this.pumpSource = pumpSource == null ? null : pumpSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_params_definition.created_user_id
     *
     * @return the value of pump_params_definition.created_user_id
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_params_definition.created_user_id
     *
     * @param createdUserId the value for pump_params_definition.created_user_id
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId == null ? null : createdUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_params_definition.created_time
     *
     * @return the value of pump_params_definition.created_time
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_params_definition.created_time
     *
     * @param createdTime the value for pump_params_definition.created_time
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_params_definition.updated_user_id
     *
     * @return the value of pump_params_definition.updated_user_id
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public String getUpdatedUserId() {
        return updatedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_params_definition.updated_user_id
     *
     * @param updatedUserId the value for pump_params_definition.updated_user_id
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId == null ? null : updatedUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_params_definition.updated_time
     *
     * @return the value of pump_params_definition.updated_time
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_params_definition.updated_time
     *
     * @param updatedTime the value for pump_params_definition.updated_time
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_params_definition.is_deleted
     *
     * @return the value of pump_params_definition.is_deleted
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public String getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_params_definition.is_deleted
     *
     * @param deletedFlag the value for pump_params_definition.is_deleted
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag == null ? null : deletedFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_params_definition.pv_desc
     *
     * @return the value of pump_params_definition.pv_desc
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public String getPvDesc() {
        return pvDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_params_definition.pv_desc
     *
     * @param pvDesc the value for pump_params_definition.pv_desc
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    public void setPvDesc(String pvDesc) {
        this.pvDesc = pvDesc == null ? null : pvDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Tue Mar 21 03:49:02 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pvCode=").append(pvCode);
        sb.append(", pvLanguage=").append(pvLanguage);
        sb.append(", pvKey=").append(pvKey);
        sb.append(", pvLabel=").append(pvLabel);
        sb.append(", pvOrder=").append(pvOrder);
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