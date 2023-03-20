package com.exam.pattern.trace;

import com.exam.pattern.config.log.LocalThreadLogTrace;
import com.exam.pattern.config.log.LogTrace;
import com.exam.pattern.config.log.TraceStatus;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class LogTraceTest {

    LogTrace logTrace = new LocalThreadLogTrace();

    @Test
    void LogCreateTest(){
        //일반 테스트 시작 및 끝
        TraceStatus traceStatus1 = logTrace.begin("테스트시작");
        logTrace.end(traceStatus1);

        //에러 테스트 시작
        TraceStatus traceStatus2 = logTrace.begin("테스트시작");
        logTrace.exception(traceStatus2, new IllegalStateException("불변성 에러"));
    }
}
