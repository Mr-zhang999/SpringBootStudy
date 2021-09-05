package com.tongji.demo.controller;

import com.alibaba.fastjson.JSON;
import com.tongji.demo.bean.VisitBase;
import com.tongji.demo.utils.UtilsTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@Component
@RequestMapping(value = "/resource",produces = "application/json;charset=UTF-8")
public class VisitTest {
    @Autowired
    private final ApplicationContext applicationContext;
    @Autowired
    public VisitTest(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
    @Autowired
    private UtilsTest utilsTest;
    @GetMapping("/hello")
    public String hello(){
        utilsTest.print();
       // applicationContext.publishEvent(new EventDemo(this, 1L,"123"));
        return "Hello World!";
    }
    @PostMapping("/hello/{str}")
    public String hello(@PathVariable(name = "str") String str1){
        return str1+"Hello World!";
    }


    @PostMapping("/createOrUpdate")
    public String hello1(@RequestBody VisitBase visitBase){
        /*@RequestParam VisitBase visitBase*/
        log.info(visitBase.toString());
        VisitBase vb = new VisitBase();
        vb.setVisitType(visitBase.getVisitType());
        vb.setAccountId(visitBase.getAccountId());
        vb.setStatus(visitBase.getStatus());
        vb.setContent("返回的");
        vb.setShopIds(visitBase.getShopIds());

        return JSON.toJSONString(vb);
       // return "hhhh";
    }
}
