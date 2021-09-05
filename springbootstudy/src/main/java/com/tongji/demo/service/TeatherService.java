package com.tongji.demo.service;

import com.tongji.demo.bean.Person;
import com.tongji.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangchunyuan
 * @date 2021/9/1 10:41 下午
 */
@Service
public class TeatherService implements service {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(Person person) {
        person.setName("teacher");
        userMapper.addUser(person);
    }
}
