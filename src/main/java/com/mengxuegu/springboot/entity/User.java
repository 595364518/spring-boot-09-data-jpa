package com.mengxuegu.springboot.entity;

import javax.persistence.*;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 08:38 2019/11/5
 */
@Entity
@Table(name = "tb1_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name",length = 5)
    private String username;

    @Column(name = "pass_word")
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
