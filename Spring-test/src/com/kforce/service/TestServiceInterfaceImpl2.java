package com.kforce.service;

import org.springframework.stereotype.Component;

@Component("test2")
public class TestServiceInterfaceImpl2 implements TestServiceInterface{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("this is a test again");
	}

}
