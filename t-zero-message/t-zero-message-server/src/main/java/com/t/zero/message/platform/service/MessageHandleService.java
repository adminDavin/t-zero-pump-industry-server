package com.t.zero.message.platform.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

public interface MessageHandleService {
	
	public void handle(JsonNode data) throws JsonMappingException, JsonProcessingException, Exception;
}
