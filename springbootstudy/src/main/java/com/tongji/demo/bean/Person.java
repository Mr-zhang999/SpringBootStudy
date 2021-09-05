package com.tongji.demo.bean;


import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * @author zhangchunyuan
 * @date 2021/8/27 3:33 下午
 */
@Data
@EntityScan
public class Person {

    private int Id;
    private String name;
    private Date birthday;
    private String sexy;
}
