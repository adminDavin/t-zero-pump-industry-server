package com.t.zero.b.i.pump.db.dao.auto;

import com.t.zero.b.i.pump.db.model.auto.PumpInteractiveFieldConfig;
import com.t.zero.b.i.pump.db.model.auto.PumpInteractiveFieldConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PumpInteractiveFieldConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_interactive_field_config
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    long countByExample(PumpInteractiveFieldConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_interactive_field_config
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    int deleteByExample(PumpInteractiveFieldConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_interactive_field_config
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_interactive_field_config
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    int insert(PumpInteractiveFieldConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_interactive_field_config
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    int insertSelective(PumpInteractiveFieldConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_interactive_field_config
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    List<PumpInteractiveFieldConfig> selectByExampleWithBLOBs(PumpInteractiveFieldConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_interactive_field_config
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    List<PumpInteractiveFieldConfig> selectByExample(PumpInteractiveFieldConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_interactive_field_config
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    PumpInteractiveFieldConfig selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_interactive_field_config
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    int updateByExampleSelective(@Param("record") PumpInteractiveFieldConfig record, @Param("example") PumpInteractiveFieldConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_interactive_field_config
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") PumpInteractiveFieldConfig record, @Param("example") PumpInteractiveFieldConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_interactive_field_config
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    int updateByExample(@Param("record") PumpInteractiveFieldConfig record, @Param("example") PumpInteractiveFieldConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_interactive_field_config
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    int updateByPrimaryKeySelective(PumpInteractiveFieldConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_interactive_field_config
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(PumpInteractiveFieldConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_interactive_field_config
     *
     * @mbg.generated Thu Mar 30 00:47:13 CST 2023
     */
    int updateByPrimaryKey(PumpInteractiveFieldConfig record);
}