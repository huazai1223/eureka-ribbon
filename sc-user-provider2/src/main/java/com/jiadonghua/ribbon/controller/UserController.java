package com.jiadonghua.ribbon.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("getuser")
    public  String getUserNameById(@RequestParam(value = "uid",defaultValue = "") int id){
        return " 222 usernma [" + id + "]";
    }

    //@RequestMapping(value = "testList",produces = MediaType.APPLICATION_PROBLEM_JSON_VALUE )
    @RequestMapping(value = "testList")
    public List<String> gets(){

        ArrayList<String> list = new ArrayList<>();
        list.add("zhenji");
        list.add("wangzhaojun");
        return list;

    }

}
