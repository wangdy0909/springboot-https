package com.wdy.https.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangdy
 * @date 2019/8/13 10:52
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @RequestMapping("test")
    public String test(){
        return "hello springboot https";
    }
}
