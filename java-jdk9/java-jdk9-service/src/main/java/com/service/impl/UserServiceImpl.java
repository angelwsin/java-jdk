package com.service.impl;

import com.service.UserService;
import com.user.User;

public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {

        System.out.println("save user"+user);
    }
}
