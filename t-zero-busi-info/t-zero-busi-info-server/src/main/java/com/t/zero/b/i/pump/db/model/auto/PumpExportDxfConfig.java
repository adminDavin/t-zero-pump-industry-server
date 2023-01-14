package com.t.zero.b.i.pump.db.model.auto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PumpExportDxfConfig implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.id
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.pv_code
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String pvCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.pump_name
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String pumpName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.pump_model
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String pumpModel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.dxf_template_name
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String dxfTemplateName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.dxf_layer
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String dxfLayer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.dxf_text
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String dxfText;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.sys_entity
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String sysEntity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.entity_member
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String entityMember;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.default_value
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String defaultValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.calculate_type
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String calculateType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.pump_source
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String pumpSource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.created_user_id
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String createdUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.created_time
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private LocalDateTime createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.updated_user_id
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String updatedUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.updated_time
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private LocalDateTime updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.is_deleted
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String deletedFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_export_dxf_config.pv_desc
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private String pvDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.id
     *
     * @return the value of pump_export_dxf_config.id
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.id
     *
     * @param id the value for pump_export_dxf_config.id
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.pv_code
     *
     * @return the value of pump_export_dxf_config.pv_code
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getPvCode() {
        return pvCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.pv_code
     *
     * @param pvCode the value for pump_export_dxf_config.pv_code
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setPvCode(String pvCode) {
        this.pvCode = pvCode == null ? null : pvCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.pump_name
     *
     * @return the value of pump_export_dxf_config.pump_name
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getPumpName() {
        return pumpName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.pump_name
     *
     * @param pumpName the value for pump_export_dxf_config.pump_name
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setPumpName(String pumpName) {
        this.pumpName = pumpName == null ? null : pumpName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.pump_model
     *
     * @return the value of pump_export_dxf_config.pump_model
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getPumpModel() {
        return pumpModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.pump_model
     *
     * @param pumpModel the value for pump_export_dxf_config.pump_model
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setPumpModel(String pumpModel) {
        this.pumpModel = pumpModel == null ? null : pumpModel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.dxf_template_name
     *
     * @return the value of pump_export_dxf_config.dxf_template_name
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getDxfTemplateName() {
        return dxfTemplateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.dxf_template_name
     *
     * @param dxfTemplateName the value for pump_export_dxf_config.dxf_template_name
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setDxfTemplateName(String dxfTemplateName) {
        this.dxfTemplateName = dxfTemplateName == null ? null : dxfTemplateName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.dxf_layer
     *
     * @return the value of pump_export_dxf_config.dxf_layer
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getDxfLayer() {
        return dxfLayer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.dxf_layer
     *
     * @param dxfLayer the value for pump_export_dxf_config.dxf_layer
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setDxfLayer(String dxfLayer) {
        this.dxfLayer = dxfLayer == null ? null : dxfLayer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.dxf_text
     *
     * @return the value of pump_export_dxf_config.dxf_text
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getDxfText() {
        return dxfText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.dxf_text
     *
     * @param dxfText the value for pump_export_dxf_config.dxf_text
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setDxfText(String dxfText) {
        this.dxfText = dxfText == null ? null : dxfText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.sys_entity
     *
     * @return the value of pump_export_dxf_config.sys_entity
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getSysEntity() {
        return sysEntity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.sys_entity
     *
     * @param sysEntity the value for pump_export_dxf_config.sys_entity
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setSysEntity(String sysEntity) {
        this.sysEntity = sysEntity == null ? null : sysEntity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.entity_member
     *
     * @return the value of pump_export_dxf_config.entity_member
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getEntityMember() {
        return entityMember;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.entity_member
     *
     * @param entityMember the value for pump_export_dxf_config.entity_member
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setEntityMember(String entityMember) {
        this.entityMember = entityMember == null ? null : entityMember.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.default_value
     *
     * @return the value of pump_export_dxf_config.default_value
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.default_value
     *
     * @param defaultValue the value for pump_export_dxf_config.default_value
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue == null ? null : defaultValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.calculate_type
     *
     * @return the value of pump_export_dxf_config.calculate_type
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getCalculateType() {
        return calculateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.calculate_type
     *
     * @param calculateType the value for pump_export_dxf_config.calculate_type
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setCalculateType(String calculateType) {
        this.calculateType = calculateType == null ? null : calculateType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.pump_source
     *
     * @return the value of pump_export_dxf_config.pump_source
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getPumpSource() {
        return pumpSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.pump_source
     *
     * @param pumpSource the value for pump_export_dxf_config.pump_source
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setPumpSource(String pumpSource) {
        this.pumpSource = pumpSource == null ? null : pumpSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.created_user_id
     *
     * @return the value of pump_export_dxf_config.created_user_id
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.created_user_id
     *
     * @param createdUserId the value for pump_export_dxf_config.created_user_id
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId == null ? null : createdUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.created_time
     *
     * @return the value of pump_export_dxf_config.created_time
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.created_time
     *
     * @param createdTime the value for pump_export_dxf_config.created_time
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.updated_user_id
     *
     * @return the value of pump_export_dxf_config.updated_user_id
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getUpdatedUserId() {
        return updatedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.updated_user_id
     *
     * @param updatedUserId the value for pump_export_dxf_config.updated_user_id
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId == null ? null : updatedUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.updated_time
     *
     * @return the value of pump_export_dxf_config.updated_time
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.updated_time
     *
     * @param updatedTime the value for pump_export_dxf_config.updated_time
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.is_deleted
     *
     * @return the value of pump_export_dxf_config.is_deleted
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.is_deleted
     *
     * @param deletedFlag the value for pump_export_dxf_config.is_deleted
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag == null ? null : deletedFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_export_dxf_config.pv_desc
     *
     * @return the value of pump_export_dxf_config.pv_desc
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public String getPvDesc() {
        return pvDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_export_dxf_config.pv_desc
     *
     * @param pvDesc the value for pump_export_dxf_config.pv_desc
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    public void setPvDesc(String pvDesc) {
        this.pvDesc = pvDesc == null ? null : pvDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
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
        sb.append(", dxfTemplateName=").append(dxfTemplateName);
        sb.append(", dxfLayer=").append(dxfLayer);
        sb.append(", dxfText=").append(dxfText);
        sb.append(", sysEntity=").append(sysEntity);
        sb.append(", entityMember=").append(entityMember);
        sb.append(", defaultValue=").append(defaultValue);
        sb.append(", calculateType=").append(calculateType);
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