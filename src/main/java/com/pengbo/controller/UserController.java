package com.pengbo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: user controller
 * @author: Mr.Liu
 * @version: v1.0
 * @create: 2019-06-30 23:14
 **/
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello SpringBoot SSM...";
    }

}
