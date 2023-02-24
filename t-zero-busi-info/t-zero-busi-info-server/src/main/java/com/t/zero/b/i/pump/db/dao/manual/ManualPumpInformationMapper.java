package com.t.zero.b.i.pump.db.dao.manual;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.t.zero.b.i.pump.db.dao.filters.PumpInformationFilters;
import com.t.zero.b.i.pump.db.model.auto.PumpInformation;


public interface ManualPumpInformationMapper {
	public List<PumpInformation> selectListWithPageByFilter(@Param("filters") PumpInformationFilters filters, @Param("currentPage") int currentPage, @Param("pageSize") int pageSize);
	public Long selectCountWithPageByFilter(@Param("filters") PumpInformationFilters filters);
}
