package com.wangjx.cat.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangjx.cat.bean.TUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TUserMapper extends BaseMapper<TUser> {

    @Select("select * from t_user")
    List<TUser> findAll();

}
