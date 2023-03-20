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
import com.t.zero.b.i.pump.db.dao.auto.PumpParamsDefinitionMapper;
import com.t.zero.b.i.pump.db.model.auto.PumpParamsDefinitionExample;
import com.t.zero.b.i.pump.db.model.manul.PumpParamsDefinitionVo;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.utils.UUIDUtils;

@Service
public class PumpParamsDefinitionService {
	@Autowired
	public ObjectMapper mapper;

	@Autowired
	public PumpParamsDefinitionMapper pumpParamsDefinitionMapper;

	public List<PumpParamsDefinitionVo> list(CommonParams params, ObjectNode content) {
		var e = new PumpParamsDefinitionExample();
		e.createCriteria().andPumpSourceEqualTo(content.get("pumpSource").asText());
		var data = pumpParamsDefinitionMapper.selectByExampleWithBLOBs(e);
		return data.stream().map(j -> PumpParamsDefinitionVo.convert(mapper, j)).collect(Collectors.toList());
	}
	
	public List<PumpParamsDefinitionVo> listByLanguage(CommonParams params, ObjectNode content) {
		var e = new PumpParamsDefinitionExample();
		var pumpSource = content.get("pumpSource").asText();
		var pvLanguage = content.get("pvLanguage").asText();
		e.createCriteria().andPumpSourceEqualTo(pumpSource).andPvLanguageEqualTo(pvLanguage);
		var data = pumpParamsDefinitionMapper.selectByExampleWithBLOBs(e);
		return data.stream().map(j -> PumpParamsDefinitionVo.convert(mapper, j)).collect(Collectors.toList());
	}
	
	

	public Object createOrModify(CommonParams params, ObjectNode content) {
		var t = mapper.convertValue(content, PumpParamsDefinitionVo.class).convert();
		t.setUpdatedTime(LocalDateTime.now());
		t.setUpdatedUserId(params.getUserId());
		t.setDeletedFlag(TZeroConstants.NORMAL);

			var e = new PumpParamsDefinitionExample();
			e.createCriteria().andPvKeyEqualTo(t.getPvKey()).andPumpSourceEqualTo(t.getPumpSource())
					.andPvLanguageEqualTo(t.getPvLanguage());
			var items = pumpParamsDefinitionMapper.selectByExample(e);
			if (CollectionUtils.isNotEmpty(items)) {
				t.setId(items.get(0).getId());
				pumpParamsDefinitionMapper.updateByPrimaryKeySelective(t);
				return t.getId();
			} else {
				t.setCreatedUserId(params.getUserId());
				t.setPvCode(UUIDUtils.getUUID());
				t.setCreatedTime(LocalDateTime.now());
				pumpParamsDefinitionMapper.insert(t);
				return t.getId();
			}
	}

	public Object delete(CommonParams params, ObjectNode content) {
		var ids = Arrays.asList(mapper.convertValue(content.get("ids"), Integer[].class));
		var e = new PumpParamsDefinitionExample();
		e.createCriteria().andIdIn(ids);
		pumpParamsDefinitionMapper.deleteByExample(e);
		var r = mapper.createObjectNode();
		r.put("action", "deletecontent");
		return r;
	}

}
