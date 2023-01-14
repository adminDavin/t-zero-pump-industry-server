package com.t.zero.b.i.pump.db.dao.manual;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.t.zero.b.i.pump.db.dao.filters.PumpExportDxfTemplateFilters;
import com.t.zero.b.i.pump.db.model.auto.PumpExportDxfTemplate;


@Mapper
public interface ManualPumpExportDxfTemplateMapper {
	
	public List<PumpExportDxfTemplate> selectListWithPageByFilter(@Param("filters") PumpExportDxfTemplateFilters filters, @Param("currentPage") int currentPage, @Param("pageSize") int pageSize);
	public Long selectCountWithPageByFilter(@Param("filters") PumpExportDxfTemplateFilters filters);


}