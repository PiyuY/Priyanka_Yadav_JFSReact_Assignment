package com.priyanka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hiiMessage")
	public String add() {
	
		return "helloWorld.jsp";
	
	}
}
