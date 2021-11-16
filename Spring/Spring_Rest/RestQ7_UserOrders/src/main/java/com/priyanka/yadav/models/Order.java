package com.priyanka.yadav.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Order")
public class Order {
	private String userId;
	@Id
	private String orderId;
	private double amount;

	public Order(String userId, String orderId, double amount) {
		super();
		this.userId = userId;
		this.orderId = orderId;
		this.amount = amount;
	}

	public Order(String userId, double amount) {
		super();
		this.userId = userId;
		this.amount = amount;
	}
	
	public Order() {
	}

	@Override
	public String toString() {
		return "Order [userId=" + userId + ", orderId=" + orderId + ", amount=" + amount + "]";
	}

	public String getUserId() {
		return userId;
	}

	public String getOrderId() {
		return orderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
