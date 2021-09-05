package com.tongji.demo.annotation;

import org.springframework.web.bind.annotation.ResponseBody;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhangchunyuan
 * @date 2021/9/2 9:22 下午
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ResponseBody
public @interface AjaxResponse {
    int successCode() default 200;

    int failCode() default 500;

    String failMsg() default "操作失败";
}
