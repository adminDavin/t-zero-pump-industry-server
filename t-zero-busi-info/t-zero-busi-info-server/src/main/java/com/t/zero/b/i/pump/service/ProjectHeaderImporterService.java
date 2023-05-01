package com.t.zero.b.i.pump.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.b.i.pump.db.dao.auto.ProjectHeaderMapper;
import com.t.zero.b.i.pump.db.dao.auto.ProjectInfoMapper;
import com.t.zero.b.i.pump.db.dao.auto.UnitsMapper;
import com.t.zero.b.i.pump.db.model.auto.ProjectHeader;
import com.t.zero.b.i.pump.db.model.auto.Units;
import com.t.zero.b.i.pump.db.model.manul.ProjectInfoVo;
import com.t.zero.b.i.pump.db.model.manul.PumpParamsDefinitionVo;
import com.t.zero.b.i.pump.helper.ProjectInfoHelper;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.request.CommonParams;

@Service
public class ProjectHeaderImporterService {

	@Autowired
	public ObjectMapper mapper;

	@Autowired
	public ProjectHeaderMapper projectHeaderMapper;

	@Autowired
	private ProjectInfoHelper projectInfoHelper;

	@Autowired
	private ProjectInfoMapper projectInfoMapper;

	@Autowired
	public UnitsMapper unitsMapper;

	public Object doImportProject(CommonParams params, ObjectNode content) {
		var pumpSource = content.get("pumpSource").asText();
		var pvLanguage = content.get("pvLanguage").asText();
		var groupId = content.get("groupId").asInt();

		var pumpParamDef = projectInfoHelper.listByLanguage(pumpSource, pvLanguage);
		var projectInfoId = saveProjectInfo(params, groupId, content.get("projectInfo"));
		saveUnits(params, pumpParamDef, projectInfoId, content.get("paramDefUnit"));
		if (content.has("pumpParams")) {
			savePumpParams(params, pumpParamDef, projectInfoId, content.get("pumpParams"));
		}
		return projectInfoId;
	}

	private Integer saveProjectInfo(CommonParams params, Integer groupId, JsonNode content) {
		var t = mapper.convertValue(content, ProjectHeader.class);
		t.setGroupId(groupId);
		t.setUpdatedTime(LocalDateTime.now());
		t.setTenantId(params.getTenantId());
		t.setDeletedFlag(TZeroConstants.NORMAL);
		t.setUserId(params.getUserId());
		if (StringUtils.isBlank(t.getBudgetnumber())) {
			t.setBudgetnumber(DateTimeFormatter.BASIC_ISO_DATE.format(LocalDateTime.now()));
		}
		t.setCreatedTime(LocalDateTime.now());
		projectHeaderMapper.insert(t);
		t.setBudgetnumber(t.getBudgetnumber() + "_" + String.valueOf(t.getId()));
		projectHeaderMapper.updateByPrimaryKeySelective(t);
		return t.getId();
	}

	private void saveUnits(CommonParams params, List<PumpParamsDefinitionVo> pumpParamDef, Integer projectInfoId,
			JsonNode content) {
		var defalutUnits = pumpParamDef.stream().filter(i -> StringUtils.isNotBlank(i.getUnitKey()))
				.collect(Collectors.toMap(i -> i.getUnitKey(), i -> i));

		ObjectNode t = mapper.convertValue(content, ObjectNode.class);
		for (var i : defalutUnits.keySet()) {
			var u = defalutUnits.get(i);
			var tValue = getRealValue(u.getTemplatePosition(), t);
			var value = StringUtils.isNotBlank(tValue) ? tValue : u.getUnitValue();
			t.put(i, value);
		}
		t.put("projectnumber", String.valueOf(projectInfoId));
		var u = mapper.convertValue(t, Units.class);
		if (StringUtils.isBlank(u.getFrequency())) {
			u.setFrequency("50");
		}
		unitsMapper.insert(u);
	}

	private void savePumpParams(CommonParams params, List<PumpParamsDefinitionVo> pumpParamDef, Integer projectInfoId,
			JsonNode content) {
		var convertValue = mapper.convertValue(content, ArrayNode.class);
		var tempParamsDef = pumpParamDef.stream().filter(i -> StringUtils.isNotBlank(i.getTemplatePosition()))
				.collect(Collectors.toMap(i -> i.getTemplatePosition(), i -> i,
						(PumpParamsDefinitionVo a, PumpParamsDefinitionVo b) -> {
							return b;
						}));

		var temp = Arrays.asList(mapper.convertValue(convertValue, ObjectNode[].class));
		var tt = temp.stream().map(i -> {
			var t = getPumpParam(tempParamsDef, i);
			t.put("projectnumberId", projectInfoId);
			return t;
		}).collect(Collectors.toList());

		var i = 0;
		for (var item : tt) {
			i++;
			var ti = mapper.convertValue(item, ProjectInfoVo.class);
			var t = ti.convert();
			t.setPvDesc(ti.getPvJson().toString());
			t.setListNum(String.valueOf(i));
			t.setUpdatedTime(LocalDateTime.now());
			t.setDeletedFlag(TZeroConstants.NORMAL);
			projectInfoMapper.insert(t);
		}
	}

	private ObjectNode getPumpParam(Map<String, PumpParamsDefinitionVo> tempParamsDef, ObjectNode i) {
		var t = mapper.createObjectNode();
		var pvJson = mapper.createObjectNode();
		for (var tk : tempParamsDef.keySet()) {
			var def = tempParamsDef.get(tk);
			var realValue = i.has(tk) ? i.get(tk).asText() : "";
			
			if (PumpParamsDefinitionService.FIELD_TYPE_CUSTOM.equals(def.getFieldType())) {
				pvJson.put(tk, realValue);
				continue;
			}
			if ("hBack".equals(def.getPvKey())) {
				t.put("h", realValue);
			} else if ("qBack".equals(def.getPvKey())) {
				var tte = realValue.split("/");
				if (tte.length == 1) {
					t.put("q", tte[0]);
				} else if (tte.length == 2) {
					t.put("qnormal", tte[0]);
					t.put("q", tte[1]);
				} else {
					t.put("qmin", tte[0]);
					t.put("qnormal", tte[1]);
					t.put("q", tte[2]);
				}
			} else if ("showSeries".equals(def.getPvKey())) {
				t.put("series", realValue);
			} else if ("selected".equals(def.getPvKey())) {
				t.put("selected", StringUtils.isBlank(realValue) ? "0" : realValue);
			} else if ("moment".equals(def.getPvKey())) {
				t.put("moment", StringUtils.isBlank(realValue) ? "2" : realValue);
			} else if ("weightBack".equals(def.getPvKey())) {
				t.put("weight", StringUtils.isBlank(realValue) ? "1" : realValue);
			} else {
				t.put(def.getPvKey(), realValue);
			}

		}
		t.set("pvJson", pvJson);
		return t;
	}

	private String getRealValue(String templatePosition, ObjectNode data) {
		if (StringUtils.isNotBlank(templatePosition)) {
			return data.has(templatePosition) ? data.get(templatePosition).asText() : StringUtils.EMPTY;
		}
		return StringUtils.EMPTY;
	}
}
