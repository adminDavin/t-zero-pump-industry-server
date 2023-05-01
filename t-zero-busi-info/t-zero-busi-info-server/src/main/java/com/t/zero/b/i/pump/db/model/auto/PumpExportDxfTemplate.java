package com.t.zero.b.i.pump.db.model.auto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PumpExportDxfTemplate implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_template.id
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_template.pv_code
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    private String pvCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_template.dxf_template_name
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    private String dxfTemplateName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_template.dxf_template_type
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    private String dxfTemplateType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_template.category
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_template.laguage
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    private String laguage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_template.pump_source
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    private String pumpSource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_template.created_user_id
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    private String createdUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_template.created_time
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    private LocalDateTime createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_template.updated_user_id
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    private String updatedUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_template.updated_time
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    private LocalDateTime updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_template.is_deleted
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    private String deletedFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_template.pv_desc
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    private String pvDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pump_export_dxf_template
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_template.id
     *
     * @return the value of pump_export_dxf_template.id
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_template.id
     *
     * @param id the value for pump_export_dxf_template.id
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_template.pv_code
     *
     * @return the value of pump_export_dxf_template.pv_code
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public String getPvCode() {
        return pvCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_template.pv_code
     *
     * @param pvCode the value for pump_export_dxf_template.pv_code
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public void setPvCode(String pvCode) {
        this.pvCode = pvCode == null ? null : pvCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_template.dxf_template_name
     *
     * @return the value of pump_export_dxf_template.dxf_template_name
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public String getDxfTemplateName() {
        return dxfTemplateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_template.dxf_template_name
     *
     * @param dxfTemplateName the value for pump_export_dxf_template.dxf_template_name
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public void setDxfTemplateName(String dxfTemplateName) {
        this.dxfTemplateName = dxfTemplateName == null ? null : dxfTemplateName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_template.dxf_template_type
     *
     * @return the value of pump_export_dxf_template.dxf_template_type
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public String getDxfTemplateType() {
        return dxfTemplateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_template.dxf_template_type
     *
     * @param dxfTemplateType the value for pump_export_dxf_template.dxf_template_type
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public void setDxfTemplateType(String dxfTemplateType) {
        this.dxfTemplateType = dxfTemplateType == null ? null : dxfTemplateType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_template.category
     *
     * @return the value of pump_export_dxf_template.category
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_template.category
     *
     * @param category the value for pump_export_dxf_template.category
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_template.laguage
     *
     * @return the value of pump_export_dxf_template.laguage
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public String getLaguage() {
        return laguage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_template.laguage
     *
     * @param laguage the value for pump_export_dxf_template.laguage
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public void setLaguage(String laguage) {
        this.laguage = laguage == null ? null : laguage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_template.pump_source
     *
     * @return the value of pump_export_dxf_template.pump_source
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public String getPumpSource() {
        return pumpSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_template.pump_source
     *
     * @param pumpSource the value for pump_export_dxf_template.pump_source
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public void setPumpSource(String pumpSource) {
        this.pumpSource = pumpSource == null ? null : pumpSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_template.created_user_id
     *
     * @return the value of pump_export_dxf_template.created_user_id
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_template.created_user_id
     *
     * @param createdUserId the value for pump_export_dxf_template.created_user_id
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId == null ? null : createdUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_template.created_time
     *
     * @return the value of pump_export_dxf_template.created_time
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_template.created_time
     *
     * @param createdTime the value for pump_export_dxf_template.created_time
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_template.updated_user_id
     *
     * @return the value of pump_export_dxf_template.updated_user_id
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public String getUpdatedUserId() {
        return updatedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_template.updated_user_id
     *
     * @param updatedUserId the value for pump_export_dxf_template.updated_user_id
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId == null ? null : updatedUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_template.updated_time
     *
     * @return the value of pump_export_dxf_template.updated_time
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_template.updated_time
     *
     * @param updatedTime the value for pump_export_dxf_template.updated_time
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_template.is_deleted
     *
     * @return the value of pump_export_dxf_template.is_deleted
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public String getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_template.is_deleted
     *
     * @param deletedFlag the value for pump_export_dxf_template.is_deleted
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag == null ? null : deletedFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_template.pv_desc
     *
     * @return the value of pump_export_dxf_template.pv_desc
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public String getPvDesc() {
        return pvDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_template.pv_desc
     *
     * @param pvDesc the value for pump_export_dxf_template.pv_desc
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    public void setPvDesc(String pvDesc) {
        this.pvDesc = pvDesc == null ? null : pvDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_template
     *
     * @mbg.generated Fri Apr 14 06:18:49 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pvCode=").append(pvCode);
        sb.append(", dxfTemplateName=").append(dxfTemplateName);
        sb.append(", dxfTemplateType=").append(dxfTemplateType);
        sb.append(", category=").append(category);
        sb.append(", laguage=").append(laguage);
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