package com.t.zero.b.i.pump.db.dao.auto;

import com.t.zero.b.i.pump.db.model.auto.ProjectInfo;
import com.t.zero.b.i.pump.db.model.auto.ProjectInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    long countByExample(ProjectInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int deleteByExample(ProjectInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int insert(ProjectInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int insertSelective(ProjectInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    List<ProjectInfo> selectByExampleWithBLOBs(ProjectInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    List<ProjectInfo> selectByExample(ProjectInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    ProjectInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int updateByExampleSelective(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int updateByExample(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int updateByPrimaryKeySelective(ProjectInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(ProjectInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int updateByPrimaryKey(ProjectInfo record);
}