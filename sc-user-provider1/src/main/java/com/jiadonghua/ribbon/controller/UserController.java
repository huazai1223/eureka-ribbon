package com.jiadonghua.ribbon.controller;

import com.jiadonghua.ribbon.service.IUserService;
import com.jiadonghua.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("getuser")
    public  String getUserNameById(@RequestParam(value = "uid",defaultValue = "") int id){
        return "111 usernma [" + id + "]";
    }

    @RequestMapping("testList")
    public List<String> gets(){

        ArrayList<String> list = new ArrayList<>();
        list.add("zhenji...");
        list.add("wangzhaojun...");
        return list;

    }

    //查询数据
    @RequestMapping("ulist")
    public List<User> getUserList(){
        List<User> userList = userService.list();
        return userList;
    }

}
