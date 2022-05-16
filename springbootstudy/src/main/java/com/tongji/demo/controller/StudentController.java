package com.tongji.demo.controller;

import com.tongji.demo.annotation.AjaxResponse;
import com.tongji.demo.bean.Person;
import com.tongji.demo.service.service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


/**
 * @author zhangchunyuan
 * @date 2021/8/27 4:19 下午
 */
@Slf4j
//@RestController
@Controller
@RequestMapping(value = "/h",produces = "application/json;charset=UTF-8")
public class StudentController {

/*    @Autowired
    private StudentService studentService;*/
    @Autowired
    private List<service> service;

    @AjaxResponse
    @GetMapping("/addUser")
    public String addUser(){
        for (com.tongji.demo.service.service studentService : service) {
            Person person = new Person();
            person.setId(1);
            person.setBirthday(new Date());
            person.setSexy("nan");
            studentService.addUser(person);
        }

        return "Hello World!";
    }

    // 重定向
    @GetMapping("red")
    public String testRed(){
        return "redirect:blue";
    }
    @GetMapping("blue")
    @ResponseBody
    public String testBlue(){
        return "blue";
    }



}
