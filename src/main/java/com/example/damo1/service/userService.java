package com.example.damo1.service;


import org.springframework.stereotype.Service;

import com.example.damo1.domain.User;

@Service
public class userService {

public User save(User user){
    System.out.println("UserServiceのsaveが呼ばれました。");
    return user;

}

}
