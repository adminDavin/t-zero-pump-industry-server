package com.t.zero.b.i.pump.db.dao.auto;

import com.t.zero.b.i.pump.db.model.auto.PumpParamsDefinition;
import com.t.zero.b.i.pump.db.model.auto.PumpParamsDefinitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PumpParamsDefinitionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    long countByExample(PumpParamsDefinitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int deleteByExample(PumpParamsDefinitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int insert(PumpParamsDefinition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int insertSelective(PumpParamsDefinition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    List<PumpParamsDefinition> selectByExampleWithBLOBs(PumpParamsDefinitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    List<PumpParamsDefinition> selectByExample(PumpParamsDefinitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    PumpParamsDefinition selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExampleSelective(@Param("record") PumpParamsDefinition record, @Param("example") PumpParamsDefinitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") PumpParamsDefinition record, @Param("example") PumpParamsDefinitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExample(@Param("record") PumpParamsDefinition record, @Param("example") PumpParamsDefinitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKeySelective(PumpParamsDefinition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(PumpParamsDefinition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_params_definition
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKey(PumpParamsDefinition record);
}