package com.t.zero.b.i.pump.db.dao.auto;

import com.t.zero.b.i.pump.db.model.auto.BusiPumpInfo;
import com.t.zero.b.i.pump.db.model.auto.BusiPumpInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusiPumpInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_pump_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    long countByExample(BusiPumpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_pump_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int deleteByExample(BusiPumpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_pump_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_pump_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int insert(BusiPumpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_pump_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int insertSelective(BusiPumpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_pump_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    List<BusiPumpInfo> selectByExampleWithBLOBs(BusiPumpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_pump_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    List<BusiPumpInfo> selectByExample(BusiPumpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_pump_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    BusiPumpInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_pump_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExampleSelective(@Param("record") BusiPumpInfo record, @Param("example") BusiPumpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_pump_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") BusiPumpInfo record, @Param("example") BusiPumpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_pump_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExample(@Param("record") BusiPumpInfo record, @Param("example") BusiPumpInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_pump_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKeySelective(BusiPumpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_pump_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(BusiPumpInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table busi_pump_info
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKey(BusiPumpInfo record);
}