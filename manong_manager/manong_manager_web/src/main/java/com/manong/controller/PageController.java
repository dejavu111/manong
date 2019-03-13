package com.manong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：dejavu111
 * @date ：Created in 2019/3/12 9:25
 * @description：页面管理控制器
 * @modified By：
 * @version: $
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String requstPage(@PathVariable String page){
        return page;
    }

    @RequestMapping("/")
    public String requestIndex(){
        return "index";
    }
}
