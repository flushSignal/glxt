package com.example.glxt.controller;

import com.example.glxt.entity.User;
import com.example.glxt.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fcystart
 * @create 2023-03-07-22:20
 */
@Controller
@RestController
public class UserController {
    @Resource
    private UserMapper userMapper;
    @GetMapping("/")
    public List<User> test(){
        return userMapper.findAll();
    }
}
