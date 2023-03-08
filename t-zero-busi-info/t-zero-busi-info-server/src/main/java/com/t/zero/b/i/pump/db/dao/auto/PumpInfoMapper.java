package com.t.zero.b.i.pump.db.dao.auto;

import com.t.zero.b.i.pump.db.model.auto.PumpInfo;
import com.t.zero.b.i.pump.db.model.auto.PumpInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PumpInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    long countByExample(PumpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int deleteByExample(PumpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int insert(PumpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int insertSelective(PumpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    List<PumpInfo> selectByExampleWithBLOBs(PumpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    List<PumpInfo> selectByExample(PumpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    PumpInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int updateByExampleSelective(@Param("record") PumpInfo record, @Param("example") PumpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") PumpInfo record, @Param("example") PumpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int updateByExample(@Param("record") PumpInfo record, @Param("example") PumpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int updateByPrimaryKeySelective(PumpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(PumpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int updateByPrimaryKey(PumpInfo record);
}