package com.qf.utils;

import org.aspectj.lang.ProceedingJoinPoint;

public class Trans2 {
    public void before(){
        System.out.println("前置");
    }

    public void after(){
        System.out.println("after");
    }

    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        proceedingJoinPoint.proceed();//method.invoke
        System.out.println("环绕后");
    }
    public void afterReturning(){
        System.out.println("afterReturning");
    }
    public void afterThrowing(){
        System.out.println("异常抛出之后");
    }
}
