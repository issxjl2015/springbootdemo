package com.issxjl2015.springbootdemo.mapper;

import com.issxjl2015.springbootdemo.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(String name, String password);
}
