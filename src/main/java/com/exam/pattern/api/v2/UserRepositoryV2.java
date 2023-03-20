package com.exam.pattern.api.v2;

import com.exam.pattern.api.v1.abs.UserRepositoryV1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class UserRepositoryV2 {


    public void insertUser(String userId) {

        if("ex".equals(userId)){
            throw new IllegalStateException("불변성 상태가 아닙니다.");
        }
        sleep(1000);
    }

    private void sleep(int mils){
        try {
            Thread.sleep(mils);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
