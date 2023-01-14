package com.t.zero.b.i.pump.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.b.i.pump.db.dao.auto.PumpForcesAndMomentsMapper;
import com.t.zero.b.i.pump.db.dao.filters.PumpForcesAndMomentsFilters;
import com.t.zero.b.i.pump.db.dao.manual.ManualPumpForcesAndMomentsMapper;
import com.t.zero.b.i.pump.db.model.auto.PumpForcesAndMomentsExample;
import com.t.zero.b.i.pump.db.model.manul.PumpForcesAndMomentsVo;
import com.t.zero.b.i.pump.utils.CommonUtils;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.page.Page;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.utils.UUIDUtils;

@Service
public class PumpForcesAndMomentsService {
	@Autowired
	public ObjectMapper mapper;

	@Autowired
	public PumpForcesAndMomentsMapper pumpForcesAndMomentsMapper;
	
	@Autowired
	public ManualPumpForcesAndMomentsMapper manualPumpForcesAndMomentsMapper;

	public Page<PumpForcesAndMomentsVo> list(CommonParams params, ObjectNode content) {
		Page<PumpForcesAndMomentsVo> page = Page.build(CommonUtils.getCurrentPage(content), CommonUtils.getPageSize(content));
		var i = mapper.convertValue(content, PumpForcesAndMomentsFilters.class);
		var data = manualPumpForcesAndMomentsMapper.selectListWithPageByFilter(i, page.getOffset(), page.getPageSize());
		page.setList(data.stream().map(j -> PumpForcesAndMomentsVo.convert(mapper, j)).collect(Collectors.toList()));
		page.setTotalCount(manualPumpForcesAndMomentsMapper.selectCountWithPageByFilter(i));
		return page;
	}
	
	public Object createOrModify(CommonParams params, ObjectNode content) {
		var t = mapper.convertValue(content, PumpForcesAndMomentsVo.class).convert();
		t.setUpdatedTime(LocalDateTime.now());
		t.setUpdatedUserId(params.getUserId());
		t.setDeletedFlag(TZeroConstants.NORMAL);

		if (ObjectUtils.isNotEmpty(t.getId())) {
			var temp = pumpForcesAndMomentsMapper.selectByPrimaryKey(t.getId());
			if (ObjectUtils.isNotEmpty(temp)) {
				t.setId(temp.getId());
			}
			pumpForcesAndMomentsMapper.updateByPrimaryKeySelective(t);
			return t.getId();
		} else {
			t.setCreatedUserId(params.getUserId());
			t.setPvCode(UUIDUtils.getUUID());
			t.setCreatedTime(LocalDateTime.now());
			pumpForcesAndMomentsMapper.insert(t);
			return t.getId();
		}
	}

	public Object delete(CommonParams params, ObjectNode content) {
		var ids = Arrays.asList(mapper.convertValue(content.get("ids"), Integer[].class));
		var e = new PumpForcesAndMomentsExample();
		e.createCriteria().andIdIn(ids);
		pumpForcesAndMomentsMapper.deleteByExample(e);
		var r = mapper.createObjectNode();
		r.put("action", "deletecontent");
		return r;
	}
}
