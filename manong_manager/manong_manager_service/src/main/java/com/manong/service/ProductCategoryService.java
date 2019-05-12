package com.manong.service;

import pojo.EasyUITree;
import pojo.ResponseJsonResult;

import java.util.List;

public interface ProductCategoryService {
    List<EasyUITree> findProductCategoryListById(Short id);

    ResponseJsonResult addCategory(Short id, String name);

    ResponseJsonResult deleteCatagory(Short parentId, Short id);
}
