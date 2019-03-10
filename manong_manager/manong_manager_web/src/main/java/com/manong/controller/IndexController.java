package com.manong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：dejavu111
 * @date ：Created in 2019/3/10 14:50
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String requestIndex(){
        return "index";
    }
}