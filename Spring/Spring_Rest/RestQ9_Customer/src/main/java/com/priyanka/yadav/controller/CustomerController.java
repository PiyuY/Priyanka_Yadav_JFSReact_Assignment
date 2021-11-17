package com.priyanka.yadav.controller;

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

import com.priyanka.yadav.model.Customer;
import com.priyanka.yadav.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerRepository cRepo;
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer emp){
		Customer e = cRepo.save(emp);
		return e;
	}
	
	@GetMapping("/find/{id}")
	public Optional<Customer> searchCustomerById(@PathVariable("id") String id){
		Optional<Customer> e = cRepo.findById(id);
		return e;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCustomerById(@PathVariable("id") String id){
		cRepo.deleteById(id);
		return "Customer " + id + " deleted!";
	}
	
	@GetMapping("/findall")
	public List<Customer> findCustomers(){		
		return (List<Customer>) cRepo.findAll();
	}
	
	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer emp){
		Customer e = cRepo.save(emp);
		return e;
	}
	
}
