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
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    long countByExample(UnitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int deleteByExample(UnitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int insert(Units record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int insertSelective(Units record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    List<Units> selectByExample(UnitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    Units selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExampleSelective(@Param("record") Units record, @Param("example") UnitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByExample(@Param("record") Units record, @Param("example") UnitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKeySelective(Units record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table units
     *
     * @mbg.generated Sat May 20 10:45:17 CST 2023
     */
    int updateByPrimaryKey(Units record);
}