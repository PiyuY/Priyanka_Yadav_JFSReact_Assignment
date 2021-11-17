package com.priyanka.yadav.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Customer")
public class Customer {
	@Id
	private String customerId;
	private String customerName;
	private String customerContactNo;
	private String customerCity;
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContactNo="
				+ customerContactNo + ", customerCity=" + customerCity + "]";
	}

	public Customer(String customerName, String customerContactNo, String customerCity) {
		super();
		this.customerName = customerName;
		this.customerContactNo = customerContactNo;
		this.customerCity = customerCity;
	}

	public String getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerContactNo() {
		return customerContactNo;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerContactNo(String customerContactNo) {
		this.customerContactNo = customerContactNo;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
}
