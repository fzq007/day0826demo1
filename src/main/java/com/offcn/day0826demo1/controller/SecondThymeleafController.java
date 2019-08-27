package com.offcn.day0826demo1.controller;

import com.offcn.day0826demo1.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SecondThymeleafController {

    /**
     * 访问localhost:8080页面
     * 将数据message填充到templates/index2.html
     * @param model
     * @return
     */
    @GetMapping("/second")
    public String indexPage(Model model) {
        String message = "Hello, Thymeleaf!";

        User u = new User();
        u.setId(1);
        u.setName("优就业");
        u.setAge(18);

        Map<String,Object> map=new HashMap<>();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");


        model.addAttribute("message", message);
        model.addAttribute("user", u);
        model.addAttribute("src", map);
        return "index2";
    }


}
