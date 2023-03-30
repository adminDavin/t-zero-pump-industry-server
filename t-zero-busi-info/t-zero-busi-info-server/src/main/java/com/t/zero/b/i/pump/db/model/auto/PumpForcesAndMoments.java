package com.t.zero.b.i.pump.db.model.auto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PumpForcesAndMoments implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_forces_and_moments.id
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_forces_and_moments.pv_code
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    private String pvCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_forces_and_moments.dn
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    private String dn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_forces_and_moments.standard
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    private String standard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_forces_and_moments.location
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    private String location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_forces_and_moments.pump_source
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    private String pumpSource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_forces_and_moments.created_user_id
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    private String createdUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_forces_and_moments.created_time
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    private LocalDateTime createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_forces_and_moments.updated_user_id
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    private String updatedUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_forces_and_moments.updated_time
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    private LocalDateTime updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_forces_and_moments.is_deleted
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    private String deletedFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pump_forces_and_moments.pv_desc
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    private String pvDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_forces_and_moments.id
     *
     * @return the value of pump_forces_and_moments.id
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_forces_and_moments.id
     *
     * @param id the value for pump_forces_and_moments.id
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_forces_and_moments.pv_code
     *
     * @return the value of pump_forces_and_moments.pv_code
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public String getPvCode() {
        return pvCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_forces_and_moments.pv_code
     *
     * @param pvCode the value for pump_forces_and_moments.pv_code
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public void setPvCode(String pvCode) {
        this.pvCode = pvCode == null ? null : pvCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_forces_and_moments.dn
     *
     * @return the value of pump_forces_and_moments.dn
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public String getDn() {
        return dn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_forces_and_moments.dn
     *
     * @param dn the value for pump_forces_and_moments.dn
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public void setDn(String dn) {
        this.dn = dn == null ? null : dn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_forces_and_moments.standard
     *
     * @return the value of pump_forces_and_moments.standard
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public String getStandard() {
        return standard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_forces_and_moments.standard
     *
     * @param standard the value for pump_forces_and_moments.standard
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_forces_and_moments.location
     *
     * @return the value of pump_forces_and_moments.location
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_forces_and_moments.location
     *
     * @param location the value for pump_forces_and_moments.location
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_forces_and_moments.pump_source
     *
     * @return the value of pump_forces_and_moments.pump_source
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public String getPumpSource() {
        return pumpSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_forces_and_moments.pump_source
     *
     * @param pumpSource the value for pump_forces_and_moments.pump_source
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public void setPumpSource(String pumpSource) {
        this.pumpSource = pumpSource == null ? null : pumpSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_forces_and_moments.created_user_id
     *
     * @return the value of pump_forces_and_moments.created_user_id
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_forces_and_moments.created_user_id
     *
     * @param createdUserId the value for pump_forces_and_moments.created_user_id
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId == null ? null : createdUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_forces_and_moments.created_time
     *
     * @return the value of pump_forces_and_moments.created_time
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_forces_and_moments.created_time
     *
     * @param createdTime the value for pump_forces_and_moments.created_time
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_forces_and_moments.updated_user_id
     *
     * @return the value of pump_forces_and_moments.updated_user_id
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public String getUpdatedUserId() {
        return updatedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_forces_and_moments.updated_user_id
     *
     * @param updatedUserId the value for pump_forces_and_moments.updated_user_id
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId == null ? null : updatedUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_forces_and_moments.updated_time
     *
     * @return the value of pump_forces_and_moments.updated_time
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_forces_and_moments.updated_time
     *
     * @param updatedTime the value for pump_forces_and_moments.updated_time
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_forces_and_moments.is_deleted
     *
     * @return the value of pump_forces_and_moments.is_deleted
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public String getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_forces_and_moments.is_deleted
     *
     * @param deletedFlag the value for pump_forces_and_moments.is_deleted
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag == null ? null : deletedFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pump_forces_and_moments.pv_desc
     *
     * @return the value of pump_forces_and_moments.pv_desc
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public String getPvDesc() {
        return pvDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pump_forces_and_moments.pv_desc
     *
     * @param pvDesc the value for pump_forces_and_moments.pv_desc
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    public void setPvDesc(String pvDesc) {
        this.pvDesc = pvDesc == null ? null : pvDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_forces_and_moments
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pvCode=").append(pvCode);
        sb.append(", dn=").append(dn);
        sb.append(", standard=").append(standard);
        sb.append(", location=").append(location);
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