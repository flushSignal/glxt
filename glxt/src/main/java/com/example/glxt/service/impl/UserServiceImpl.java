package com.example.glxt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.glxt.entity.User;
import com.example.glxt.service.UserService;
import com.example.glxt.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 79815
* @description 针对表【sys_user】的数据库操作Service实现
* @createDate 2023-03-07 21:57:56
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




