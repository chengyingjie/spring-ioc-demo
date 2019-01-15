package com.jesse.spring.simples.controller;

import com.jesse.spring.simples.service.UserService;
import com.jesse.spring.spring.annotation.Autowired;
import com.jesse.spring.spring.annotation.Controller;
import com.jesse.spring.spring.annotation.RequestMapping;
import com.jesse.spring.spring.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getName")
    public String getName(HttpServletRequest request,HttpServletResponse response,@RequestParam("name") String name){
        return userService.getName(name);
    }

    @RequestMapping("/getHello")
    public String getHello(HttpServletRequest request,HttpServletResponse response,@RequestParam("name") String name){
        return userService.getName(name);
    }
}
