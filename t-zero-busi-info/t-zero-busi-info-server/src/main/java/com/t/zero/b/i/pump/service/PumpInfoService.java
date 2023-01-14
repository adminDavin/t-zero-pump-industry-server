package com.t.zero.b.i.pump.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.b.i.pump.db.dao.auto.PumpInfoMapper;
import com.t.zero.b.i.pump.db.dao.filters.PumpInfoFilters;
import com.t.zero.b.i.pump.db.dao.manual.ManualPumpInfoMapper;
import com.t.zero.b.i.pump.db.model.auto.PumpInfoExample;
import com.t.zero.b.i.pump.db.model.manul.PumpInfoVo;
import com.t.zero.b.i.pump.utils.CommonUtils;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.page.Page;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.utils.UUIDUtils;

@Service
public class PumpInfoService {
	@Autowired
	public ObjectMapper mapper;

	@Autowired
	public PumpInfoMapper pumpInfoMapper;
	
	@Autowired
	public ManualPumpInfoMapper manualPumpInfoMapper;

	public Page<PumpInfoVo> list(CommonParams params, ObjectNode content) {
		Page<PumpInfoVo> page = Page.build(CommonUtils.getCurrentPage(content), CommonUtils.getPageSize(content));
		var i = mapper.convertValue(content, PumpInfoFilters.class);
		var data = manualPumpInfoMapper.selectListWithPageByFilter(i, page.getOffset(), page.getPageSize());
		page.setList(data.stream().map(j -> PumpInfoVo.convert(mapper, j)).collect(Collectors.toList()));
		page.setTotalCount(manualPumpInfoMapper.selectCountWithPageByFilter(i));
		return page;
	}
	
	public Object createOrModify(CommonParams params, ObjectNode content) {
		var t = mapper.convertValue(content, PumpInfoVo.class).convert();
		t.setUpdatedTime(LocalDateTime.now());
		t.setUpdatedUserId(params.getUserId());
		t.setDeletedFlag(TZeroConstants.NORMAL);

		if (ObjectUtils.isNotEmpty(t.getId())) {
			var temp = pumpInfoMapper.selectByPrimaryKey(t.getId());
			if (ObjectUtils.isNotEmpty(temp)) {
				t.setId(temp.getId());
			}
			pumpInfoMapper.updateByPrimaryKeySelective(t);
			return t.getId();
		} else {
			t.setCreatedUserId(params.getUserId());
			t.setPvCode(UUIDUtils.getUUID());
			t.setCreatedTime(LocalDateTime.now());
			pumpInfoMapper.insert(t);
			return t.getId();
		}
	}

	public Object delete(CommonParams params, ObjectNode content) {
		var ids = Arrays.asList(mapper.convertValue(content.get("ids"), Integer[].class));
		var e = new PumpInfoExample();
		e.createCriteria().andIdIn(ids);
		pumpInfoMapper.deleteByExample(e);
		var r = mapper.createObjectNode();
		r.put("action", "deletecontent");
		return r;
	}
	
}
