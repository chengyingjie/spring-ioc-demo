package com.jesse.spring.simples.service.impl;

import com.jesse.spring.simples.service.UserService;
import com.jesse.spring.spring.annotation.Service;


@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getName(String name) {
        System.out.println("my name is "+name);
        return name;
    }
}
