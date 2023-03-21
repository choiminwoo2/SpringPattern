package com.exam.pattern.jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bimpl implements Binterface{
    @Override
    public String call() {
        log.info("Bimpl 호출");
        return "B";
    }
}
