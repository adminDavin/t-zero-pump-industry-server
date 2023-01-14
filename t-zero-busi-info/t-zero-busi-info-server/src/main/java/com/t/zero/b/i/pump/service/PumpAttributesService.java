package com.t.zero.b.i.pump.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.b.i.pump.db.dao.auto.PumpAttributesMapper;
import com.t.zero.b.i.pump.db.dao.filters.PumpAttributesFilters;
import com.t.zero.b.i.pump.db.dao.manual.ManualPumpAttributesMapper;
import com.t.zero.b.i.pump.db.model.auto.PumpAttributesExample;
import com.t.zero.b.i.pump.db.model.manul.PumpAttributesVo;
import com.t.zero.b.i.pump.utils.CommonUtils;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.page.Page;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.utils.UUIDUtils;

@Service
public class PumpAttributesService {
	@Autowired
	public ObjectMapper mapper;

	@Autowired
	public PumpAttributesMapper pumpAttributesMapper;
	
	@Autowired
	public ManualPumpAttributesMapper manualPumpAttributesMapper;

	public Page<PumpAttributesVo> list(CommonParams params, ObjectNode content) {
		Page<PumpAttributesVo> page = Page.build(CommonUtils.getCurrentPage(content), CommonUtils.getPageSize(content));
		var i = mapper.convertValue(content, PumpAttributesFilters.class);
		var data = manualPumpAttributesMapper.selectListWithPageByFilter(i, page.getOffset(), page.getPageSize());
		page.setList(data.stream().map(j -> PumpAttributesVo.convert(mapper, j)).collect(Collectors.toList()));
		page.setTotalCount(manualPumpAttributesMapper.selectCountWithPageByFilter(i));
		return page;
	}
	
	public Object createOrModify(CommonParams params, ObjectNode content) {
		var t = mapper.convertValue(content, PumpAttributesVo.class).convert();
		t.setUpdatedTime(LocalDateTime.now());
		t.setUpdatedUserId(params.getUserId());
		t.setDeletedFlag(TZeroConstants.NORMAL);

		if (ObjectUtils.isNotEmpty(t.getId())) {
			var temp = pumpAttributesMapper.selectByPrimaryKey(t.getId());
			if (ObjectUtils.isNotEmpty(temp)) {
				t.setId(temp.getId());
			}
			pumpAttributesMapper.updateByPrimaryKeySelective(t);
			return t.getId();
		} else {
			t.setCreatedUserId(params.getUserId());
			t.setPvCode(UUIDUtils.getUUID());
			t.setCreatedTime(LocalDateTime.now());
			pumpAttributesMapper.insert(t);
			return t.getId();
		}
	}

	public Object delete(CommonParams params, ObjectNode content) {
		var ids = Arrays.asList(mapper.convertValue(content.get("ids"), Integer[].class));
		var e = new PumpAttributesExample();
		e.createCriteria().andIdIn(ids);
		pumpAttributesMapper.deleteByExample(e);
		var r = mapper.createObjectNode();
		r.put("action", "deletecontent");
		return r;
	}
}
