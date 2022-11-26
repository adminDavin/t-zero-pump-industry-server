package com.t.zero.b.i.pump.utils;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.basic.common.base.contants.RequestConstants;

public class CommonUtils {
	public static Integer getCurrentPage(ObjectNode content) {
		return content.has(RequestConstants.CURRENT_PAGE)? content.get(RequestConstants.CURRENT_PAGE).asInt(): 1;
	}
	

	public static Integer getPageSize(ObjectNode content) {
		return content.has(RequestConstants.PAGE_SIZE)?content.get(RequestConstants.PAGE_SIZE).asInt(): 10;
	}

	
}
