package com.manong.controller;

import com.manong.pojo.Product;
import com.manong.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.ResponseJsonResult;

/**
 * @author ：dejavu111
 * @date ：Created in 2019/3/10 17:05
 * @description：商品管理控制层
 * @modified By：
 * @version: $
 */
@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/product_list")
    public String listProduct(){
        return "product_list";
    }

    @RequestMapping("/product_save")
    @ResponseBody
    public ResponseJsonResult saveProduct(Product product) {
        product.getId();
        return productService.saveProduct(product);
    }
}
