package com.t.zero.b.i.pump.db.dao.manual;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.t.zero.b.i.pump.db.dao.filters.PumpMaterialInfoFilters;
import com.t.zero.b.i.pump.db.model.auto.PumpMaterialInfo;

@Mapper
public interface ManualPumpMaterialInfoMapper {

	public List<PumpMaterialInfo> selectListWithPageByFilter(@Param("filters") PumpMaterialInfoFilters filters,
			@Param("currentPage") int currentPage, @Param("pageSize") int pageSize);

	public Long selectCountWithPageByFilter(@Param("filters") PumpMaterialInfoFilters filters);

}
