package com.t.zero.b.i.pump.service;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.common.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.b.i.pump.db.dao.auto.BusiPumpInfoMapper;
import com.t.zero.b.i.pump.db.dao.filters.PumpInformationFilters;
import com.t.zero.b.i.pump.db.dao.manual.ManualPumpInformationMapper;
import com.t.zero.b.i.pump.db.model.auto.BusiPumpInfo;
import com.t.zero.b.i.pump.db.model.auto.BusiPumpInfoExample;
import com.t.zero.b.i.pump.db.model.manul.BusiPumpInfoVo;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.utils.UUIDUtils;
import com.t.zero.basic.common.exception.TZeroException;

@Service
public class BusiPumpInfoService {
	@Autowired
	public ObjectMapper mapper;

	@Autowired
	public BusiPumpInfoMapper busiPumpInfoMapper;
	
	@Autowired
	public ManualPumpInformationMapper manualPumpInformationMapper;

	public Object createOrModify(CommonParams params, ObjectNode content) {
		var pumpSource = content.get("pumpSource").asText();
		var groupCode = content.get("groupCode").asText();
		if (StringUtils.isEmpty(pumpSource)) {
			throw new TZeroException("pumpSource can not be null");
		}
		var te = new PumpInformationFilters();
		te.setPumpSource(pumpSource);
		var pumps = manualPumpInformationMapper.selectDistinctPumpNameByPumpSource(te);
		
		if (CollectionUtils.isNotEmpty(pumps)) {
			var e = new BusiPumpInfoExample();
			e.createCriteria().andPumpSourceEqualTo(pumpSource);
			busiPumpInfoMapper.deleteByExample(e);
		}
		
		for (var i: pumps) {
			var t = new BusiPumpInfo();
			t.setCreatedUserId(params.getUserId());
			t.setPvCode(UUIDUtils.getUUID());
			t.setCreatedTime(LocalDateTime.now());
			t.setUpdatedTime(LocalDateTime.now());
			t.setUpdatedUserId(params.getUserId());
			t.setDeletedFlag(TZeroConstants.NORMAL);
			t.setGroupCode(groupCode);
			t.setPumpName(i);
			t.setPvDesc(mapper.createObjectNode().toString());
			t.setPumpSource(pumpSource);
			t.setPumpStatus(TZeroConstants.ZERO);
			busiPumpInfoMapper.insert(t);
		}

		
		return pumps.size();
	}
	

	public Object get(CommonParams params, ObjectNode content) {
		var pumpSource = content.get("pumpSource").asText();
		if (StringUtils.isEmpty(pumpSource)) {
			throw new TZeroException("pumpSource can not be null");
		}
		var e = new BusiPumpInfoExample();
		e.createCriteria().andPumpSourceEqualTo(pumpSource);
		return busiPumpInfoMapper.selectByExampleWithBLOBs(e).stream().map(i -> BusiPumpInfoVo.convert(mapper, i)).collect(Collectors.toList());
	}



}
