package com.manong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：dejavu111
 * @date ：Created in 2019/3/10 17:05
 * @description：商品管理控制层
 * @modified By：
 * @version: $
 */
@Controller
public class ProductController {
    @RequestMapping("product_list")
    public String listProduct(){
        return "product_list";
    }
}
