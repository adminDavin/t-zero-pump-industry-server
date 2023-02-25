package com.t.zero.b.i.pump.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.b.i.pump.db.dao.auto.PumpInformationMapper;
import com.t.zero.b.i.pump.db.dao.filters.PumpInformationFilters;
import com.t.zero.b.i.pump.db.dao.manual.ManualPumpInformationMapper;
import com.t.zero.b.i.pump.db.model.auto.PumpInformationExample;
import com.t.zero.b.i.pump.db.model.manul.PumpInformationVo;
import com.t.zero.b.i.pump.utils.CommonUtils;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.page.Page;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.utils.UUIDUtils;

@Service
public class PumpInformationService {
	@Autowired
	public ObjectMapper mapper;

	@Autowired
	public PumpInformationMapper pumpInformationMapper;
	
	@Autowired
	public ManualPumpInformationMapper manualPumpInformationMapper;

	public Page<PumpInformationVo> list(CommonParams params, ObjectNode content) {
		Page<PumpInformationVo> page = Page.build(CommonUtils.getCurrentPage(content), CommonUtils.getPageSize(content));
		var i = mapper.convertValue(content, PumpInformationFilters.class);
		var data = manualPumpInformationMapper.selectListWithPageByFilter(i, page.getOffset(), page.getPageSize());
		page.setList(data.stream().map(j -> PumpInformationVo.convert(mapper, j)).collect(Collectors.toList()));
		page.setTotalCount(manualPumpInformationMapper.selectCountWithPageByFilter(i));
		return page;
	}
	

	public Object get(CommonParams build, ObjectNode content) {
		return PumpInformationVo.convert(mapper, pumpInformationMapper.selectByPrimaryKey(content.get("id").asInt()));
	}
	
	
	public Object createOrModify(CommonParams params, ObjectNode content) {
		var t = mapper.convertValue(content, PumpInformationVo.class).convert();
		t.setUpdatedTime(LocalDateTime.now());
		t.setUpdatedUserId(params.getUserId());
		t.setDeletedFlag(TZeroConstants.NORMAL);

		if (ObjectUtils.isNotEmpty(t.getId())) {
			var temp = pumpInformationMapper.selectByPrimaryKey(t.getId());
			if (ObjectUtils.isNotEmpty(temp)) {
				t.setId(temp.getId());
			}
			pumpInformationMapper.updateByPrimaryKeySelective(t);
			return t.getId();
		} else {
			t.setCreatedUserId(params.getUserId());
			t.setPvCode(UUIDUtils.getUUID());
			t.setCreatedTime(LocalDateTime.now());
			pumpInformationMapper.insert(t);
			return t.getId();
		}
	}

	public Object delete(CommonParams params, ObjectNode content) {
		var ids = Arrays.asList(mapper.convertValue(content.get("ids"), Integer[].class));
		var e = new PumpInformationExample();
		e.createCriteria().andIdIn(ids);
		pumpInformationMapper.deleteByExample(e);
		var r = mapper.createObjectNode();
		r.put("action", "deletecontent");
		return r;
	}

}
