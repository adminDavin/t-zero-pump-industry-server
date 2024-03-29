package com.t.zero.b.i.pump.db.model.auto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BusiGroupInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_group_info.id
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_group_info.pv_code
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    private String pvCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_group_info.group_code
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    private String groupCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_group_info.major_key
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    private String majorKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_group_info.pump_source
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    private String pumpSource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_group_info.created_user_id
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    private String createdUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_group_info.created_time
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    private LocalDateTime createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_group_info.updated_user_id
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    private String updatedUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_group_info.updated_time
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    private LocalDateTime updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_group_info.is_deleted
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    private String deletedFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column busi_group_info.pv_desc
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    private String pvDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table busi_group_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_group_info.id
     *
     * @return the value of busi_group_info.id
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_group_info.id
     *
     * @param id the value for busi_group_info.id
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_group_info.pv_code
     *
     * @return the value of busi_group_info.pv_code
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public String getPvCode() {
        return pvCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_group_info.pv_code
     *
     * @param pvCode the value for busi_group_info.pv_code
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public void setPvCode(String pvCode) {
        this.pvCode = pvCode == null ? null : pvCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_group_info.group_code
     *
     * @return the value of busi_group_info.group_code
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_group_info.group_code
     *
     * @param groupCode the value for busi_group_info.group_code
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode == null ? null : groupCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_group_info.major_key
     *
     * @return the value of busi_group_info.major_key
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public String getMajorKey() {
        return majorKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_group_info.major_key
     *
     * @param majorKey the value for busi_group_info.major_key
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public void setMajorKey(String majorKey) {
        this.majorKey = majorKey == null ? null : majorKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_group_info.pump_source
     *
     * @return the value of busi_group_info.pump_source
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public String getPumpSource() {
        return pumpSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_group_info.pump_source
     *
     * @param pumpSource the value for busi_group_info.pump_source
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public void setPumpSource(String pumpSource) {
        this.pumpSource = pumpSource == null ? null : pumpSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_group_info.created_user_id
     *
     * @return the value of busi_group_info.created_user_id
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_group_info.created_user_id
     *
     * @param createdUserId the value for busi_group_info.created_user_id
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId == null ? null : createdUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_group_info.created_time
     *
     * @return the value of busi_group_info.created_time
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_group_info.created_time
     *
     * @param createdTime the value for busi_group_info.created_time
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_group_info.updated_user_id
     *
     * @return the value of busi_group_info.updated_user_id
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public String getUpdatedUserId() {
        return updatedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_group_info.updated_user_id
     *
     * @param updatedUserId the value for busi_group_info.updated_user_id
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId == null ? null : updatedUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_group_info.updated_time
     *
     * @return the value of busi_group_info.updated_time
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_group_info.updated_time
     *
     * @param updatedTime the value for busi_group_info.updated_time
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_group_info.is_deleted
     *
     * @return the value of busi_group_info.is_deleted
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public String getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_group_info.is_deleted
     *
     * @param deletedFlag the value for busi_group_info.is_deleted
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag == null ? null : deletedFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column busi_group_info.pv_desc
     *
     * @return the value of busi_group_info.pv_desc
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public String getPvDesc() {
        return pvDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column busi_group_info.pv_desc
     *
     * @param pvDesc the value for busi_group_info.pv_desc
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    public void setPvDesc(String pvDesc) {
        this.pvDesc = pvDesc == null ? null : pvDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_group_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pvCode=").append(pvCode);
        sb.append(", groupCode=").append(groupCode);
        sb.append(", majorKey=").append(majorKey);
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