package com.exam.pattern.api.v2;

import com.exam.pattern.api.v1.abs.UserRepositoryV1;
import com.exam.pattern.api.v1.abs.UserServiceV1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceV2 {

    private final UserRepositoryV2 userRepository;

    public UserServiceV2(UserRepositoryV2 userRepository) {

        this.userRepository = userRepository;
    }


    public void insertUser(String userId) {
        userRepository.insertUser(userId);
    }
}
