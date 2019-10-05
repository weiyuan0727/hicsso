package com.example.demo.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;

/**
 * @author weiyuan
 * @date 2019-10-04
 */
@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/list")
    public ModelAndView list(ModelAndView modelAndView) {
        modelAndView.setViewName("member/list");
        System.out.println(1111);
        return modelAndView;
    }

}
