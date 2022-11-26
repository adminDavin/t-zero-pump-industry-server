package com.t.zero.message.platform.business.channel;

import java.util.List;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.message.platform.model.auto.ChannelDefined;
import com.t.zero.message.platform.model.auto.MessageTemplate;

import lombok.Data;

@Data
public class UserSendder {

    @Data
    public class SimpleUser {
        public SimpleUser(ObjectNode userInfo, List<Integer> templateIds) {
            this.templateIds = templateIds;
            this.userInfo = userInfo;
        }

        ObjectNode userInfo;
        List<Integer> templateIds;
    }

    private List<SimpleUser> userInfos;

    private ChannelDefined channelDefined;

    private List<MessageTemplate> userTemplates;

    public UserSendder addUser(ObjectNode userInfo, List<Integer> templateIds) {
        this.userInfos.add(new SimpleUser(userInfo, templateIds));
        return this;
    }

}
