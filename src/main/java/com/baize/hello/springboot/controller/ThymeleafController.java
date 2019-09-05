package com.baize.hello.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ProjectName: hello-spring-boot
 * @Package: com.baize.hello.springboot.controller
 * @ClassName: ThymeleafController
 * @Author: BaiZe
 * @Description: Thymeleaf
 * @Date: 2019/9/5 23:18
 * @Version: 1.0
 */
@Controller
public class ThymeleafController {
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("name","张三");
        return "index";
    }
}
