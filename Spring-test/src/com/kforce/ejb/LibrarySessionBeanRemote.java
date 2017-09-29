package com.kforce.ejb;

import javax.ejb.Remote;

import com.kforce.pojo.Student;

@Remote
public interface LibrarySessionBeanRemote {
	
	public void addStudent(Student student);
	
	public void listStudent();
	
}
