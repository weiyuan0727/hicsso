package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by weiyuan on 2019/10/4/004.
 */
@Controller
public class LoingControllerr {
    @RequestMapping("/mylogin")
    public String login() {
        System.out.println(1);
        return "login";
    }
}
