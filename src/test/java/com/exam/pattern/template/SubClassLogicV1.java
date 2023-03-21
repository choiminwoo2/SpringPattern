package com.exam.pattern.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SubClassLogicV1 extends abstractTemplate{
    @Override
    public void call() {
        log.info("템플릿 패턴 비지니스 로직 1번 실행");
    }
}
