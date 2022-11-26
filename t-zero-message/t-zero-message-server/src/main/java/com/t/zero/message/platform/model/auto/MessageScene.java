package com.t.zero.message.platform.model.auto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MessageScene implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_scene.id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_scene.tenant_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private Integer tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_scene.scene_code
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String sceneCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_scene.scene_name
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String sceneName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_scene.scene_status
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private Byte sceneStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_scene.created_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String createdUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_scene.created_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private LocalDateTime createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_scene.updated_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String updatedUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_scene.updated_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private LocalDateTime updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_zero_message_scene.is_deleted
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private String deletedFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_zero_message_scene
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_scene.id
     *
     * @return the value of t_zero_message_scene.id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_scene.id
     *
     * @param id the value for t_zero_message_scene.id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_scene.tenant_id
     *
     * @return the value of t_zero_message_scene.tenant_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_scene.tenant_id
     *
     * @param tenantId the value for t_zero_message_scene.tenant_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_scene.scene_code
     *
     * @return the value of t_zero_message_scene.scene_code
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getSceneCode() {
        return sceneCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_scene.scene_code
     *
     * @param sceneCode the value for t_zero_message_scene.scene_code
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode == null ? null : sceneCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_scene.scene_name
     *
     * @return the value of t_zero_message_scene.scene_name
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getSceneName() {
        return sceneName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_scene.scene_name
     *
     * @param sceneName the value for t_zero_message_scene.scene_name
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setSceneName(String sceneName) {
        this.sceneName = sceneName == null ? null : sceneName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_scene.scene_status
     *
     * @return the value of t_zero_message_scene.scene_status
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public Byte getSceneStatus() {
        return sceneStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_scene.scene_status
     *
     * @param sceneStatus the value for t_zero_message_scene.scene_status
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setSceneStatus(Byte sceneStatus) {
        this.sceneStatus = sceneStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_scene.created_user_id
     *
     * @return the value of t_zero_message_scene.created_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_scene.created_user_id
     *
     * @param createdUserId the value for t_zero_message_scene.created_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId == null ? null : createdUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_scene.created_time
     *
     * @return the value of t_zero_message_scene.created_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_scene.created_time
     *
     * @param createdTime the value for t_zero_message_scene.created_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_scene.updated_user_id
     *
     * @return the value of t_zero_message_scene.updated_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getUpdatedUserId() {
        return updatedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_scene.updated_user_id
     *
     * @param updatedUserId the value for t_zero_message_scene.updated_user_id
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId == null ? null : updatedUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_scene.updated_time
     *
     * @return the value of t_zero_message_scene.updated_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_scene.updated_time
     *
     * @param updatedTime the value for t_zero_message_scene.updated_time
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_zero_message_scene.is_deleted
     *
     * @return the value of t_zero_message_scene.is_deleted
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public String getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_zero_message_scene.is_deleted
     *
     * @param deletedFlag the value for t_zero_message_scene.is_deleted
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag == null ? null : deletedFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_scene
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
        sb.append(", sceneCode=").append(sceneCode);
        sb.append(", sceneName=").append(sceneName);
        sb.append(", sceneStatus=").append(sceneStatus);
        sb.append(", createdUserId=").append(createdUserId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedUserId=").append(updatedUserId);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", deletedFlag=").append(deletedFlag);
        sb.append("]");
        return sb.toString();
    }
}