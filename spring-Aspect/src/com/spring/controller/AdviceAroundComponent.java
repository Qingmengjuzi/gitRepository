package com.spring.controller;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AdviceAroundComponent implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("用户验证。。。");
		Object result = null;
		try {
			result = arg0.proceed();
		} finally {
			// TODO: handle finally clause
			CharSequence subSequence = result.toString().subSequence(0, 1);
			System.out.println(subSequence);
			System.out.println("通知用户已经执行");
		}
		//System.out.println("通知用户已经执行");
		// TODO Auto-generated method stub
		//CharSequence subSequence = result.toString().subSequence(0, 1);
		return result;
	}

}
