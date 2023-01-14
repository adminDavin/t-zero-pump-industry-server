package com.t.zero.b.i.pump.db.model.manul;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.b.i.pump.db.model.auto.PumpInfo;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PumpInfoVo extends PumpInfo {
	private static final long serialVersionUID = 1L;
	private ObjectNode pvJson;

	public PumpInfo convert() {
		var t = new PumpInfo();
		BeanUtils.copyProperties(this, t);
		t.setPvDesc(this.getPvJson().toString());
		return t;
	}

	public static PumpInfoVo convert(ObjectMapper mapper, PumpInfo item) {
		var t = new PumpInfoVo();
		BeanUtils.copyProperties(item, t);
		if (StringUtils.isNotBlank(item.getPvDesc())) {
			try {
				t.setPvJson((ObjectNode) mapper.readTree(item.getPvDesc()));
			} catch (JsonProcessingException e) {
				log.info("convert failed", e);
				t.setPvJson(mapper.createObjectNode());
			}
		} else {
			t.setPvJson(mapper.createObjectNode());
		}
		return t;
	}

	public ObjectNode getPvJson() {
		return pvJson;
	}

	public void setPvJson(ObjectNode pvJson) {
		this.pvJson = pvJson;
	}
}
