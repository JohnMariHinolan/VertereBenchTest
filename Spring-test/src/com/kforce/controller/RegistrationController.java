package com.kforce.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kforce.enumeration.ViewNames;
import com.kforce.errorhandling.ErrorManager;
import com.kforce.errorhandling.ErrorObject;
import com.kforce.pojo.Student;
import com.kforce.pojo.WelcomePage;
import com.kforce.service.UserService;
import com.kforce.singleton.ApplicationContextUtil;

//import jbr.springmvc.model.User;
//import jbr.springmvc.service.UserService;
@Controller
public class RegistrationController {

	List<Student> studentList;

	@Autowired
	UserService userService;
	
	@RequestMapping("")
	public ModelAndView printWelcome(ModelMap model) {
		// code
		long timeMillis = System.currentTimeMillis();
				
		WelcomePage welcomePage = (WelcomePage)ApplicationContextUtil.getBean(WelcomePage.class);

		welcomePage.setMessage("Welcome ");
		String viewName = "" ;
		boolean isLogin = welcomePage.isLogin();
		if (isLogin) {
			viewName = ViewNames.WELCOME.getViewName();
			welcomePage.setMessage("Welcome " + welcomePage.getStudent().getLastName());
		} else {
			viewName = ViewNames.HOME.getViewName();
		}
		ModelAndView mav = new ModelAndView(viewName);

		mav.addObject("start", welcomePage);

	    System.out.println("Welcome page initialization time : " +(System.currentTimeMillis() - timeMillis) + " milliseconds");
		return mav;
	}

	@RequestMapping("/registrationProcess")
	public ModelAndView registerStudent(@Valid @ModelAttribute("studentRegistration") Student student,BindingResult result,@RequestParam String secretKey) {
		
		if(result.hasErrors()) {
			System.out.println("Result has errors");
		}else {
			System.out.println("Secret key is " + secretKey);
			System.out.println("Hablo no errors");
		}
		String returnPage = "registration";
		String confirmPassword = student.getSimpleUsernamePassword().getConfirmPassword();
		String password = student.getSimpleUsernamePassword().getPassword();
		
		System.out.println(confirmPassword);
		System.out.println(password);

		
		boolean isPasswordMatch = userService.verifyPasswordMatch(password, confirmPassword);
		ErrorManager errorManager = new ErrorManager();
		
		if (isPasswordMatch) {
			// change return page
			
		}else {
			ErrorObject errorObj = new ErrorObject("001", "The passwords didn't match");
			errorManager.add(errorObj);
			
		}
		
		ModelAndView mav = new ModelAndView(returnPage);

		mav.addObject("studentForm", new Student());

		mav.addObject("message", errorManager.toString());
		
		return mav;
	}


	@RequestMapping("register")
	public ModelAndView registerPage() {
		ModelAndView mav = new ModelAndView("registration");
		mav.addObject("studentForm", new Student());
		return mav;
	}
}
