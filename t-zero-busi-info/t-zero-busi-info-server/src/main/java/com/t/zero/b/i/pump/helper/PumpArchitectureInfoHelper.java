package com.t.zero.b.i.pump.helper;

import org.apache.dubbo.common.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.t.zero.b.i.pump.db.dao.auto.PumpArchitectureInfoMapper;
import com.t.zero.b.i.pump.db.model.auto.PumpArchitectureInfoExample;

@Component
public class PumpArchitectureInfoHelper {

	@Autowired
	public ObjectMapper mapper;

	@Autowired
	public PumpArchitectureInfoMapper pumpArchitectureInfoMapper;

	public static String[] POLES = { "2P", "4P" };

	private String getPole(String rotation) {
		var t = Integer.parseInt(rotation);
		if (2900 <= t && t <= 3000) {
			return POLES[0];
		} else if (1390 <= t && t <= 1500) {
			return POLES[1];
		} else {
			return POLES[0];
		}
	}

	public String getModelMotor(String speed, String levelMoter, String pumpSource) {
		var pole = getPole(speed);
		var power = Float.parseFloat(levelMoter);
		var e = new PumpArchitectureInfoExample();
		e.createCriteria().andPumpSourceEqualTo(pumpSource).andPowerEqualTo(power).andPoleEqualTo(pole);
		var t = pumpArchitectureInfoMapper.selectByExample(e);
		return CollectionUtils.isEmpty(t) ? null : t.get(0).getModelMotor();
	}

}
