package com.priyanka.yadav.repositories;

import org.springframework.data.repository.CrudRepository;

import com.priyanka.yadav.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
}
