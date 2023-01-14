package com.t.zero.b.i.pump.db.dao.manual;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.t.zero.b.i.pump.db.dao.filters.PumpInfoFilters;
import com.t.zero.b.i.pump.db.model.auto.PumpInfo;


@Mapper
public interface ManualPumpInfoMapper {
	
	public List<PumpInfo> selectListWithPageByFilter(@Param("filters") PumpInfoFilters filters, @Param("currentPage") int currentPage, @Param("pageSize") int pageSize);
	public Long selectCountWithPageByFilter(@Param("filters") PumpInfoFilters filters);


}