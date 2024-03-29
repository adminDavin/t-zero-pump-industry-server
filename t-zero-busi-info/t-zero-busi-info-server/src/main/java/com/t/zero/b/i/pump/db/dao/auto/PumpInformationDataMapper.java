package com.t.zero.b.i.pump.db.dao.auto;

import com.t.zero.b.i.pump.db.model.auto.PumpInformationData;
import com.t.zero.b.i.pump.db.model.auto.PumpInformationDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PumpInformationDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information_data
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    long countByExample(PumpInformationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information_data
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int deleteByExample(PumpInformationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information_data
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information_data
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int insert(PumpInformationData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information_data
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int insertSelective(PumpInformationData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information_data
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    List<PumpInformationData> selectByExampleWithBLOBs(PumpInformationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information_data
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    List<PumpInformationData> selectByExample(PumpInformationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information_data
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    PumpInformationData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information_data
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExampleSelective(@Param("record") PumpInformationData record, @Param("example") PumpInformationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information_data
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") PumpInformationData record, @Param("example") PumpInformationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information_data
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExample(@Param("record") PumpInformationData record, @Param("example") PumpInformationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information_data
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKeySelective(PumpInformationData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information_data
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(PumpInformationData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_information_data
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKey(PumpInformationData record);
}