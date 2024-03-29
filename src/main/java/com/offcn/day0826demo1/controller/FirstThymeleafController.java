package com.offcn.day0826demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstThymeleafController {

    /**
     * 访问http://localhost:8003/java003/first
     * 将数据message填充到templates/index.html
     * @param model
     * @return
     */
    @GetMapping("/first")
    public String indexPage(Model model) {
        String message = "Hello, Thymeleaf!";
        model.addAttribute("message", message);
        return "index";
    }


}
