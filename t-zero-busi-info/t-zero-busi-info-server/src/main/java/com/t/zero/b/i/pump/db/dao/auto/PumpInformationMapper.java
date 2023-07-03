package com.t.zero.b.i.pump.db.dao.auto;

import com.t.zero.b.i.pump.db.model.auto.PumpInformation;
import com.t.zero.b.i.pump.db.model.auto.PumpInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PumpInformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    long countByExample(PumpInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int deleteByExample(PumpInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int insert(PumpInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int insertSelective(PumpInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    List<PumpInformation> selectByExampleWithBLOBs(PumpInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    List<PumpInformation> selectByExample(PumpInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    PumpInformation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExampleSelective(@Param("record") PumpInformation record, @Param("example") PumpInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") PumpInformation record, @Param("example") PumpInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExample(@Param("record") PumpInformation record, @Param("example") PumpInformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKeySelective(PumpInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(PumpInformation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKey(PumpInformation record);
}