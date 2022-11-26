package com.t.zero.b.i.pump;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.t.zero.basic.common.jasypt.TZeroTextEncryptor;

import springfox.documentation.oas.annotations.EnableOpenApi;

@MapperScans({@MapperScan("com.t.zero.b.i.pump")})
@EnableOpenApi
@EnableDubbo
@SpringBootApplication
public class PumpIndustryApplication {

    public static void main(String[] args) {
        TZeroTextEncryptor.updateSystemProperties();
        SpringApplication.run(PumpIndustryApplication.class, args);
    }
}
