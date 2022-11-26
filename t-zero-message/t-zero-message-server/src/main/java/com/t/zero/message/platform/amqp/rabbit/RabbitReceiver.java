package com.t.zero.message.platform.amqp.rabbit;

import java.util.Map;

import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import com.t.zero.message.platform.service.MessageHandleService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class RabbitReceiver {

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private MessageHandleService messageHandleService;

    /**
     * 处理执行进度消息
     * 
     * @param
     * @throws Exception
     */
    @RabbitListener(queues = "${queues.direct.message.center.sms.queue}", ackMode = "AUTO")
    public void receive(@Payload String body, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag,
        @Headers Map<String, Object> headers) throws Exception {
        var contentType = (String)headers.get(AmqpHeaders.CONTENT_TYPE);
        if (MessageProperties.CONTENT_TYPE_JSON.equals(contentType)) {
            messageHandleService.handle(mapper.readTree(body));


        } else {
            log.warn("only surport " + MessageProperties.CONTENT_TYPE_JSON + " current is " + contentType);
        }
    }
}
