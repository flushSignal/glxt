package com.example.glxt.mapper;

import com.example.glxt.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 79815
* @description 针对表【sys_user】的数据库操作Mapper
* @createDate 2023-03-07 21:57:56
* @Entity com.example.glxt.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select* from sys_user")
    List<User> findAll();

}




