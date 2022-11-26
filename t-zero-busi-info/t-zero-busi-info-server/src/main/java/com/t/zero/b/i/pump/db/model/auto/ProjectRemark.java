package com.t.zero.b.i.pump.db.model.auto;

import java.io.Serializable;

public class ProjectRemark implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_remark.id
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_remark.project_header_id
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    private Integer projectHeaderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_remark.remark_content
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    private String remarkContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table project_remark
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_remark.id
     *
     * @return the value of project_remark.id
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_remark.id
     *
     * @param id the value for project_remark.id
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_remark.project_header_id
     *
     * @return the value of project_remark.project_header_id
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    public Integer getProjectHeaderId() {
        return projectHeaderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_remark.project_header_id
     *
     * @param projectHeaderId the value for project_remark.project_header_id
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    public void setProjectHeaderId(Integer projectHeaderId) {
        this.projectHeaderId = projectHeaderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_remark.remark_content
     *
     * @return the value of project_remark.remark_content
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    public String getRemarkContent() {
        return remarkContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_remark.remark_content
     *
     * @param remarkContent the value for project_remark.remark_content
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    public void setRemarkContent(String remarkContent) {
        this.remarkContent = remarkContent == null ? null : remarkContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", projectHeaderId=").append(projectHeaderId);
        sb.append(", remarkContent=").append(remarkContent);
        sb.append("]");
        return sb.toString();
    }
}