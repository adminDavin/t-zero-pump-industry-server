package com.t.zero.message.platform.amqp.rabbit;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.t.zero.message.platform.amqp.rabbit.queue.QueueDefinition;

@Configuration
@ConfigurationProperties(prefix = "queues.direct.message.center.sms")
public class SmsQueue  extends QueueDefinition {
}
