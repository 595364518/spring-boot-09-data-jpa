package com.mengxuegu.springboot.service.impl;

import com.mengxuegu.springboot.dao.UserRepository;
import com.mengxuegu.springboot.entity.User;
import com.mengxuegu.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 09:22 2019/11/5
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Transactional(isolation = Isolation.DEFAULT)//该方法开启事务管理
    @Override
    public Boolean addUser(User user) {
        //正常添加数据
        userRepository.save(new User("1","1"));
        userRepository.save(new User("12","2"));
        userRepository.save(new User("123","3"));
        userRepository.save(new User("1234","4"));
        userRepository.save(new User("12345","5"));

        //模拟错误
//        userRepository.save(new User("123465","6"));
//        userRepository.save(new User("1234567","7"));

        userRepository.save(user);
        return null;
    }
}
