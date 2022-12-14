package com.t.zero.basic.common.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.t.zero.basic.component.response.ResponseExceptionHandler;
import com.t.zero.basic.component.utils.LocaleUtil;

@Component
public class TZeroCommonConfig {

    @Bean
    public LocaleUtil getLocale(HttpServletRequest request) {
        return new LocaleUtil(request);
    }

    @Bean
    public ResponseExceptionHandler responseExceptionHandler(LocaleUtil localeUtil, MessageSource messageSource) {
        return new ResponseExceptionHandler(localeUtil, messageSource);
    }
}
