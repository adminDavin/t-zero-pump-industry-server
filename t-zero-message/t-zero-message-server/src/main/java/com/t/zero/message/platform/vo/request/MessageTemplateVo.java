package com.t.zero.message.platform.vo.request;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL) 
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class MessageTemplateVo {
    /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column t_zero_message_template.id
    *
    * @mbg.generated Tue Jul 27 18:01:47 CST 2021
    */
   private Integer id;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column t_zero_message_template.tenant_id
    *
    * @mbg.generated Tue Jul 27 18:01:47 CST 2021
    */
   private Integer tenantId;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column t_zero_message_template.channel_id
    *
    * @mbg.generated Tue Jul 27 18:01:47 CST 2021
    */
   private Integer channelId;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column t_zero_message_template.template_code
    *
    * @mbg.generated Tue Jul 27 18:01:47 CST 2021
    */
   private String templateCode;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column t_zero_message_template.template_type
    *
    * @mbg.generated Tue Jul 27 18:01:47 CST 2021
    */
   private String templateType;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column t_zero_message_template.template_name
    *
    * @mbg.generated Tue Jul 27 18:01:47 CST 2021
    */
   private String templateName;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column t_zero_message_template.template_status
    *
    * @mbg.generated Tue Jul 27 18:01:47 CST 2021
    */
   private Byte templateStatus;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column t_zero_message_template.created_user_id
    *
    * @mbg.generated Tue Jul 27 18:01:47 CST 2021
    */
   private String createdUserId;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column t_zero_message_template.created_time
    *
    * @mbg.generated Tue Jul 27 18:01:47 CST 2021
    */
   private LocalDateTime createdTime;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column t_zero_message_template.updated_user_id
    *
    * @mbg.generated Tue Jul 27 18:01:47 CST 2021
    */
   private String updatedUserId;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column t_zero_message_template.updated_time
    *
    * @mbg.generated Tue Jul 27 18:01:47 CST 2021
    */
   private LocalDateTime updatedTime;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column t_zero_message_template.is_deleted
    *
    * @mbg.generated Tue Jul 27 18:01:47 CST 2021
    */
   private String deletedFlag;

   /**
    *
    * This field was generated by MyBatis Generator.
    * This field corresponds to the database column t_zero_message_template.template_desc
    *
    * @mbg.generated Tue Jul 27 18:01:47 CST 2021
    */
   private JsonNode templateDesc;
}
