package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.IComponent;

public class TestAroundAdvice {

	public static void main(String[] args) {
		ApplicationContext source =
				new ClassPathXmlApplicationContext("/AroundAdvice.xml");
		IComponent component = (IComponent) source.getBean("proxy");
		String bussiness1 = component.bussiness1();
		System.out.println("-----"+bussiness1);
		//component.bussiness2();
		//component.bussiness3();
		
		
	}



}
