package com.exam.pattern.jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Aimpl implements Ainterface {
    @Override
    public String call() {
        log.info("Aimpl 호출");
        return "A";
    }
}
