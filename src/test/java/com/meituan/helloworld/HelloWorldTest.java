package com.meituan.helloworld;

import com.meituan.helloworld.bean.User;
import com.meituan.helloworld.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 1hong
 * @create 2022 - 06 - 10 -18:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationLoader.class)
public class HelloWorldTest {
    @Autowired
    private UserService userService;


    @Test
    public void testUserService(){
        List<User> userList = userService.queryUserList();
        for(User user : userList) {
            System.out.println(user.getName() + user.getAge());
        }

    }
}
