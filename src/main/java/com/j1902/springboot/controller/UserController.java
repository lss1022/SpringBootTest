package com.j1902.springboot.controller;

import com.j1902.springboot.pojo.User;
import com.j1902.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user, HttpSession session) {
        if(user == null || user.getUsername() == null || user.getSex() == null){
            return "redirect:index";
        }
        if (userService.login(user)) {
            session.setAttribute("userInfo",user);
            return "home";
        } else {
            return "redirect:index";
        }
    }

    @RequestMapping("/index")
    public String index(User user, HttpSession session) {
        return "index";
    }

    @RequestMapping("/home")
    public String home(User user, HttpSession session) {
        return "home";
    }
}
