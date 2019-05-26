package com.manong.controller;

import com.manong.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.EasyUITree;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author ：dejavu111
 * @date ：Created in 2019/3/12 9:25
 * @description：页面管理控制器
 * @modified By：
 * @version: $
 */
@Controller
public class PageController {

    @Autowired
    ProductCategoryService productCategoryService;

    @RequestMapping("/{page}")
    public String requstPage(@PathVariable String page){
        return page;
    }

    @RequestMapping("/")
    public String requestIndex(){
        return "index";
    }

    @RequestMapping("/product_add")
    public String requestProductAdd(HttpServletRequest request){
        List<EasyUITree> categories = productCategoryService.findProductCategoryListById((short)0);
        request.getSession().setAttribute("categories",categories);
        return "product_add";

    }
}
