package com.exam.pattern.api.v1;

import com.exam.pattern.api.v1.abs.UserControllerV1;
import com.exam.pattern.api.v1.abs.UserServiceV1;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserControllerImplV1 implements UserControllerV1 {

    private final UserServiceV1 userServiceV1;

    public UserControllerImplV1(UserServiceV1 userServiceV1) {
        this.userServiceV1 = userServiceV1;
    }

    @Override
    public String saveUser(String userId) {
        userServiceV1.insertUser(userId);
        return "ok";
    }
}
