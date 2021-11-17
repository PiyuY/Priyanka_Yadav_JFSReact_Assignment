package com.priyanka.yadav.repository;

import org.springframework.data.repository.CrudRepository;

import com.priyanka.yadav.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String> {
	
}