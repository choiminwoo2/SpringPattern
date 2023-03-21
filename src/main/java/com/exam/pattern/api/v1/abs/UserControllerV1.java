package com.exam.pattern.api.v1.abs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UserControllerV1 {
    String saveUser(@RequestParam("userId") String userId);
}