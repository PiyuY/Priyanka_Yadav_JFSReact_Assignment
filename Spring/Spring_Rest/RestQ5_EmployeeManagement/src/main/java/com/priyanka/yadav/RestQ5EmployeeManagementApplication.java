package com.priyanka.yadav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class RestQ5EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestQ5EmployeeManagementApplication.class, args);
	}

}
