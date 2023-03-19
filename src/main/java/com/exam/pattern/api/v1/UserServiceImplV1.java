package com.exam.pattern.api.v1;

import com.exam.pattern.api.v1.abs.UserRepositoryV1;
import com.exam.pattern.api.v1.abs.UserServiceV1;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserServiceImplV1 implements UserServiceV1 {

    private final UserRepositoryV1 userRepositoryV1;

    public UserServiceImplV1(UserRepositoryV1 userRepositoryV1) {
        this.userRepositoryV1 = userRepositoryV1;
    }

    @Override
    public void insertUser(String userId) {
        userRepositoryV1.insertUser(userId);
    }
}
