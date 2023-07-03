package com.t.zero.b.i.pump.db.dao.auto;

import com.t.zero.b.i.pump.db.model.auto.InfoTotalChache;
import com.t.zero.b.i.pump.db.model.auto.InfoTotalChacheExample;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoTotalChacheMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_total_cache
     *
     * @mbg.generated Sat May 20 10:44:02 CST 2023
     */
    long countByExample(InfoTotalChacheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_total_cache
     *
     * @mbg.generated Sat May 20 10:44:02 CST 2023
     */
    int deleteByExample(InfoTotalChacheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_total_cache
     *
     * @mbg.generated Sat May 20 10:44:02 CST 2023
     */
    int deleteByPrimaryKey(LocalDateTime ts);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_total_cache
     *
     * @mbg.generated Sat May 20 10:44:02 CST 2023
     */
    int insert(InfoTotalChache record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_total_cache
     *
     * @mbg.generated Sat May 20 10:44:02 CST 2023
     */
    int insertSelective(InfoTotalChache record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_total_cache
     *
     * @mbg.generated Sat May 20 10:44:02 CST 2023
     */
    List<InfoTotalChache> selectByExample(InfoTotalChacheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_total_cache
     *
     * @mbg.generated Sat May 20 10:44:02 CST 2023
     */
    InfoTotalChache selectByPrimaryKey(LocalDateTime ts);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_total_cache
     *
     * @mbg.generated Sat May 20 10:44:02 CST 2023
     */
    int updateByExampleSelective(@Param("record") InfoTotalChache record, @Param("example") InfoTotalChacheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_total_cache
     *
     * @mbg.generated Sat May 20 10:44:02 CST 2023
     */
    int updateByExample(@Param("record") InfoTotalChache record, @Param("example") InfoTotalChacheExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_total_cache
     *
     * @mbg.generated Sat May 20 10:44:02 CST 2023
     */
    int updateByPrimaryKeySelective(InfoTotalChache record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_total_cache
     *
     * @mbg.generated Sat May 20 10:44:02 CST 2023
     */
    int updateByPrimaryKey(InfoTotalChache record);
}