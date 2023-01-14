package com.t.zero.b.i.pump.db.dao.manual;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.t.zero.b.i.pump.db.dao.filters.PumpForcesAndMomentsFilters;
import com.t.zero.b.i.pump.db.model.auto.PumpForcesAndMoments;


@Mapper
public interface ManualPumpForcesAndMomentsMapper {
	
	public List<PumpForcesAndMoments> selectListWithPageByFilter(@Param("filters") PumpForcesAndMomentsFilters filters, @Param("currentPage") int currentPage, @Param("pageSize") int pageSize);
	public Long selectCountWithPageByFilter(@Param("filters") PumpForcesAndMomentsFilters filters);


}