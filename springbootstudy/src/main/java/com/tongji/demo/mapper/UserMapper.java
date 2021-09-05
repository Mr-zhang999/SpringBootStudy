package com.tongji.demo.mapper;

import com.tongji.demo.bean.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhangchunyuan
 * @date 2021/8/27 3:32 下午
 */
@Mapper
public interface UserMapper {
    void addUser(Person student);
}
