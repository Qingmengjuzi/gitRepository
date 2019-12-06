package com.spring.service;

public class Component implements IComponent{

	@Override
	public String bussiness1() {
		// TODO Auto-generated method stub
		System.out.println("这是业务1");
		return "这是业务1的返回值";
		
	}

	@Override
	public void bussiness2() {
		// TODO Auto-generated method stub
		System.out.println("这是业务2");
	}

	@Override
	public void bussiness3() {
		// TODO Auto-generated method stub
		System.out.println("这是业务3");
	}

}
