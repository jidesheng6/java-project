package com.example.jenkinsspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping("/msg")
    public String test(){
        return "测试1";
    }
}
