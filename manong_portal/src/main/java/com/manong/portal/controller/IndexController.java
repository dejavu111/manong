package com.manong.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：dejavu111
 * @date ：Created in 2019/7/29 11:20
 */
@Controller
public class IndexController {

    @RequestMapping("/home.html")
    public String index() {
        return "index";
    }
}
