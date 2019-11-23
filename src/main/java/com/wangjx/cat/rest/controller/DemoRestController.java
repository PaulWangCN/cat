package com.wangjx.cat.rest.controller;

import com.alibaba.fastjson.JSONObject;
import com.wangjx.cat.bean.HttpJsonResult;
import com.wangjx.cat.bean.TUser;
import com.wangjx.cat.dao.TUserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * rest返回json字符串的controller的demo
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    private final TUserMapper tUserMapper;

    public DemoRestController(TUserMapper tUserMapper) {
        this.tUserMapper = tUserMapper;
    }

    @GetMapping("/index")
    public String index() {
        JSONObject json = new JSONObject();
        json.put("name", "demo");
        json.put("time", System.currentTimeMillis());
        return json.toJSONString();
    }

    @GetMapping("/users")
    public String users() {
        List<TUser> users = tUserMapper.findAll();
        return HttpJsonResult.success("查找所有用户成功", users).toJSONString();
    }

}
