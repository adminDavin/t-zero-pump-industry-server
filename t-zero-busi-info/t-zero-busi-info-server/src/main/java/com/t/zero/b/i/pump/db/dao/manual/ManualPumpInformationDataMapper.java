package com.t.zero.b.i.pump.db.dao.manual;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.t.zero.b.i.pump.db.dao.filters.PumpInformationDataFilters;
import com.t.zero.b.i.pump.db.model.auto.PumpInformationData;

public interface ManualPumpInformationDataMapper {
	public List<PumpInformationData> selectListWithPageByFilter(@Param("filters") PumpInformationDataFilters filters, @Param("currentPage") int currentPage, @Param("pageSize") int pageSize);
	public Long selectCountWithPageByFilter(@Param("filters") PumpInformationDataFilters filters);
	
	public List<String> selectDistinctPumpNameByPumpSource(@Param("filters") PumpInformationDataFilters filters);
	
}
