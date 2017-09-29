package com.kforce.service;

public class UserService {

	// dao should be here
	boolean isCaseSensitive = false;
	
	public boolean verifyPasswordMatch(String password, String confirmPassword) {
		
		if(isStringNullOrEmpty(password) || isStringNullOrEmpty(confirmPassword)) {
			
			return false;
		}
		
		
		if(isCaseSensitive) {
			if(password.equalsIgnoreCase(confirmPassword)) {
				return true;
			}else {
				return false;
			}
		}
		
		if(password.equals(confirmPassword)) {
			return true;
		}
		
		
		return false;
	}
	
	
	private boolean isStringNullOrEmpty(String valid) {
		
		if(valid == null || valid.isEmpty()) {
			return true;
		}
		
		return false;
	}
	
}
