package com.exam.pattern.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class abstractTemplate {
    public void execute(){
        Long startTimeMs = System.currentTimeMillis();
        call();
        Long endTimeMs = System.currentTimeMillis();
        Long resultTimeMs = endTimeMs - endTimeMs;
        log.info("resultTime = {}", resultTimeMs);
    }

    public abstract void call();
}
