package com.t.zero.b.i.pump.db.dao.manual;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.t.zero.b.i.pump.db.dao.filters.ProjectHeaderFilters;
import com.t.zero.b.i.pump.db.model.auto.ProjectHeader;


@Mapper
public interface ManualProjectHeaderMapper {
	
	public List<ProjectHeader> selectListWithPageByFilter(@Param("filters") ProjectHeaderFilters filters, @Param("currentPage") int currentPage, @Param("pageSize") int pageSize);
	public Long selectCountWithPageByFilter(@Param("filters") ProjectHeaderFilters filters);


}
