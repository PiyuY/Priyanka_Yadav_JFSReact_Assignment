package com.priyanka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao dao;

//	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/priyanka/Beans.xml");
//	EmployeeDao dao = (EmployeeDao) context.getBean("empdao");

	@RequestMapping("/{pageid}")
	public ModelAndView getEmployeeView(@PathVariable("pageid") int pageid) {
		int total = 5;
		int startRecord;
		if (pageid == 1) {
			startRecord = 1;
		} else {
			startRecord = (pageid - 1) * total + 1;
		}
		
		List<Employee> emplist = dao.getEmployeesByPage(startRecord, total);
		
		ModelAndView mv = new ModelAndView("ShowEmployees.jsp");
		mv.addObject("emplist", emplist);
		return mv;
	}
	
//	public String getEmployeeView(@PathVariable("pageid") int pageid, Model m) {
//		int total = 5;
//		int startRecord;
//		if (pageid == 1) {
//			startRecord = 1;
//		} else {
//			startRecord = (pageid - 1) * total + 1;
//		}
//
//		List<Employee> emplist = dao.getEmployeesByPage(startRecord, total);
//
////		ModelAndView mv = new ModelAndView("ShowEmployees.jsp");
////		mv.addObject("emplist", emplist);
//		System.out.println(emplist);
//		m.addAttribute("emplist", emplist);
//		return "ShowEmployees.jsp";
//	}

}
