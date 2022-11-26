package com.t.zero.message.platform.dao.manual;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.t.zero.message.platform.model.auto.MessageInstance;
import com.t.zero.message.platform.vo.list.filters.MessageInstanceFilters;

@Mapper
public interface ManualMessageInstanceMapper {
	
	public List<MessageInstance> selectListWithPage(@Param("filters") MessageInstanceFilters filters, @Param("currentPage") int currentPage, @Param("pageSize") int pageSize);

	public Integer selectList(@Param("filters") MessageInstanceFilters filters);
}
