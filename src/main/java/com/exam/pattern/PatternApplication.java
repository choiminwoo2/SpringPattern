package com.exam.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.exam.pattern.api")
public class PatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternApplication.class, args);
    }

}
