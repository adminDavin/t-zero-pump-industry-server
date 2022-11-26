package com.t.zero.message.platform.model.auto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MessageTemplate implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_template.id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_template.tenant_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private Integer tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_template.channel_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private Integer channelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_template.template_code
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String templateCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_template.template_type
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String templateType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_template.template_name
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String templateName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_template.template_status
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private Byte templateStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_template.created_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String createdUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_template.created_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private LocalDateTime createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_template.updated_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String updatedUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_template.updated_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private LocalDateTime updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_template.is_deleted
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String deletedFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_template.template_desc
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String templateDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_zero_message_template
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_template.id
     *
     * @return the value of t_zero_message_template.id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_template.id
     *
     * @param id the value for t_zero_message_template.id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_template.tenant_id
     *
     * @return the value of t_zero_message_template.tenant_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_template.tenant_id
     *
     * @param tenantId the value for t_zero_message_template.tenant_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_template.channel_id
     *
     * @return the value of t_zero_message_template.channel_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_template.channel_id
     *
     * @param channelId the value for t_zero_message_template.channel_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_template.template_code
     *
     * @return the value of t_zero_message_template.template_code
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getTemplateCode() {
        return templateCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_template.template_code
     *
     * @param templateCode the value for t_zero_message_template.template_code
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode == null ? null : templateCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_template.template_type
     *
     * @return the value of t_zero_message_template.template_type
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_template.template_type
     *
     * @param templateType the value for t_zero_message_template.template_type
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType == null ? null : templateType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_template.template_name
     *
     * @return the value of t_zero_message_template.template_name
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_template.template_name
     *
     * @param templateName the value for t_zero_message_template.template_name
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_template.template_status
     *
     * @return the value of t_zero_message_template.template_status
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public Byte getTemplateStatus() {
        return templateStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_template.template_status
     *
     * @param templateStatus the value for t_zero_message_template.template_status
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setTemplateStatus(Byte templateStatus) {
        this.templateStatus = templateStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_template.created_user_id
     *
     * @return the value of t_zero_message_template.created_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_template.created_user_id
     *
     * @param createdUserId the value for t_zero_message_template.created_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId == null ? null : createdUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_template.created_time
     *
     * @return the value of t_zero_message_template.created_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_template.created_time
     *
     * @param createdTime the value for t_zero_message_template.created_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_template.updated_user_id
     *
     * @return the value of t_zero_message_template.updated_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getUpdatedUserId() {
        return updatedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_template.updated_user_id
     *
     * @param updatedUserId the value for t_zero_message_template.updated_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId == null ? null : updatedUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_template.updated_time
     *
     * @return the value of t_zero_message_template.updated_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_template.updated_time
     *
     * @param updatedTime the value for t_zero_message_template.updated_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_template.is_deleted
     *
     * @return the value of t_zero_message_template.is_deleted
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_template.is_deleted
     *
     * @param deletedFlag the value for t_zero_message_template.is_deleted
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag == null ? null : deletedFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_template.template_desc
     *
     * @return the value of t_zero_message_template.template_desc
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getTemplateDesc() {
        return templateDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_template.template_desc
     *
     * @param templateDesc the value for t_zero_message_template.template_desc
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setTemplateDesc(String templateDesc) {
        this.templateDesc = templateDesc == null ? null : templateDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_template
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", channelId=").append(channelId);
        sb.append(", templateCode=").append(templateCode);
        sb.append(", templateType=").append(templateType);
        sb.append(", templateName=").append(templateName);
        sb.append(", templateStatus=").append(templateStatus);
        sb.append(", createdUserId=").append(createdUserId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedUserId=").append(updatedUserId);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", deletedFlag=").append(deletedFlag);
        sb.append(", templateDesc=").append(templateDesc);
        sb.append("]");
        return sb.toString();
    }
}