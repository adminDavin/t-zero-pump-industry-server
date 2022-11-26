package com.t.zero.gongxin.whp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import com.t.zero.basic.common.jasypt.TZeroTextEncryptor;

import springfox.documentation.oas.annotations.EnableOpenApi;

@MapperScans({@MapperScan("com.t.zero.gongxin.whp.db")})
@EnableOpenApi
@SpringBootApplication
public class WhpDataImportApplication {
	public static void main(String[] args) {
        TZeroTextEncryptor.updateSystemProperties();
        SpringApplication.run(WhpDataImportApplication.class, args);
    }
}
