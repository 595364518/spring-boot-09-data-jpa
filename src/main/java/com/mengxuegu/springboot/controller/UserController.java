package com.mengxuegu.springboot.controller;

import com.mengxuegu.springboot.dao.UserRepository;
import com.mengxuegu.springboot.entity.User;
import com.mengxuegu.springboot.service.IUserService;
import com.mengxuegu.springboot.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 09:02 2019/11/5
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable(value = "id")Integer id){

        Optional<User> userOptional = userRepository.findById(id);
        User user = userOptional.get();
        return user;
    }

    @GetMapping("/user")
    public User addUser(User user){

        User user1 = userRepository.save(user);

        return user1;
    }

    @Autowired
    IUserService userService;

    @GetMapping("/user1")
    public User addUser1(User user){
        userService.addUser(user);
        return user;
    }
}
