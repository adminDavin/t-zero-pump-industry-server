package com.t.zero.b.i.pump.helper;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.dubbo.common.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.t.zero.b.i.pump.db.dao.auto.PumpInformationMapper;
import com.t.zero.b.i.pump.db.model.auto.PumpInformation;
import com.t.zero.b.i.pump.db.model.auto.PumpInformationData;
import com.t.zero.b.i.pump.db.model.auto.PumpInformationExample;

@Component
public class PumpInformationHelper {

	@Autowired
	public PumpInformationMapper pumpInformationMapper;
	
	
	public PumpInformation getPumpInformationByBusi(String pumpName, String pumpModel, Float speed) {
		var e = new PumpInformationExample();
		e.createCriteria().andPumpNameEqualTo(pumpName).andPumpModelEqualTo(pumpModel).andSpeedEqualTo(speed);
		var t = pumpInformationMapper.selectByExample(e);
		if (CollectionUtils.isEmpty(t)) {
			return new PumpInformation(); 
		} else {
			return t.get(0); 
		}
	}
	
	public PumpInformation getPumpInformationByBusi(String pumpName, Integer pumpBusiId) {
		var e = new PumpInformationExample();
		e.createCriteria().andPumpNameEqualTo(pumpName).andPumpBusiIdEqualTo(pumpBusiId);
		var t = pumpInformationMapper.selectByExample(e);
		if (CollectionUtils.isEmpty(t)) {
			return new PumpInformation(); 
		} else {
			return t.get(0); 
		}
	}
	
	public PumpInformation getPumpInformationByBusi(PumpInformationData t) {
		if (ObjectUtils.isNotEmpty(t.getPumpBusiId())) {
			return getPumpInformationByBusi(t.getPumpName(), t.getPumpBusiId());
		} else {
			return getPumpInformationByBusi(t.getPumpName(), t.getPumpModel(), t.getSpeed());
		}
	}
	
}
