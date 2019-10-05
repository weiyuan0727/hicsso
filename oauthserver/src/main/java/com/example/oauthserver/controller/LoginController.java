package com.example.oauthserver.controller;

import com.example.oauthserver.config.HttpRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author weiyuan
 * @date 2019-10-04
 */
@Controller
@Slf4j
public class LoginController {

    @GetMapping("/login")
    public String login() {

        System.out.println("---------login---------");
        return "login";
    }

    @GetMapping("/")
    public String index() {
        log.info("----------跳转");
        return "index";
    }

    @GetMapping("/mylogout")
    public void mylogout(HttpServletRequest request, HttpServletResponse httpServletResponse) {
        String s = HttpRequest.sendGet("http://localhost:8085/orderSystem/logout", "key=123&v=456");
        HttpRequest.sendGet("http://localhost:8086/memberSystem/member/mylogout", "key=123&v=456");
        try {
            httpServletResponse.sendRedirect("http://localhost:6060/logout");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
