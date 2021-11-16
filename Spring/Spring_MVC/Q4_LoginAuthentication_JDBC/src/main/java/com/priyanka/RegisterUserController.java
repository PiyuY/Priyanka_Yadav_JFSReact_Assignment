package com.priyanka;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterUserController {

	@RequestMapping("/registration")
	public String registrationPage() {
	
		return "Register.jsp";
	
	}
	
	@RequestMapping("/registerUser")
	public ModelAndView registerUser(@ModelAttribute("user") User userObj) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/priyanka/bean.xml");
		UserDao userdao = (UserDao) context.getBean("udao");
		ModelAndView mv = new ModelAndView();
		try {
				
			int result = userdao.saveUser(userObj);
			
						
			if(result > 0) {
				mv.setViewName("Login.jsp");
				mv.addObject("message", "Registration Successful");
			} else {
				mv.setViewName("Register.jsp");
				mv.addObject("message", "Registration Failed");
			}
		} catch (Exception e) {
			mv.setViewName("Register.jsp");
			mv.addObject("message", "User already exist.");
		}
		return mv;
		
	}
	
}
