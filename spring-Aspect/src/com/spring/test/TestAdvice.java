package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.IComponent;

public class TestAdvice {
public static void main(String[] args) {
	ApplicationContext source =
			new ClassPathXmlApplicationContext("/advice.xml");
	IComponent component = (IComponent) source.getBean("proxy");
	component.bussiness1();
	component.bussiness2();
	component.bussiness3();
	
	
}
}
