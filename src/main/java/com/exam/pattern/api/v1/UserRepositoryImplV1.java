package com.exam.pattern.api.v1;

import com.exam.pattern.api.v1.abs.UserRepositoryV1;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserRepositoryImplV1 implements UserRepositoryV1 {
    @Override
    public void insertUser(String userId) {

        if("ex".equals(userId)){
            throw new IllegalStateException("불변성 상태가 아닙니다.");
        }

    }
}
