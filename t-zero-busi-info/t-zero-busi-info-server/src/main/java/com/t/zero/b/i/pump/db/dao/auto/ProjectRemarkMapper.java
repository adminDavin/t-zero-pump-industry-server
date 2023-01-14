package com.t.zero.b.i.pump.db.dao.auto;

import com.t.zero.b.i.pump.db.model.auto.ProjectRemark;
import com.t.zero.b.i.pump.db.model.auto.ProjectRemarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectRemarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    long countByExample(ProjectRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    int deleteByExample(ProjectRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    int insert(ProjectRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    int insertSelective(ProjectRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    List<ProjectRemark> selectByExampleWithBLOBs(ProjectRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    List<ProjectRemark> selectByExample(ProjectRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    ProjectRemark selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    int updateByExampleSelective(@Param("record") ProjectRemark record, @Param("example") ProjectRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") ProjectRemark record, @Param("example") ProjectRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    int updateByExample(@Param("record") ProjectRemark record, @Param("example") ProjectRemarkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    int updateByPrimaryKeySelective(ProjectRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(ProjectRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project_remark
     *
     * @mbg.generated Sat Jan 14 17:17:13 CST 2023
     */
    int updateByPrimaryKey(ProjectRemark record);
}