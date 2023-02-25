package com.t.zero.b.i.pump.db.model.auto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ProjectHeader implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.tenant_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Integer tenantId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.ProjectName
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String projectname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.CustomerNumber
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String customernumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.AskingNumber
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String askingnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.BudgetNumber
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String budgetnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.Designer
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String designer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.Owener
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String owener;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.project_region
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String projectRegion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.sales_manager
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String salesManager;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.tech_support
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String techSupport;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.Device_name
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String deviceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.CreateData
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String createdata;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.user_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.created_time
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private LocalDateTime createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.updated_user_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String updatedUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.updated_time
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private LocalDateTime updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.is_deleted
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private String deletedFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column projectheader.group_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private Integer groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table projectheader
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.id
     *
     * @return the value of projectheader.id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.id
     *
     * @param id the value for projectheader.id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.tenant_id
     *
     * @return the value of projectheader.tenant_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.tenant_id
     *
     * @param tenantId the value for projectheader.tenant_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.ProjectName
     *
     * @return the value of projectheader.ProjectName
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getProjectname() {
        return projectname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.ProjectName
     *
     * @param projectname the value for projectheader.ProjectName
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.CustomerNumber
     *
     * @return the value of projectheader.CustomerNumber
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getCustomernumber() {
        return customernumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.CustomerNumber
     *
     * @param customernumber the value for projectheader.CustomerNumber
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setCustomernumber(String customernumber) {
        this.customernumber = customernumber == null ? null : customernumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.AskingNumber
     *
     * @return the value of projectheader.AskingNumber
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getAskingnumber() {
        return askingnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.AskingNumber
     *
     * @param askingnumber the value for projectheader.AskingNumber
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setAskingnumber(String askingnumber) {
        this.askingnumber = askingnumber == null ? null : askingnumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.BudgetNumber
     *
     * @return the value of projectheader.BudgetNumber
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getBudgetnumber() {
        return budgetnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.BudgetNumber
     *
     * @param budgetnumber the value for projectheader.BudgetNumber
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setBudgetnumber(String budgetnumber) {
        this.budgetnumber = budgetnumber == null ? null : budgetnumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.Designer
     *
     * @return the value of projectheader.Designer
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getDesigner() {
        return designer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.Designer
     *
     * @param designer the value for projectheader.Designer
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setDesigner(String designer) {
        this.designer = designer == null ? null : designer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.Owener
     *
     * @return the value of projectheader.Owener
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getOwener() {
        return owener;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.Owener
     *
     * @param owener the value for projectheader.Owener
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setOwener(String owener) {
        this.owener = owener == null ? null : owener.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.project_region
     *
     * @return the value of projectheader.project_region
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getProjectRegion() {
        return projectRegion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.project_region
     *
     * @param projectRegion the value for projectheader.project_region
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setProjectRegion(String projectRegion) {
        this.projectRegion = projectRegion == null ? null : projectRegion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.sales_manager
     *
     * @return the value of projectheader.sales_manager
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getSalesManager() {
        return salesManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.sales_manager
     *
     * @param salesManager the value for projectheader.sales_manager
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setSalesManager(String salesManager) {
        this.salesManager = salesManager == null ? null : salesManager.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.tech_support
     *
     * @return the value of projectheader.tech_support
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getTechSupport() {
        return techSupport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.tech_support
     *
     * @param techSupport the value for projectheader.tech_support
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setTechSupport(String techSupport) {
        this.techSupport = techSupport == null ? null : techSupport.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.Device_name
     *
     * @return the value of projectheader.Device_name
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.Device_name
     *
     * @param deviceName the value for projectheader.Device_name
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.CreateData
     *
     * @return the value of projectheader.CreateData
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getCreatedata() {
        return createdata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.CreateData
     *
     * @param createdata the value for projectheader.CreateData
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setCreatedata(String createdata) {
        this.createdata = createdata == null ? null : createdata.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.user_id
     *
     * @return the value of projectheader.user_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.user_id
     *
     * @param userId the value for projectheader.user_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.created_time
     *
     * @return the value of projectheader.created_time
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.created_time
     *
     * @param createdTime the value for projectheader.created_time
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.updated_user_id
     *
     * @return the value of projectheader.updated_user_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getUpdatedUserId() {
        return updatedUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.updated_user_id
     *
     * @param updatedUserId the value for projectheader.updated_user_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId == null ? null : updatedUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.updated_time
     *
     * @return the value of projectheader.updated_time
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.updated_time
     *
     * @param updatedTime the value for projectheader.updated_time
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.is_deleted
     *
     * @return the value of projectheader.is_deleted
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public String getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.is_deleted
     *
     * @param deletedFlag the value for projectheader.is_deleted
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setDeletedFlag(String deletedFlag) {
        this.deletedFlag = deletedFlag == null ? null : deletedFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column projectheader.group_id
     *
     * @return the value of projectheader.group_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column projectheader.group_id
     *
     * @param groupId the value for projectheader.group_id
     *
     * @mbg.generated Sat Feb 25 10:41:32 CST 2023
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectheader
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
        sb.append(", tenantId=").append(tenantId);
        sb.append(", projectname=").append(projectname);
        sb.append(", customernumber=").append(customernumber);
        sb.append(", askingnumber=").append(askingnumber);
        sb.append(", budgetnumber=").append(budgetnumber);
        sb.append(", designer=").append(designer);
        sb.append(", owener=").append(owener);
        sb.append(", projectRegion=").append(projectRegion);
        sb.append(", salesManager=").append(salesManager);
        sb.append(", techSupport=").append(techSupport);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", createdata=").append(createdata);
        sb.append(", userId=").append(userId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedUserId=").append(updatedUserId);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", deletedFlag=").append(deletedFlag);
        sb.append(", groupId=").append(groupId);
        sb.append("]");
        return sb.toString();
    }
}