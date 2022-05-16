package com.tongji.demo.service;

import org.springframework.stereotype.Service;

/*
 * @author ZhangChunyuan
 * @date 2021-12-09 18:33
 */
@Service
public class ServiceImplTest extends ServiceImpl{
    @Override
    public String removeWorld() {
        return "removeWorld";
    }
}
