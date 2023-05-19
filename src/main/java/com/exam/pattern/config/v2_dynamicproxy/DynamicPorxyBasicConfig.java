package com.exam.pattern.config.v2_dynamicproxy;

import com.exam.pattern.api.v1.UserRepositoryImplV1;
import com.exam.pattern.api.v1.abs.UserRepositoryV1;
import com.exam.pattern.config.log.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Member;

@Configuration
public class DynamicPorxyBasicConfig {

    @Bean
    public UserRepositoryV1 userRepositoryV1(LogTrace trace){
        UserRepositoryV1 userRepositoryV1 = new UserRepositoryImplV1();
        
    }
}
