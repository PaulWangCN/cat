package com.wangjx.cat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面controller的demo
 */
@Controller
@RequestMapping
public class DemoController {

    @GetMapping("/hello")
    public String index(Model model) {
        model.addAttribute("name", "Paul");
        model.addAttribute("time", System.currentTimeMillis());
        return "/hello";
    }

}
