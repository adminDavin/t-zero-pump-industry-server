package com.t.zero.b.i.pump.service;

import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.dubbo.common.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.b.i.pump.db.dao.auto.ProjectHeaderMapper;
import com.t.zero.b.i.pump.db.dao.auto.ProjectInfoMapper;
import com.t.zero.b.i.pump.db.dao.auto.ProjectRemarkMapper;
import com.t.zero.b.i.pump.db.dao.auto.UnitsMapper;
import com.t.zero.b.i.pump.db.dao.filters.ProjectHeaderFilters;
import com.t.zero.b.i.pump.db.dao.manual.ManualProjectHeaderMapper;
import com.t.zero.b.i.pump.db.model.auto.ProjectHeader;
import com.t.zero.b.i.pump.db.model.auto.ProjectInfoExample;
import com.t.zero.b.i.pump.db.model.auto.ProjectRemark;
import com.t.zero.b.i.pump.db.model.auto.ProjectRemarkExample;
import com.t.zero.b.i.pump.db.model.auto.UnitsExample;
import com.t.zero.b.i.pump.utils.CommonUtils;
import com.t.zero.b.i.pump.utils.ExcelParser;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.page.Page;
import com.t.zero.basic.common.base.request.CommonParams;

@Service
public class ProjectHeaderService {
	@Autowired
	public ObjectMapper mapper;

	@Autowired
	public ProjectHeaderMapper projectHeaderMapper;

	@Autowired
	public ProjectInfoMapper projectInfoMapper;

	@Autowired
	public ManualProjectHeaderMapper manualProjectHeaderMapper;

	@Autowired
	private ExcelParser excelParser;

	@Autowired
	private ProjectRemarkMapper projectRemarkMapper;

	@Autowired
	public UnitsMapper unitsMapper;

	public Object list(CommonParams params, ObjectNode content) {
		Page<ProjectHeader> page = Page.build(CommonUtils.getCurrentPage(content), CommonUtils.getPageSize(content));
		var b = ProjectHeaderFilters.builder();
		b.userId(params.getUserId());
		b.tenantId(params.getTenantId());
		b.groupId(content.has("groupId") ? content.get("groupId").asInt() : null);

		if (content.has("showAll")) {
			b.userId(content.has("userId") ? content.get("userId").asText() : "0");
		}
		var i = b.build();
		page.setList(manualProjectHeaderMapper.selectListWithPageByFilter(i, page.getOffset(), page.getPageSize()));
		page.setTotalCount(manualProjectHeaderMapper.selectCountWithPageByFilter(i));
		return page;
	}

	public Object createOrModify(CommonParams params, ObjectNode content) {
		var t = mapper.convertValue(content, ProjectHeader.class);
		t.setUpdatedTime(LocalDateTime.now());
		t.setTenantId(params.getTenantId());
		t.setDeletedFlag(TZeroConstants.NORMAL);
		t.setUserId(params.getUserId());

		if (ObjectUtils.isNotEmpty(t.getId())) {
			var temp = projectHeaderMapper.selectByPrimaryKey(t.getId());
			if (ObjectUtils.isNotEmpty(temp)) {
				t.setId(temp.getId());
			}
			projectHeaderMapper.updateByPrimaryKeySelective(t);
			return t.getId();
		} else {
			t.setCreatedTime(LocalDateTime.now());
			t.setBudgetnumber(String.valueOf(t.getGroupId()));
			projectHeaderMapper.insert(t);
			t.setBudgetnumber(String.valueOf(t.getGroupId()) + "_" + String.valueOf(t.getId()));
			projectHeaderMapper.updateByPrimaryKeySelective(t);
			return t.getId();
		}
	}

	public Object delete(CommonParams params, ObjectNode content) {
		var id = content.get("id").asInt();
		deleteProjectUnit(params, id);
		deleteProjectInfo(params, id);
		projectHeaderMapper.deleteByPrimaryKey(id);
		var r = mapper.createObjectNode();
		r.put("action", "deletecontent");
		return r;
	}

	public Object deleteRemarks(CommonParams params, Integer projectId) {
		var example = new ProjectRemarkExample();
		example.createCriteria().andProjectHeaderIdEqualTo(projectId);
		projectRemarkMapper.deleteByExample(example);
		var r = mapper.createObjectNode();
		r.put("action", "deletecontent");
		return r;
	}

	public Object deleteProjectUnit(CommonParams params, Integer projectId) {
		var example = new UnitsExample();
		example.createCriteria().andProjectnumberEqualTo(String.valueOf(projectId));
		unitsMapper.deleteByExample(example);
		var r = mapper.createObjectNode();
		r.put("action", "deletecontent");
		return r;
	}

	public Object deleteProjectInfo(CommonParams params, Integer projectId) {
		var example = new ProjectInfoExample();
		example.createCriteria().andProjectnumberIdEqualTo(projectId);
		projectInfoMapper.deleteByExample(example);
		var r = mapper.createObjectNode();
		r.put("action", "deletecontent");
		return r;
	}

	public Object upload(CommonParams build, MultipartFile file) throws IOException {
		var data = excelParser.parseExcel(file);

		return data;
	}

	public Object addRemarks(CommonParams build, ObjectNode content) {
		var example = new ProjectRemarkExample();
		example.createCriteria().andProjectHeaderIdEqualTo(content.get("projectId").asInt());
		var t = projectRemarkMapper.selectByExample(example);
		var s = new ProjectRemark();
		s.setProjectHeaderId(content.get("projectId").asInt());
		s.setRemarkContent(content.get("remarks").toString());
		if (CollectionUtils.isEmpty(t)) {
			projectRemarkMapper.insert(s);
		} else {
			s.setId(t.get(0).getId());
			projectRemarkMapper.insertSelective(s);
		}
		return s.getId();
	}

	public Object listRemarks(CommonParams build, ObjectNode content)
			throws JsonMappingException, JsonProcessingException {
		var example = new ProjectRemarkExample();
		example.createCriteria().andProjectHeaderIdEqualTo(content.get("projectId").asInt());
		var t = projectRemarkMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(t)) {
			return mapper.createArrayNode();
		} else {
			return mapper.readTree(t.get(0).getRemarkContent());
		}
	}

}
