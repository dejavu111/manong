package com.manong.service;

import com.manong.pojo.Product;
import pojo.ResponseJsonResult;

public interface ProductService {
    ResponseJsonResult saveProduct(Product product);
}
