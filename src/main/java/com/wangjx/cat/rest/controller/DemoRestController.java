package com.wangjx.cat.rest.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * rest返回json字符串的controller的demo
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @GetMapping("/index")
    public String index() {
        JSONObject json = new JSONObject();
        json.put("name", "demo");
        json.put("time", System.currentTimeMillis());
        return json.toJSONString();
    }

}
