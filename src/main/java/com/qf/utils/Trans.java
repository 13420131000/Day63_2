package com.qf.utils;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


@Aspect
public class Trans {
    @Pointcut(value="execution(* com.qf.service.*.*.*(..))")
    public void point(){

    }

    @Before(value = "point()")
    public void before(){
        System.out.println("before");
    }

    @AfterReturning(value = "point()")
    public void after(){
        System.out.println("after");
    }

    @Around(value = "point()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("around before");
        joinPoint.proceed();
        System.out.println("around after");
    }
}
