package com.manong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：dejavu111
 * @date ：Created in 2019/5/17 20:14
 * @description：
 * @modified By：
 * @version: $
 */

@Controller
public class FreemarkerTest {
    @RequestMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("name", "wisbean");
        return "hello";
    }

    @RequestMapping("/hi")
    public String sayHi(Model model) {
        model.addAttribute("name", "wisbean");
        return "hi";
    }
}
