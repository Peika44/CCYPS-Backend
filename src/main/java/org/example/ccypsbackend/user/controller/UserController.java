package org.example.ccypsbackend.user.controller;

import jakarta.annotation.Resource;
import org.example.ccypsbackend.user.dao.entity.User;
import org.example.ccypsbackend.user.service.UserService;
import org.example.ccypsbackend.utils.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    /* inject the UserService */
    @Resource
    private UserService userService;


    @PostMapping("/login")
    public Result<User> login(@RequestParam User user) {
        User loginUser = userService.login(user.getUname(), user.getPassword());
        if (loginUser != null) {
            return Result.success(loginUser, "Login success.");
        } else {
            return Result.error(123, "Login failed.");
        }
    }

    @PostMapping("/register")
    public Result<User> register(@RequestBody User newUser) {
        User registerUser = userService.register(newUser);
        if (registerUser != null) {
            return Result.success(registerUser, "Register success.");
        } else {
            return Result.error(456, "User already exists.");
        }
    }
}
