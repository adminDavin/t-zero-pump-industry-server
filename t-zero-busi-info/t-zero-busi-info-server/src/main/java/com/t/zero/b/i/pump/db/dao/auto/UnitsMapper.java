package com.t.zero.b.i.pump.db.dao.auto;

import com.t.zero.b.i.pump.db.model.auto.Units;
import com.t.zero.b.i.pump.db.model.auto.UnitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    long countByExample(UnitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int deleteByExample(UnitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int insert(Units record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int insertSelective(Units record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    List<Units> selectByExample(UnitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    Units selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int updateByExampleSelective(@Param("record") Units record, @Param("example") UnitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int updateByExample(@Param("record") Units record, @Param("example") UnitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int updateByPrimaryKeySelective(Units record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sun Nov 20 21:02:12 CST 2022
     */
    int updateByPrimaryKey(Units record);
}