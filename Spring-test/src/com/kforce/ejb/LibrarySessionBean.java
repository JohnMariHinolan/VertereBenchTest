package com.kforce.ejb;

import java.util.List;

import javax.ejb.Stateless;

import com.kforce.pojo.Student;

@Stateless
public class LibrarySessionBean implements LibrarySessionBeanRemote{

	private List<Student> studentList;
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentList.add(student);
	}

	@Override
	public void listStudent() {
		// TODO Auto-generated method stub
		for(Student student : studentList) {
			
			System.out.println(student.toString());	
			
		}
	}

}
