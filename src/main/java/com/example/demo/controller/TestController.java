package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: shaocg
 * @Date: 2019-02-20 15:57
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "hola,messi";
    }
}
