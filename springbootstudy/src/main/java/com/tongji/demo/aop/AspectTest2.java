package com.tongji.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author zhangchunyuan
 * @date 2021/8/13 8:44 下午
 */
@Aspect
@Component
public class AspectTest2 {

  //  @Pointcut("execution(* com.tongji.demo.controller.VisitTest.*(..))")
    @Pointcut("execution(* com.tongji.demo.controller.VisitTest.hello1())")
    public void test(){

    }

    @Before("test()")
    public void beforeAdvice() {
        System.out.println("beforeAdvice...");
    }
    @After("test()")
    public void afterAdvice() {
        System.out.println("afterAdvice...");
    }
   // @Around("test()")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        long start = System.currentTimeMillis();
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable t) {
            t.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("oper-time = "+(end-start));
    }
}
