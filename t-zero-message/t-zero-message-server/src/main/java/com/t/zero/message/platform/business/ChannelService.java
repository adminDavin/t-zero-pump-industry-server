package com.t.zero.message.platform.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.t.zero.message.platform.business.channel.Channel;
import com.t.zero.message.platform.business.channel.UserSendder.SimpleUser;
import com.t.zero.message.platform.model.auto.ChannelDefined;

@Service
public class ChannelService {

    @Autowired
    private ApplicationContext applicationContext;

    public boolean send(ChannelDefined channel, String title, String content, List<SimpleUser> sendUsers,String businessType,String templateCode) throws Exception {
        Channel channelInstance = applicationContext.getBean(channel.getChannelCode(), Channel.class);
        return channelInstance.send(channel, title, content, sendUsers,businessType,templateCode);
    }
}
