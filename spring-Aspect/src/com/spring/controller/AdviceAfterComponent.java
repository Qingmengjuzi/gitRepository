package com.spring.controller;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AdviceAfterComponent implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("通知用户已经执行。。。");
	}

}
