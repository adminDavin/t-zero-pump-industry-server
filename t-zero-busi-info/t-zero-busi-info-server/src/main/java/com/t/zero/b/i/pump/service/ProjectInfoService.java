package com.t.zero.b.i.pump.service;

import java.time.LocalDateTime;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.common.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.b.i.pump.db.dao.auto.ProjectInfoMapper;
import com.t.zero.b.i.pump.db.dao.auto.UnitsMapper;
import com.t.zero.b.i.pump.db.model.auto.ProjectInfo;
import com.t.zero.b.i.pump.db.model.auto.ProjectInfoExample;
import com.t.zero.b.i.pump.db.model.auto.Units;
import com.t.zero.b.i.pump.db.model.auto.UnitsExample;
import com.t.zero.b.i.pump.helper.ProjectInfoHelper;
import com.t.zero.b.i.pump.helper.PumpArchitectureInfoHelper;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.request.CommonParams;

@Service
public class ProjectInfoService {
	
	@Autowired
    public ObjectMapper mapper;

	@Autowired
	public UnitsMapper unitsMapper;
	
	@Autowired
	public ProjectInfoMapper projectInfoMapper;
	
	@Autowired
	public PumpArchitectureInfoHelper pumpArchitectureInfoHelper;
	
	@Autowired
	public ProjectInfoHelper projectInfoHelper;
	

	public Object list(CommonParams params, ObjectNode content) {
		var example = new ProjectInfoExample();
		example.createCriteria().andProjectnumberIdEqualTo(content.get("projectnumber").asInt());
		return projectInfoMapper.selectByExample(example);
	}


	public Object createOrModify(CommonParams params, ObjectNode content) {
		var t = mapper.convertValue(content, ProjectInfo.class);
		t.setUpdatedTime(LocalDateTime.now());
		t.setDeletedFlag(TZeroConstants.NORMAL);
		if (ObjectUtils.isEmpty(t.getId())) {
			projectInfoMapper.insert(t);
			return t.getId();
		} else {
			var tt = projectInfoMapper.selectByPrimaryKey(t.getId());
			if (!StringUtils.equals(t.getLevelMoter(), tt.getLevelMoter())) {
				var pumpSource = content.get("pumpSource").asText();
				var modelMotor = pumpArchitectureInfoHelper.getModelMotor(t.getRotation(), t.getLevelMoter(), pumpSource);
				if (StringUtils.isNotBlank(modelMotor)) {
					t.setModelMotor(modelMotor);
					t.setExplosionProof(modelMotor);
				}
			}
			projectInfoMapper.updateByPrimaryKeySelective(t);
			return t.getId();
		}
	}


	public Object delete(CommonParams params, ObjectNode content) {
		var id = content.get("id").asInt();
		projectInfoMapper.deleteByPrimaryKey(id);
		var r = mapper.createObjectNode();
		r.put("action", "deletecontent");
		return r;
	}


	public Object updateUnits(CommonParams params, ObjectNode content) {
		var projectnumber = content.get("projectnumber").asText();
		var selectExample = new UnitsExample();
		selectExample.createCriteria().andProjectnumberEqualTo(projectnumber);
		var chek = unitsMapper.selectByExample(selectExample);
		var t = mapper.convertValue(content, Units.class);
		if (CollectionUtils.isEmpty(chek)) {
			return unitsMapper.insert(t);
		} else {
			t.setId(chek.get(0).getId());
			return unitsMapper.updateByPrimaryKeySelective(t);
		}
	}


	public Object listUnits(CommonParams params, ObjectNode content) {
		var projectnumber = content.get("projectnumber").asText();
		var selectExample = new UnitsExample();
		selectExample.createCriteria().andProjectnumberEqualTo(projectnumber);
		var chek = unitsMapper.selectByExample(selectExample);
		if (CollectionUtils.isEmpty(chek)) {
			return mapper.createObjectNode();
		} else {
			return chek.get(0);
		}
	}


	public Object getPumpParamDef(CommonParams build, ObjectNode content) {
		var pumpSource = content.get("pumpSource").asText();
		var pvLanguage = content.get("pvLanguage").asText();
		var projectnumber = content.get("projectnumber").asText();
		return projectInfoHelper.getPumpParamDef(pumpSource, pvLanguage, projectnumber);
	}

}
