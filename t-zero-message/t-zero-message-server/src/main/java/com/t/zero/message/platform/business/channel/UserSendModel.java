package com.t.zero.message.platform.business.channel;

import java.util.List;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.t.zero.message.platform.model.auto.ChannelDefined;

import lombok.Data;

@Data
public class UserSendModel {

    private Integer userId;

    private ObjectNode userInfo;

    private List<ChannelDefined> channels;

    private List<Integer> ignoreTemplates;

}
