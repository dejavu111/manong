package com.manong.controller;

import com.manong.pojo.User;
import com.manong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/{userid}")
    @ResponseBody
//    @responseBody注解的作用是将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，
//    写入到response对象的body区，通常用来返回JSON数据或者是XML数据
//　　不用使用JSONObject
    public User getUserById(@PathVariable Integer userid){
        User user = userService.getUserById(userid);
        return user;
    }


}