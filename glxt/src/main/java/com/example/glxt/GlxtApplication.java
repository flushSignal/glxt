package com.example.glxt;

import com.example.glxt.entity.User;
import com.example.glxt.mapper.UserMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@SpringBootApplication
public class GlxtApplication {


    public static void main(String[] args) {
        SpringApplication.run(GlxtApplication.class, args);
    }
}
