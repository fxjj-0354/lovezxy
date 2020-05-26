package com.lovezxy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description 测试类
 * @Author hxd
 * @Date 2020/5/26 10:06
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
