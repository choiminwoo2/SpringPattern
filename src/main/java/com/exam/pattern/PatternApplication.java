package com.exam.pattern;

import com.exam.pattern.config.log.LogConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(LogConfig.class)
@SpringBootApplication(scanBasePackages = "com.exam.pattern.api.v1")
public class PatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternApplication.class, args);
    }

}
