package com.pi.shop.payment8004.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  11-21-2020 13:32:50
 * @description :  controller测试类
 * @since :  v1.0
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello world!";
    }

}
