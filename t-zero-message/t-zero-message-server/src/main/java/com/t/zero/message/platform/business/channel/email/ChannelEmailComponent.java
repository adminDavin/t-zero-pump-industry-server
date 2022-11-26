package com.t.zero.message.platform.business.channel.email;

import java.util.List;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.message.platform.business.channel.Channel;
import com.t.zero.message.platform.business.channel.UserSendder.SimpleUser;
import com.t.zero.message.platform.model.auto.ChannelDefined;

@Lazy
@Component(value = "channelEmail")
public class ChannelEmailComponent implements Channel {

	private Boolean initedFlag = Boolean.FALSE;

	@Autowired
	private ObjectMapper mapper;

	@Override
	public Channel init(JsonNode channel) {
		if (initedFlag) {
			return this;
		}

		return this;
	}

	@Override
	public boolean send(ChannelDefined channel, String title, String content,List<SimpleUser> sendUsers,String businessType, String templateCode) throws Exception {
		var data = mapper.readTree(channel.getChannelDesc());
		String hostName = data.get("hostName").asText();
		String charset = data.get("charset").asText();
		String fromEmail = data.get("fromEmail").asText();
		String name = data.get("name").asText();
		String password = data.get("password").asText();
		sendUsers.forEach(user->{
			ObjectNode objectNode =  user.getUserInfo();
			if(!objectNode.isEmpty()){
				try {
					JsonNode userNode = mapper.readTree(objectNode.toString());
					if(userNode.has("emailAddress") && (!userNode.get("emailAddress").isEmpty())){
						HtmlEmail email = new HtmlEmail();
						email.setHostName(hostName);
						email.setSmtpPort(465);
						email.setCharset(charset);
						email.addTo(userNode.get("emailAddress").asText());
						email.setFrom(fromEmail, name);
						email.setAuthentication(fromEmail, password);
						email.setSubject(title);
						email.setMsg(content+"<a href=\"mailto:sample@fly63.com?subject=test&cc=sample@hotmail.com&subject="+title+"&body="+content+"\"></a>");
						email.send();
					}
				} catch (JsonProcessingException | EmailException e) {
					e.printStackTrace();
				}
			}
		});
		return Boolean.TRUE;
	}
	public static void main(String[] args){
		String title = "发起工单";
		String content = "你的工单已发起";
		try {
			HtmlEmail email = new HtmlEmail();
			email.setHostName("smtp.163.com");
			email.setCharset("utf-8");
			email.setSmtpPort(465);
			email.addTo("majingyun322@163.com");
			email.setFrom("18758268513@163.com", "图灵智能科技");
			email.setAuthentication("18758268513@163.com", "KZWEGKIEWJTOSQIM");
			email.setSubject(title);
			email.setMsg(content+"<a href=\"mailto:sample@fly63.com?subject=test&cc=sample@hotmail.com&subject="+title+"&body="+content+"\"></a>");
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}


	}

}
