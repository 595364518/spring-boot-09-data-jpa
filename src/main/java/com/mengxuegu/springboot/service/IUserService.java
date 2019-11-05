package com.mengxuegu.springboot.service;

import com.mengxuegu.springboot.entity.User;
import org.springframework.stereotype.Service;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 09:21 2019/11/5
 */
@Service
public interface IUserService {

    Boolean addUser(User user);
}
