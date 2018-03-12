package com.example.demoMaven;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PingController {
    
    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }
    @RequestMapping("/")
    public String index(){
        return "not valid";
    }
    
}