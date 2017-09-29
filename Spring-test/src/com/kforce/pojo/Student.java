package com.kforce.pojo;

import com.kforce.security.SimpleUsernamePassword;

//POJO
public class Student extends Person{

	private String id;
	private String gender;
	private String aboutYou;
	
	
	public String getAboutYou() {
		return aboutYou;
	}
	public void setAboutYou(String aboutYou) {
		this.aboutYou = aboutYou;
	}

	private SimpleUsernamePassword simpleUsernamePassword;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public SimpleUsernamePassword getSimpleUsernamePassword() {
		return simpleUsernamePassword;
	}
	public void setSimpleUsernamePassword(SimpleUsernamePassword simpleUsernamePassword) {
		this.simpleUsernamePassword = simpleUsernamePassword;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + this.getLastName() + ", id=" + id + ", gender=" + gender + "]";
	}
	
	
}
