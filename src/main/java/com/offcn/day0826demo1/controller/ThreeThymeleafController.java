package com.offcn.day0826demo1.controller;

import com.offcn.day0826demo1.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThreeThymeleafController {

    /**
     * 访问localhost:8080 页面
     * 将数据message填充到templates/index3.html
     * @param model
     * @return
     */
    @GetMapping("/three")
    public String indexPage(Model model) {
        List<User> list=new ArrayList<User>();
        User u1 = new User();
        u1.setId(1);
        u1.setName("优就业");
        u1.setAge(18);
        list.add(u1);

        User u2 = new User();
        u2.setId(2);
        u2.setName("中公教育");
        u2.setAge(28);
        list.add(u2);
        User u3 = new User();
        u3.setId(3);
        u3.setName("IT先锋");
        u3.setAge(88);
        list.add(u3);

        User u4 = new User();
        u4.setId(4);
        u4.setName("JAVA第一");
        u4.setAge(888);
        list.add(u4);

        model.addAttribute("userList", list);
        return "index3";
    }


}
