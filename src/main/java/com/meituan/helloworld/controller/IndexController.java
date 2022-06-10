package com.meituan.helloworld.controller;

import com.meituan.helloworld.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 1hong
 * @create 2022 - 06 - 10 -18:22
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello,meituan";
    }
}
