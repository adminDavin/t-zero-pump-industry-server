package com.t.zero.rpc.user.api.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@SuppressWarnings("serial")
@Data
public class ServiceAccountStatisticsVo implements Serializable {
   private Integer serviceId;
   private String serviceName;
   private Integer hasNum;
   private Integer totalNum;
   private Integer userNum;
   private String serviceCode;
   private Integer parentNum;
   private Boolean canOperate;

}
