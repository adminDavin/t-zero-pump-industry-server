package com.t.zero.b.i.pump.db.dao.manual;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.t.zero.b.i.pump.db.dao.filters.PumpFaLanInfoFilters;
import com.t.zero.b.i.pump.db.model.auto.PumpFaLanInfo;


@Mapper
public interface ManualPumpFaLanInfoMapper {
	
	public List<PumpFaLanInfo> selectListWithPageByFilter(@Param("filters") PumpFaLanInfoFilters filters, @Param("currentPage") int currentPage, @Param("pageSize") int pageSize);
	public Long selectCountWithPageByFilter(@Param("filters") PumpFaLanInfoFilters filters);


}