package com.spring.azure.demo.springazureseconddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloSpringboot {
    @GetMapping("/message")
    public  String getMessage(){
           return "Hi Hello How are you? ";
    }
}
