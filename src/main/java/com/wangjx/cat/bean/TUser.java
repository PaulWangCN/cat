package com.wangjx.cat.bean;

import lombok.Data;


/**
 * @author WangJiaxing
 * @version 1.0.0
 * @ClassName TUser.java
 * @Description t_user表对应model
 * @createTime 2019年07月31日 11:40:00
 */
@Data
public class TUser {
    private long id;
    private String account;
    private String password;
    private String name;
}
