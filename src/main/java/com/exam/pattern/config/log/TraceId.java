package com.exam.pattern.config.log;

import lombok.Getter;

import java.util.UUID;

@Getter
public class TraceId {
    private String id;
    private int level;

    public TraceId(){
        this.id = createTraceId();
        this.level = 0;
    }

    private TraceId(String id, int level){
        this.id = id;
        this.level = level;
    }

    private String createTraceId() {
        String resultStr = UUID.randomUUID().toString();
        return resultStr.substring(0, resultStr.indexOf("-"));
    }

    public TraceId createNextTraceId(){
        return new TraceId(id, level +1);
    }

    public TraceId createPreviousId(){
        return new TraceId(id, level -1);
    }

    public boolean isFirstLevel(){
        return level == 0;
    }

}
