package com.priyanka;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginValidationController {
	
	@RequestMapping("/")
	public String landingPage() {
	
		return "Login.jsp";
	
	}
	
	
	@RequestMapping("/authenticateUser")
	public ModelAndView validateUser(@ModelAttribute("user") User userObj) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/priyanka/bean.xml");
		UserDao userdao = (UserDao) context.getBean("udao");
		
		// get user from database
		User resultUser = userdao.getUserByUsername(userObj);
		
		String uname = userObj.getUsername();
		String pass = userObj.getPassword();
		
		ModelAndView mv = new ModelAndView();
		
		if(uname.equals(resultUser.getUsername()) && pass.equals(resultUser.getPassword())) {
			 mv.setViewName("Success.jsp");
		} else {
			mv.setViewName("Error.jsp");
		}
		
		context.close();
		return mv;
		
	}
}
