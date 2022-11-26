package com.t.zero.message.platform.business.channel;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.t.zero.message.platform.business.channel.UserSendder.SimpleUser;
import com.t.zero.message.platform.model.auto.ChannelDefined;

public interface Channel {
	
	Channel init(JsonNode channel);
	
	boolean send(ChannelDefined channel, String title, String content,List<SimpleUser> sendUsers,String businessType,String templateCode) throws Exception;
	
}
