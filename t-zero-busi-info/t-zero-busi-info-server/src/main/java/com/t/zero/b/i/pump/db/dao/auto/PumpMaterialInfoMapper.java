package com.t.zero.b.i.pump.db.dao.auto;

import com.t.zero.b.i.pump.db.model.auto.PumpMaterialInfo;
import com.t.zero.b.i.pump.db.model.auto.PumpMaterialInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PumpMaterialInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_material_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    long countByExample(PumpMaterialInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_material_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int deleteByExample(PumpMaterialInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_material_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_material_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int insert(PumpMaterialInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_material_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int insertSelective(PumpMaterialInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_material_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    List<PumpMaterialInfo> selectByExampleWithBLOBs(PumpMaterialInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_material_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    List<PumpMaterialInfo> selectByExample(PumpMaterialInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_material_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    PumpMaterialInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_material_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int updateByExampleSelective(@Param("record") PumpMaterialInfo record, @Param("example") PumpMaterialInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_material_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") PumpMaterialInfo record, @Param("example") PumpMaterialInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_material_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int updateByExample(@Param("record") PumpMaterialInfo record, @Param("example") PumpMaterialInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_material_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int updateByPrimaryKeySelective(PumpMaterialInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_material_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(PumpMaterialInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_material_info
     *
     * @mbg.generated Wed Mar 08 22:20:59 CST 2023
     */
    int updateByPrimaryKey(PumpMaterialInfo record);
}