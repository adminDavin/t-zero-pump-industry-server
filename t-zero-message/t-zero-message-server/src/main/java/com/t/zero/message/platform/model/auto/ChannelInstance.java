package com.t.zero.message.platform.model.auto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ChannelInstance implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_channel_instance.id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_channel_instance.user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_channel_instance.channel_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private Integer channelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_channel_instance.channel_code
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String channelCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_channel_instance.channel_type
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String channelType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_channel_instance.channel_default
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private Byte channelDefault;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_channel_instance.channel_status
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private Byte channelStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_channel_instance.created_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String createdUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_channel_instance.created_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private LocalDateTime createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_channel_instance.updated_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String updatedUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_channel_instance.updated_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private LocalDateTime updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_channel_instance.is_deleted
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String deletedFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_zero_channel_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_channel_instance.id
     *
     * @return the value of t_zero_channel_instance.id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_channel_instance.id
     *
     * @param id the value for t_zero_channel_instance.id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_channel_instance.user_id
     *
     * @return the value of t_zero_channel_instance.user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_channel_instance.user_id
     *
     * @param userId the value for t_zero_channel_instance.user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_channel_instance.channel_id
     *
     * @return the value of t_zero_channel_instance.channel_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_channel_instance.channel_id
     *
     * @param channelId the value for t_zero_channel_instance.channel_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_channel_instance.channel_code
     *
     * @return the value of t_zero_channel_instance.channel_code
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_channel_instance.channel_code
     *
     * @param channelCode the value for t_zero_channel_instance.channel_code
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_channel_instance.channel_type
     *
     * @return the value of t_zero_channel_instance.channel_type
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_channel_instance.channel_type
     *
     * @param channelType the value for t_zero_channel_instance.channel_type
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_channel_instance.channel_default
     *
     * @return the value of t_zero_channel_instance.channel_default
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public Byte getChannelDefault() {
        return channelDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_channel_instance.channel_default
     *
     * @param channelDefault the value for t_zero_channel_instance.channel_default
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setChannelDefault(Byte channelDefault) {
        this.channelDefault = channelDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_channel_instance.channel_status
     *
     * @return the value of t_zero_channel_instance.channel_status
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public Byte getChannelStatus() {
        return channelStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_channel_instance.channel_status
     *
     * @param channelStatus the value for t_zero_channel_instance.channel_status
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setChannelStatus(Byte channelStatus) {
        this.channelStatus = channelStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_channel_instance.created_user_id
     *
     * @return the value of t_zero_channel_instance.created_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_channel_instance.created_user_id
     *
     * @param createdUserId the value for t_zero_channel_instance.created_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId == null ? null : createdUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_channel_instance.created_time
     *
     * @return the value of t_zero_channel_instance.created_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_channel_instance.created_time
     *
     * @param createdTime the value for t_zero_channel_instance.created_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_channel_instance.updated_user_id
     *
     * @return the value of t_zero_channel_instance.updated_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getUpdatedUserId() {
        return updatedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_channel_instance.updated_user_id
     *
     * @param updatedUserId the value for t_zero_channel_instance.updated_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId == null ? null : updatedUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_channel_instance.updated_time
     *
     * @return the value of t_zero_channel_instance.updated_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_channel_instance.updated_time
     *
     * @param updatedTime the value for t_zero_channel_instance.updated_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_channel_instance.is_deleted
     *
     * @return the value of t_zero_channel_instance.is_deleted
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_channel_instance.is_deleted
     *
     * @param deletedFlag the value for t_zero_channel_instance.is_deleted
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag == null ? null : deletedFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_channel_instance
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
        sb.append(", userId=").append(userId);
        sb.append(", channelId=").append(channelId);
        sb.append(", channelCode=").append(channelCode);
        sb.append(", channelType=").append(channelType);
        sb.append(", channelDefault=").append(channelDefault);
        sb.append(", channelStatus=").append(channelStatus);
        sb.append(", createdUserId=").append(createdUserId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedUserId=").append(updatedUserId);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", deletedFlag=").append(deletedFlag);
        sb.append("]");
        return sb.toString();
    }
}