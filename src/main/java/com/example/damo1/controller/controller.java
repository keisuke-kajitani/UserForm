package com.example.damo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/name")
public class controller {
@RequestMapping("/hello")
public String index(){
    return "hello";
}



}
