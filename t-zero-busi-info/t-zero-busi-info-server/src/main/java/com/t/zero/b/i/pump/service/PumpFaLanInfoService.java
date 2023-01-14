package com.t.zero.b.i.pump.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.b.i.pump.db.dao.auto.PumpFaLanInfoMapper;
import com.t.zero.b.i.pump.db.dao.filters.PumpFaLanInfoFilters;
import com.t.zero.b.i.pump.db.dao.manual.ManualPumpFaLanInfoMapper;
import com.t.zero.b.i.pump.db.model.auto.PumpFaLanInfoExample;
import com.t.zero.b.i.pump.db.model.manul.PumpFaLanInfoVo;
import com.t.zero.b.i.pump.utils.CommonUtils;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.page.Page;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.utils.UUIDUtils;

@Service
public class PumpFaLanInfoService {
	@Autowired
	public ObjectMapper mapper;

	@Autowired
	public PumpFaLanInfoMapper pumpFaLanInfoMapper;
	
	@Autowired
	public ManualPumpFaLanInfoMapper manualPumpFaLanInfoMapper;

	public Page<PumpFaLanInfoVo> list(CommonParams params, ObjectNode content) {
		Page<PumpFaLanInfoVo> page = Page.build(CommonUtils.getCurrentPage(content), CommonUtils.getPageSize(content));
		var i = mapper.convertValue(content, PumpFaLanInfoFilters.class);
		var data = manualPumpFaLanInfoMapper.selectListWithPageByFilter(i, page.getOffset(), page.getPageSize());
		page.setList(data.stream().map(j -> PumpFaLanInfoVo.convert(mapper, j)).collect(Collectors.toList()));
		page.setTotalCount(manualPumpFaLanInfoMapper.selectCountWithPageByFilter(i));
		return page;
	}
	
	public Object createOrModify(CommonParams params, ObjectNode content) {
		var t = mapper.convertValue(content, PumpFaLanInfoVo.class).convert();
		t.setUpdatedTime(LocalDateTime.now());
		t.setUpdatedUserId(params.getUserId());
		t.setDeletedFlag(TZeroConstants.NORMAL);

		if (ObjectUtils.isNotEmpty(t.getId())) {
			var temp = pumpFaLanInfoMapper.selectByPrimaryKey(t.getId());
			if (ObjectUtils.isNotEmpty(temp)) {
				t.setId(temp.getId());
			}
			pumpFaLanInfoMapper.updateByPrimaryKeySelective(t);
			return t.getId();
		} else {
			t.setCreatedUserId(params.getUserId());
			t.setPvCode(UUIDUtils.getUUID());
			t.setCreatedTime(LocalDateTime.now());
			pumpFaLanInfoMapper.insert(t);
			return t.getId();
		}
	}

	public Object delete(CommonParams params, ObjectNode content) {
		var ids = Arrays.asList(mapper.convertValue(content.get("ids"), Integer[].class));
		var e = new PumpFaLanInfoExample();
		e.createCriteria().andIdIn(ids);
		pumpFaLanInfoMapper.deleteByExample(e);
		var r = mapper.createObjectNode();
		r.put("action", "deletecontent");
		return r;
	}
}
