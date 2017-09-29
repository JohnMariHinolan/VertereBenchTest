package com.kforce.security;

public class SimpleUsernamePassword implements SecurityInfo{
			
	private String username;
	private String password;
	private String confirmPassword;
	
	
	

	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object arg) {
		if(!(arg instanceof SimpleUsernamePassword)) {
			return false;
		}
		
		SimpleUsernamePassword simpleUsernamePassword = (SimpleUsernamePassword) arg;
		
		return true;
	}
	

}
