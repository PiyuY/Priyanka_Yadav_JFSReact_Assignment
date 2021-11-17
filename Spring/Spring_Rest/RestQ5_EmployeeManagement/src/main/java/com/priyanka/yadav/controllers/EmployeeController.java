package com.priyanka.yadav.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyanka.yadav.models.Employee;
import com.priyanka.yadav.repositories.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository eRepo;
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp){
		Employee e = eRepo.save(emp);
		return e;
	}
	
	@GetMapping("/find/{id}")
	public Optional<Employee> searchEmployeeById(@PathVariable("id") String id){
		Optional<Employee> e = eRepo.findById(id);
		return e;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployeeById(@PathVariable("id") String id){
		eRepo.deleteById(id);
		return "Employee " + id + " deleted!";
	}
	
	@GetMapping("/findall")
	public List<Employee> findEmployees(){		
		return (List<Employee>) eRepo.findAll();
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp){
		Employee e = eRepo.save(emp);
		return e;
	}
}
