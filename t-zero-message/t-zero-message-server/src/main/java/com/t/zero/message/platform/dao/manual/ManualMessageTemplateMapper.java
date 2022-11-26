package com.t.zero.message.platform.dao.manual;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.t.zero.message.platform.model.auto.MessageTemplate;

@Mapper
public interface ManualMessageTemplateMapper {
	
	public List<MessageTemplate> selectListWithPage(@Param("tenantId") Integer tenantId, @Param("currentPage") int currentPage, @Param("pageSize") int pageSize);

	public Integer selectList(@Param("tenantId") Integer tenantId);

    public Integer selectListByChannel(@Param("tenantId") Integer tenantId, @Param("userId") Integer userId, @Param("channelId") Integer channelId);

    public List<MessageTemplate> selectListByChannelWithPage(@Param("tenantId") Integer tenantId, @Param("userId") Integer userId, @Param("channelId") Integer channelId, @Param("currentPage") int currentPage, @Param("pageSize") int pageSize);
}
