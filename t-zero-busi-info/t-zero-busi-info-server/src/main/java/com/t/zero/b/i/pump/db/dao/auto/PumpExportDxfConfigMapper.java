package com.t.zero.b.i.pump.db.dao.auto;

import com.t.zero.b.i.pump.db.model.auto.PumpExportDxfConfig;
import com.t.zero.b.i.pump.db.model.auto.PumpExportDxfConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PumpExportDxfConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Fri Feb 24 16:09:40 CST 2023
     */
    long countByExample(PumpExportDxfConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Fri Feb 24 16:09:40 CST 2023
     */
    int deleteByExample(PumpExportDxfConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Fri Feb 24 16:09:40 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Fri Feb 24 16:09:40 CST 2023
     */
    int insert(PumpExportDxfConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Fri Feb 24 16:09:40 CST 2023
     */
    int insertSelective(PumpExportDxfConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Fri Feb 24 16:09:40 CST 2023
     */
    List<PumpExportDxfConfig> selectByExampleWithBLOBs(PumpExportDxfConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Fri Feb 24 16:09:40 CST 2023
     */
    List<PumpExportDxfConfig> selectByExample(PumpExportDxfConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Fri Feb 24 16:09:40 CST 2023
     */
    PumpExportDxfConfig selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Fri Feb 24 16:09:40 CST 2023
     */
    int updateByExampleSelective(@Param("record") PumpExportDxfConfig record, @Param("example") PumpExportDxfConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Fri Feb 24 16:09:40 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") PumpExportDxfConfig record, @Param("example") PumpExportDxfConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Fri Feb 24 16:09:40 CST 2023
     */
    int updateByExample(@Param("record") PumpExportDxfConfig record, @Param("example") PumpExportDxfConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Fri Feb 24 16:09:40 CST 2023
     */
    int updateByPrimaryKeySelective(PumpExportDxfConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Fri Feb 24 16:09:40 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(PumpExportDxfConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_export_dxf_config
     *
     * @mbg.generated Fri Feb 24 16:09:40 CST 2023
     */
    int updateByPrimaryKey(PumpExportDxfConfig record);
}