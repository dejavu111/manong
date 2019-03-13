package com.manong.controller;

import com.manong.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.EasyUITree;

import java.util.List;

/**
 * @author ：dejavu111
 * @date ：Created in 2019/3/12 10:04
 * @description：商品分类管理控制器
 * @modified By：
 * @version: $
 */
@Controller
@RequestMapping("/product_category")
public class ProductCategoryController {

    @Autowired
    ProductCategoryService productCategoryService;

    /**
     * 根据parentid返回数据列表
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<EasyUITree> getProductCategoryByParentId(@RequestParam(value = "id", defaultValue = "0") Short
                                                                 parentId) {
        List<EasyUITree> easyUITrees = productCategoryService.findProductCategoryListByParentId(parentId);
        return easyUITrees;
    }

}
