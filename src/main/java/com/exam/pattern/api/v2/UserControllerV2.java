package com.exam.pattern.api.v2;

import com.exam.pattern.api.v1.abs.UserControllerV1;
import com.exam.pattern.api.v1.abs.UserServiceV1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class UserControllerV2 {

    private final UserServiceV2 userService;

    public UserControllerV2(UserServiceV2 userService) {
        this.userService = userService;
    }

    @PostMapping("/v2/member")
    public String saveUser(String userId) {
        userService.insertUser(userId);
        return "ok";
    }
}
