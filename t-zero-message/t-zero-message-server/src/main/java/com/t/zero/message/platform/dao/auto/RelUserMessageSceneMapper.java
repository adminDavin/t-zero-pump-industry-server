package com.t.zero.message.platform.dao.auto;

import com.t.zero.message.platform.model.auto.RelUserMessageScene;
import com.t.zero.message.platform.model.auto.RelUserMessageSceneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelUserMessageSceneMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_rel_user_message_scene
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    long countByExample(RelUserMessageSceneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_rel_user_message_scene
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int deleteByExample(RelUserMessageSceneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_rel_user_message_scene
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_rel_user_message_scene
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int insert(RelUserMessageScene record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_rel_user_message_scene
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int insertSelective(RelUserMessageScene record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_rel_user_message_scene
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    List<RelUserMessageScene> selectByExample(RelUserMessageSceneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_rel_user_message_scene
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    RelUserMessageScene selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_rel_user_message_scene
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int updateByExampleSelective(@Param("record") RelUserMessageScene record, @Param("example") RelUserMessageSceneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_rel_user_message_scene
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int updateByExample(@Param("record") RelUserMessageScene record, @Param("example") RelUserMessageSceneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_rel_user_message_scene
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int updateByPrimaryKeySelective(RelUserMessageScene record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_zero_rel_user_message_scene
     *
     * @mbg.generated Tue Jul 27 18:33:33 CST 2021
     */
    int updateByPrimaryKey(RelUserMessageScene record);
}