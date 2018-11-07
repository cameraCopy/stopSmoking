package com.xjxy.webservce.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 * @author liwei
 * @date 2018/10/23 10:02
 **/
@Controller
public class Index {

    @RequestMapping("/index")
    public String index(){
        return "index.html";
    }
    @RequestMapping("/home/home")
    public String home(){
        return "home.html";
    }
}
