package com.wangjx.cat.enums;

import lombok.Getter;

/**
 * @author WangJiaxing
 * @version 1.0.0
 * @ClassName ResultEnum.java
 * @Description 结果枚举
 * @createTime 2019年07月22日 15:48:00
 */
@Getter
public enum ResultEnum {

    SUCCESS(100, "成功"),
    FAILURE(-100, "失败");

    private int code;
    private String name;

    ResultEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

}
