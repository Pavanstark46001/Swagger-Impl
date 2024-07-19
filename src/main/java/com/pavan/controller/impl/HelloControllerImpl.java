package com.pavan.controller.impl;

import com.pavan.controller.HelloController;
import com.pavan.response.HelloResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v4")
@CrossOrigin("*")
@Slf4j
public class HelloControllerImpl implements HelloController {
    @GetMapping("/sayhello")
    public HelloResponse sayHello(){
        return new HelloResponse("welcome to hello world");
    }

}
