package com.exam.pattern.proxyPettern.source;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealMail implements Mail{

    @Override
    public String send() {
        log.info("RealSend 호출 입니다.");
        sleep(1000);
        return "RealSend";
    }

    private void sleep(int mils){
        try {
            Thread.sleep(mils);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
