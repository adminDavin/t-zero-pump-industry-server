package com.t.zero.b.i.pump.db.dao.manual;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.t.zero.b.i.pump.db.dao.filters.PumpArchitectureInfoFilters;
import com.t.zero.b.i.pump.db.model.auto.PumpArchitectureInfo;

public interface ManualPumpArchitectureInfoMapper {
	public List<PumpArchitectureInfo> selectListWithPageByFilter(@Param("filters") PumpArchitectureInfoFilters filters,
			@Param("currentPage") int currentPage, @Param("pageSize") int pageSize);

	public Long selectCountWithPageByFilter(@Param("filters") PumpArchitectureInfoFilters filters);

}
