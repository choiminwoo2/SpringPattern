package com.exam.pattern.config.log;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfig {

    @Bean
    public LogTrace logTrace(){
        return new LocalThreadLogTrace();
    }
}
