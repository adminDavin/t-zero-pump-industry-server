package com.t.zero.message.platform.dao.auto;

import com.t.zero.message.platform.model.auto.MessageInstance;
import com.t.zero.message.platform.model.auto.MessageInstanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageInstanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    long countByExample(MessageInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int deleteByExample(MessageInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int insert(MessageInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int insertSelective(MessageInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    List<MessageInstance> selectByExampleWithBLOBs(MessageInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    List<MessageInstance> selectByExample(MessageInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    MessageInstance selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int updateByExampleSelective(@Param("record") MessageInstance record, @Param("example") MessageInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int updateByExampleWithBLOBs(@Param("record") MessageInstance record, @Param("example") MessageInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int updateByExample(@Param("record") MessageInstance record, @Param("example") MessageInstanceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int updateByPrimaryKeySelective(MessageInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int updateByPrimaryKeyWithBLOBs(MessageInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_message_instance
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int updateByPrimaryKey(MessageInstance record);
}