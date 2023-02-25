package com.t.zero.b.i.pump.service;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.common.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.b.i.pump.db.dao.auto.BusiGroupInfoMapper;
import com.t.zero.b.i.pump.db.model.auto.BusiGroupInfoExample;
import com.t.zero.b.i.pump.db.model.manul.BusiGroupInfoVo;
import com.t.zero.basic.common.base.contants.TZeroConstants;
import com.t.zero.basic.common.base.request.CommonParams;
import com.t.zero.basic.common.base.utils.UUIDUtils;
import com.t.zero.basic.common.exception.TZeroException;

@Service
public class BusiGroupInfoService {
	@Autowired
	public ObjectMapper mapper;

	@Autowired
	public BusiGroupInfoMapper busiGroupInfoMapper;

	public Object createOrModify(CommonParams params, ObjectNode content) {
		var t = mapper.convertValue(content, BusiGroupInfoVo.class).convert();
		t.setUpdatedTime(LocalDateTime.now());
		t.setUpdatedUserId(params.getUserId());
		t.setDeletedFlag(TZeroConstants.NORMAL);

		if (StringUtils.isEmpty(t.getMajorKey())) {
			throw new TZeroException("majorKey can not be null");
		}
		var e = new BusiGroupInfoExample();
		e.createCriteria().andMajorKeyEqualTo(t.getMajorKey()).andPumpSourceEqualTo(t.getPumpSource());
		var list = busiGroupInfoMapper.selectByExample(e);
		if (CollectionUtils.isNotEmpty(list)) {
			t.setId(list.get(0).getId());
			busiGroupInfoMapper.updateByPrimaryKeySelective(t);
		} else {
			t.setCreatedUserId(params.getUserId());
			t.setPvCode(UUIDUtils.getUUID());
			t.setCreatedTime(LocalDateTime.now());
			busiGroupInfoMapper.insert(t);
		}
		return t.getId();
	}
	
	public Object get(String majorKey, String pumpSource) {
		var e = new BusiGroupInfoExample();
		e.createCriteria().andMajorKeyEqualTo(majorKey).andPumpSourceEqualTo(pumpSource);
		var list = busiGroupInfoMapper.selectByExample(e);
		return CollectionUtils.isNotEmpty(list) ? BusiGroupInfoVo.convert(mapper, list.get(0)): BusiGroupInfoVo.build(mapper);
	}

	public Object delete(CommonParams params, ObjectNode content) {
		var ids = Arrays.asList(mapper.convertValue(content.get("ids"), Integer[].class));
		var e = new BusiGroupInfoExample();
		e.createCriteria().andIdIn(ids);
		busiGroupInfoMapper.deleteByExample(e);
		var r = mapper.createObjectNode();
		r.put("action", "deletecontent");
		return r;
	}

}
