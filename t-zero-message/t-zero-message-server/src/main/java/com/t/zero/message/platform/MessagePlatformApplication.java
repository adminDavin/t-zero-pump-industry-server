package com.t.zero.message.platform;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.oas.annotations.EnableOpenApi;

@MapperScans({ @MapperScan("com.t.zero.message.platform.dao") })
@EnableOpenApi
@SpringBootApplication
@EnableScheduling
public class MessagePlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagePlatformApplication.class, args);
	}
}
