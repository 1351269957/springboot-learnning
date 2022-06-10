package com.meituan.helloworld.service;

import com.meituan.helloworld.bean.User;

import java.util.List;

/**
 * @author 1hong
 * @create 2022 - 06 - 10 -18:52
 */
public interface UserService {
    List<User> queryUserList();
}
