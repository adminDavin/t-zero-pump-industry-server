package com.t.zero.b.i.pump.service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.dubbo.common.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.b.i.pump.db.dao.auto.PumpInteractiveFieldConfigMapper;
import com.t.zero.b.i.pump.db.model.auto.PumpInteractiveFieldConfigExample;
import com.t.zero.b.i.pump.db.model.manul.PumpInteractiveFieldConfigVo;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.utils.UUIDUtils;

@Service
public class PumpInteractiveFieldConfigService {
	@Autowired
	public ObjectMapper mapper;

	@Autowired
	public PumpInteractiveFieldConfigMapper pumpInteractiveFieldConfigMapper;

	public List<PumpInteractiveFieldConfigVo> list(CommonParams params, ObjectNode content) {
		var e = new PumpInteractiveFieldConfigExample();
		e.createCriteria().andPumpSourceEqualTo(content.get("pumpSource").asText());
		var data = pumpInteractiveFieldConfigMapper.selectByExampleWithBLOBs(e);
		return data.stream().map(j -> PumpInteractiveFieldConfigVo.convert(mapper, j)).collect(Collectors.toList());
	}
	

	public Object createOrModify(CommonParams params, ObjectNode content) {
		var t = mapper.convertValue(content, PumpInteractiveFieldConfigVo.class).convert();
		t.setUpdatedTime(LocalDateTime.now());
		t.setUpdatedUserId(params.getUserId());
		t.setDeletedFlag(TZeroConstants.NORMAL);

			var e = new PumpInteractiveFieldConfigExample();
			e.createCriteria().andInteractiveFieldEqualTo(t.getInteractiveField()).andPumpSourceEqualTo(t.getPumpSource());
			var items = pumpInteractiveFieldConfigMapper.selectByExample(e);
			if (CollectionUtils.isNotEmpty(items)) {
				t.setId(items.get(0).getId());
				pumpInteractiveFieldConfigMapper.updateByPrimaryKeySelective(t);
				return t.getId();
			} else {
				t.setCreatedUserId(params.getUserId());
				t.setPvCode(UUIDUtils.getUUID());
				t.setCreatedTime(LocalDateTime.now());
				pumpInteractiveFieldConfigMapper.insert(t);
				return t.getId();
			}
	}

	public Object delete(CommonParams params, ObjectNode content) {
		var ids = Arrays.asList(mapper.convertValue(content.get("ids"), Integer[].class));
		var e = new PumpInteractiveFieldConfigExample();
		e.createCriteria().andIdIn(ids);
		pumpInteractiveFieldConfigMapper.deleteByExample(e);
		var r = mapper.createObjectNode();
		r.put("action", "deletecontent");
		return r;
	}

}
