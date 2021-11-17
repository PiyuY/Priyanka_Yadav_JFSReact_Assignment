package com.priyanka.yadav.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Employee")
public class Employee {
	@Id
	private String employeeId;
	private String employeeName;
	private String employeeDepartment;
	private String employeeDesignation;
	private Double employeeSalary;

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepartment="
				+ employeeDepartment + ", employeeDesignation=" + employeeDesignation + ", employeeSalary="
				+ employeeSalary + "]";
	}

	public Employee(String employeeName, String employeeDepartment, String employeeDesignation, Double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

}
