package com.issxjl2015.springbootdemo.serviceImpl;

import com.issxjl2015.springbootdemo.bean.UserBean;
import com.issxjl2015.springbootdemo.mapper.UserMapper;
import com.issxjl2015.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }
}
