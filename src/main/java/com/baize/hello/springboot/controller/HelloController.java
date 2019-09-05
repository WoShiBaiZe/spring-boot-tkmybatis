package com.baize.hello.springboot.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: hello-spring-boot
 * @Package: com.baize.hello.springboot.controller
 * @ClassName: HelloController
 * @Author: BaiZe
 * @Description: 第一个SpringBoot程序
 * @Date: 2019/9/5 22:20
 * @Version: 1.0
 */
@RestController
public class HelloController {
    @GetMapping("/")
    public String SayHi(){
        return "Hello Spring Boot";
    }
}
