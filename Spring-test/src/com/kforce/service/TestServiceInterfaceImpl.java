package com.kforce.service;

import org.springframework.stereotype.Component;

@Component
public class TestServiceInterfaceImpl implements TestServiceInterface{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("this is a test");
	}

}
