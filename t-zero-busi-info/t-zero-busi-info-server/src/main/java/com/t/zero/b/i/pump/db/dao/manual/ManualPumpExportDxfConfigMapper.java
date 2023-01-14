package com.t.zero.b.i.pump.db.dao.manual;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.t.zero.b.i.pump.db.dao.filters.PumpExportDxfConfigFilters;
import com.t.zero.b.i.pump.db.model.auto.PumpExportDxfConfig;


@Mapper
public interface ManualPumpExportDxfConfigMapper {
	
	public List<PumpExportDxfConfig> selectListWithPageByFilter(@Param("filters") PumpExportDxfConfigFilters filters, @Param("currentPage") int currentPage, @Param("pageSize") int pageSize);
	public Long selectCountWithPageByFilter(@Param("filters") PumpExportDxfConfigFilters filters);


}