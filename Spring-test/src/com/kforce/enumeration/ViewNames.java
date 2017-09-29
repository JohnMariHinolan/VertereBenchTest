package com.kforce.enumeration;

public enum ViewNames {

	LOGIN("login"),
	HOME("home"),
	WELCOME("Welcome"),
	REGISTRATION("registration");
	;
	
	String var;
	private ViewNames(String var) {
		this.var = var;
		
	}
	
	public String getViewName() {
		return this.var;
	}
	
}
