package com.kforce.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.kforce.config.ConfigObj;
import com.kforce.enumeration.ViewNames;
import com.kforce.pojo.Login;
//import jbr.springmvc.model.User;
//import jbr.springmvc.service.UserService;
@Controller
public class LoginController {

	 @RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
	    
			AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
			ctx.register(ConfigObj.class);
			ctx.refresh();
			Login loginObj = (Login) ctx.getBean(Login.class);
 
		 
		 
		ModelAndView mav = new ModelAndView(ViewNames.LOGIN.getViewName());
	    mav.addObject("login", loginObj);
	   
//	    getDefaultLoginPage() ;
//		WelcomePage welcomePage = (WelcomePage)ctx.getBean(WelcomePage.class);
//		welcomePage.setLogin(true);
//		welcomePage.setName("JMx");
	    
		ctx.close();
	    return mav;
	  }
	 
	 // test working
//	 @ModelAttribute("loginTest")
//	 private Login getDefaultLoginPage() {
//		 
//		 Login login = new Login();
//		 login.setLoginMsg("Model Attribute Test");
//		 return login;
//	 }
	 
	 @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("login") Login login) {
	    ModelAndView mav = null;
	    
	    System.out.println("Username: " + login.getUsername());
	    System.out.println("Password: " + login.getPassword());
	  //  User user = userService.validateUser(login);
//	    if (null != user) {
//	    mav = new ModelAndView("welcome");
//	    mav.addObject("firstname", user.getFirstname());
//	    } else {
//	    mav = new ModelAndView("login");
//	    mav.addObject("message", "Username or Password is wrong!!");
//	    }
	    return mav;
	  } 
	 
	 
}
