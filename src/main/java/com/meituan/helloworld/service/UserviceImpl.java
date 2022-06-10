package com.meituan.helloworld.service;

import com.meituan.helloworld.bean.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 1hong
 * @create 2022 - 06 - 10 -18:52
 */
@Component
public class UserviceImpl implements UserService{

    @Override
    public List<User> queryUserList() {
        List<User> result = new ArrayList<User>();
        // 模拟数据库的查询
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("username_" + i);
            user.setAge(i);
            result.add(user);
        }
        return result;
    }
}
