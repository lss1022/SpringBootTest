package com.j1902.springboot.service.impl;

import com.j1902.springboot.mapper.UserMapper;
import com.j1902.springboot.pojo.User;
import com.j1902.springboot.pojo.UserExample;
import com.j1902.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(User user) {

        UserExample example = new UserExample();
        UserExample.Criteria or = example.or();
        or.andUsernameEqualTo(user.getUsername());
        List<User> users = userMapper.selectByExample(example);

        if (users == null || users.size() == 0) {
            return false;
        }

        return users.get(0).getSex().equals(user.getSex());
    }
}
