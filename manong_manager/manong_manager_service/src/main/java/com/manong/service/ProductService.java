package com.manong.service;

import com.manong.pojo.EasyGrid;
import com.manong.pojo.Product;
import pojo.ResponseJsonResult;

public interface ProductService {
    ResponseJsonResult saveProduct(Product product);
    EasyGrid listProduct(int pages,int rows);
}
