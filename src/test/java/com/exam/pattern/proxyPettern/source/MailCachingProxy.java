package com.exam.pattern.proxyPettern.source;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MailCachingProxy implements Mail{

    private String sendName;
    private RealMail target;

    public MailCachingProxy(RealMail target) {
        this.target = target;
    }

    @Override
    public String send() {
        log.info("프록시 호출");
        if(sendName == null){
            sendName = target.send();
        }
        return sendName;

    }
}
