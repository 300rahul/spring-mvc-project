package com.love2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {

    @RequestMapping("/")
    public String ShowPage(){
        return "main-menu";
    }
}
