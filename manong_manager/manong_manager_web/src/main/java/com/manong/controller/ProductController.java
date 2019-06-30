package com.manong.controller;

import com.manong.pojo.EasyGrid;
import com.manong.pojo.Product;
import com.manong.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @RequestMapping("/product/list")
    @ResponseBody
    public EasyGrid listProduct(@RequestParam(value="page", defaultValue = "1")int page, @RequestParam(value = "rows",defaultValue = "10")int rows){
        EasyGrid easyGrid = productService.listProduct(page, rows);
        return easyGrid;
    }

    @RequestMapping("/product_save")
    @ResponseBody
    public ResponseJsonResult saveProduct(Product product) {
        product.getId();
        return productService.saveProduct(product);
    }
}
