package com.wangjx.cat.bean;

import com.alibaba.fastjson.JSONObject;
import com.wangjx.cat.enums.ResultEnum;

/**
 * @author WangJiaxing
 * @version 1.0.0
 * @ClassName JsonResult.java
 * @Description json结果封装
 * @createTime 2019年07月22日 16:01:00
 */
public class HttpJsonResult {

    public static JSONObject result(int code, String msg, Object data) {
        JSONObject result = new JSONObject();
        result.put("code", String.valueOf(code));
        result.put("msg", msg);
        result.put("data", JSONObject.toJSONString(data));
        return result;
    }

    public static JSONObject success(String msg, Object data) {
        return result(ResultEnum.SUCCESS.getCode(), msg, data);
    }

    public static JSONObject success(String msg) {
        return success(msg, null);
    }

    public static JSONObject failure(String msg, Object data) {
        return result(ResultEnum.FAILURE.getCode(), msg, data);
    }

    public static JSONObject failure(String msg) {
        return failure(msg, null);
    }

}
