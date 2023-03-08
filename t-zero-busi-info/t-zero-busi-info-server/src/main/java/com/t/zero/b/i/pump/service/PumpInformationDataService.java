package com.t.zero.b.i.pump.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.b.i.pump.db.dao.auto.PumpInformationDataMapper;
import com.t.zero.b.i.pump.db.dao.filters.PumpInformationDataFilters;
import com.t.zero.b.i.pump.db.dao.manual.ManualPumpInformationDataMapper;
import com.t.zero.b.i.pump.db.model.auto.PumpInformationDataExample;
import com.t.zero.b.i.pump.db.model.manul.PumpInformationDataVo;
import com.t.zero.b.i.pump.helper.PumpInformationHelper;
import com.t.zero.b.i.pump.utils.CommonUtils;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.page.Page;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.utils.UUIDUtils;
import com.t.zero.basic.common.exception.TZeroException;

@Service
public class PumpInformationDataService {
	@Autowired
	public ObjectMapper mapper;

	@Autowired
	public PumpInformationDataMapper pumpInformationDataMapper;
	
	@Autowired
	public ManualPumpInformationDataMapper manualPumpInformationDataMapper;
	
	@Autowired
	private PumpInformationHelper pumpInformationHelper;

	public Page<PumpInformationDataVo> list(CommonParams params, ObjectNode content) {
		Page<PumpInformationDataVo> page = Page.build(CommonUtils.getCurrentPage(content), CommonUtils.getPageSize(content));
		var i = mapper.convertValue(content, PumpInformationDataFilters.class);
		var data = manualPumpInformationDataMapper.selectListWithPageByFilter(i, page.getOffset(), page.getPageSize());
		page.setList(data.stream().map(j -> PumpInformationDataVo.convert(mapper, j)).collect(Collectors.toList()));
		page.setTotalCount(manualPumpInformationDataMapper.selectCountWithPageByFilter(i));
		return page;
	}
	

	public Object get(CommonParams build, ObjectNode content) {
		return PumpInformationDataVo.convert(mapper, pumpInformationDataMapper.selectByPrimaryKey(content.get("id").asInt()));
	}
	
	
	public Object createOrModify(CommonParams params, ObjectNode content) {
		var t = mapper.convertValue(content, PumpInformationDataVo.class).convert();
		var p = pumpInformationHelper.getPumpInformationByBusi(t);
		if (ObjectUtils.isEmpty(p.getId())) {
			throw new TZeroException("can't find pump_information record, insert failed");
		}
		t.setPumpInformationId(p.getId());
		t.setUpdatedTime(LocalDateTime.now());
		t.setUpdatedUserId(params.getUserId());
		t.setDeletedFlag(TZeroConstants.NORMAL);

		if (ObjectUtils.isNotEmpty(t.getId())) {
			var temp = pumpInformationDataMapper.selectByPrimaryKey(t.getId());
			if (ObjectUtils.isNotEmpty(temp)) {
				t.setId(temp.getId());
			}
			pumpInformationDataMapper.updateByPrimaryKeySelective(t);
			return t.getId();
		} else {
			t.setCreatedUserId(params.getUserId());
			t.setPvCode(UUIDUtils .getUUID());
			t.setCreatedTime(LocalDateTime.now());
			pumpInformationDataMapper.insert(t);
			return t.getId();
		}
	}

	public Object delete(CommonParams params, ObjectNode content) {
		var ids = Arrays.asList(mapper.convertValue(content.get("ids"), Integer[].class));
		var e = new PumpInformationDataExample();
		e.createCriteria().andIdIn(ids);
		pumpInformationDataMapper.deleteByExample(e);
		var r = mapper.createObjectNode();
		r.put("action", "deletecontent");
		return r;
	}

}
