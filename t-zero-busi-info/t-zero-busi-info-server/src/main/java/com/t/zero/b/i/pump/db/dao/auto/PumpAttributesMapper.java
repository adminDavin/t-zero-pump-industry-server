package com.t.zero.b.i.pump.db.dao.auto;

import com.t.zero.b.i.pump.db.model.auto.PumpAttributes;
import com.t.zero.b.i.pump.db.model.auto.PumpAttributesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PumpAttributesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_attributes
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    long countByExample(PumpAttributesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_attributes
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int deleteByExample(PumpAttributesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_attributes
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_attributes
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int insert(PumpAttributes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_attributes
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int insertSelective(PumpAttributes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_attributes
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    List<PumpAttributes> selectByExampleWithBLOBs(PumpAttributesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_attributes
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    List<PumpAttributes> selectByExample(PumpAttributesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_attributes
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    PumpAttributes selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_attributes
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExampleSelective(@Param("record") PumpAttributes record, @Param("example") PumpAttributesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_attributes
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExampleWithBLOBs(@Param("record") PumpAttributes record, @Param("example") PumpAttributesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_attributes
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExample(@Param("record") PumpAttributes record, @Param("example") PumpAttributesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_attributes
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKeySelective(PumpAttributes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_attributes
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKeyWithBLOBs(PumpAttributes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pump_attributes
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKey(PumpAttributes record);
}