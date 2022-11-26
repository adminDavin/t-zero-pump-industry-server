package com.t.zero.message.platform.business.channel;

public enum ChannelCodeEnum {
    ALIYUN_SMS_SENDER("aliyunSmsSender");

    private String channelCode;

    ChannelCodeEnum(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getChannelCode() {
        return this.channelCode;
    }
}
