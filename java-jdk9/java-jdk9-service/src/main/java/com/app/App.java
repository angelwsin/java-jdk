package com.app;

import com.service.UserService;
import com.service.impl.UserServiceImpl;
import com.user.User;

public class App {


    //psvm+tab

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        User user = new User();
        user.setUserName("user zhangsan");
        userService.save(user);
    }
}
