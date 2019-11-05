package com.mengxuegu.springboot.dao;

import com.mengxuegu.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 08:41 2019/11/5
 */
public interface UserRepository extends JpaRepository<User,Integer> {

}
