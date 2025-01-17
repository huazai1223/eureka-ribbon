package com.jiadonghua.ribbon.service;

import com.jiadonghua.user.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "scuserservice")
public interface UserService {

    @RequestMapping("/getuser")
    String getNameById(@RequestParam("uid") int uid);

    @RequestMapping("/testList")
    List<String> testlist();

    @RequestMapping("/ulist")
    List<User> getUserlist();


}
