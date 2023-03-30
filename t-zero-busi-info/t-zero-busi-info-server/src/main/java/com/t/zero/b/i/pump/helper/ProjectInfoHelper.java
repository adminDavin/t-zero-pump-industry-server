package com.t.zero.b.i.pump.helper;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.dubbo.common.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.b.i.pump.db.dao.auto.PumpParamsDefinitionMapper;
import com.t.zero.b.i.pump.db.dao.auto.UnitsMapper;
import com.t.zero.b.i.pump.db.model.auto.PumpParamsDefinitionExample;
import com.t.zero.b.i.pump.db.model.auto.UnitsExample;
import com.t.zero.b.i.pump.db.model.manul.PumpParamsDefinitionVo;

@Component
public class ProjectInfoHelper {

	@Autowired
	private ObjectMapper mapper;

	@Autowired
	private UnitsMapper unitsMapper;

	@Autowired
	private PumpParamsDefinitionMapper pumpParamsDefinitionMapper;

	public List<PumpParamsDefinitionVo> listByLanguage(String pumpSource, String pvLanguage) {
		var e = new PumpParamsDefinitionExample();
		e.createCriteria().andPumpSourceEqualTo(pumpSource).andPvLanguageEqualTo(pvLanguage);
		var data = pumpParamsDefinitionMapper.selectByExampleWithBLOBs(e);

		return data.stream().map(j -> PumpParamsDefinitionVo.convert(mapper, j))
				.sorted(Comparator.comparing(PumpParamsDefinitionVo::getPvOrder)).collect(Collectors.toList());
	}

	public ObjectNode listUnits(String projectnumber) {
		var selectExample = new UnitsExample();
		selectExample.createCriteria().andProjectnumberEqualTo(projectnumber);
		var chek = unitsMapper.selectByExample(selectExample);
		if (CollectionUtils.isEmpty(chek)) {
			return mapper.createObjectNode();
		} else {
			return mapper.convertValue(chek.get(0), ObjectNode.class);
		}
	}

	public ObjectNode getPumpParamDef(String pumpSource, String pvLanguage, String projectnumber) {
		var t = listByLanguage(pumpSource, pvLanguage);
		var re = mapper.createObjectNode();
		re.set("pumpParamsDef", mapper.convertValue(t, ArrayNode.class));
		re.set("pumpUnit", listUnits(projectnumber));
		return re;
	}

}
