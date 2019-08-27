package com.offcn.day0826demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FourThymeleafController {

    /**
     * 访问localhost:8080 页面
     * 将数据message填充到templates/index4.html
     * @param model
     * @return
     */
    @GetMapping("/four")
    public String indexPage(Model model) {

        model.addAttribute("userName", "优就业");
        model.addAttribute("href", "http://www.ujiuye.com");
        return "index4";
    }


}
