package com.issxjl2015.springbootdemo.service;

import com.issxjl2015.springbootdemo.bean.UserBean;

public interface UserService {
    UserBean loginIn(String name, String password);
}
