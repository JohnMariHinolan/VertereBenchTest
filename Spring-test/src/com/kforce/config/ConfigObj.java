package com.kforce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.kforce.pojo.Login;
import com.kforce.pojo.WelcomePage;

@Configuration
public class ConfigObj {

	
	private String msgTest;
	
	@Bean
	@Scope("session")
	public String getMsgTest() {
		msgTest = System.currentTimeMillis() + "";
		return msgTest;
	}
	
	@Bean	
	@Scope("session")
	public WelcomePage getWelcomePage() {
		
		return new WelcomePage();
	}
	
	@Bean 
	@Scope("prototype")
	public Login getLoginPage() {
		
		return new Login();
	}
	
	
	
	
}
