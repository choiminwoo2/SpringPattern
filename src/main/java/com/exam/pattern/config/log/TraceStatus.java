package com.exam.pattern.config.log;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TraceStatus {
    private TraceId traceId;
    private Long startTimeMs;
    private String message;
}
