package com.t.zero.message.platform.vo.list.filters;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL) 
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class MessageInstanceFilters {

   private Integer userId;

   private Byte readedFlag;//0未读 1已读

   private LocalDateTime startTime;

   private LocalDateTime endTime;

   private String content;//内容

   private List<Integer> messageIds;
}
