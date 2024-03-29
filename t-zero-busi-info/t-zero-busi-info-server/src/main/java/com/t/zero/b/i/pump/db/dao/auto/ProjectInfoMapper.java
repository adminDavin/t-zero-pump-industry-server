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
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    long countByExample(ProjectInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int deleteByExample(ProjectInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int insert(ProjectInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int insertSelective(ProjectInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    List<ProjectInfo> selectByExampleWithBLOBs(ProjectInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    List<ProjectInfo> selectByExample(ProjectInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    ProjectInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExampleSelective(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExample(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKeySelective(ProjectInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(ProjectInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectinfo
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKey(ProjectInfo record);
}