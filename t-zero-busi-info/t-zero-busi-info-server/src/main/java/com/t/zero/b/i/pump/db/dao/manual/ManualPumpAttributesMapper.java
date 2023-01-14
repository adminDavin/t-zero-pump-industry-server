package com.t.zero.b.i.pump.db.dao.manual;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.t.zero.b.i.pump.db.dao.filters.PumpAttributesFilters;
import com.t.zero.b.i.pump.db.model.auto.PumpAttributes;


@Mapper
public interface ManualPumpAttributesMapper {
	
	public List<PumpAttributes> selectListWithPageByFilter(@Param("filters") PumpAttributesFilters filters, @Param("currentPage") int currentPage, @Param("pageSize") int pageSize);
	public Long selectCountWithPageByFilter(@Param("filters") PumpAttributesFilters filters);


}