package com.kforce.pojo;
import org.springframework.stereotype.Component;

@Component
//@Scope(value=WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class WelcomePage {

	private String message;
		private boolean isLogin = false;
	private Student student;
		
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public boolean isLogin() {
		return isLogin;
	}
	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

//	@Override
//	public void onApplicationEvent(ApplicationEvent arg0) {
//		String spy = arg0.getSource().toString();
//		System.out.println("Spy : " + spy);
//		// TODO Auto-generated method stub
//		//System.out.println("The bean is initialized or refreshed!");
//	}
	
}
