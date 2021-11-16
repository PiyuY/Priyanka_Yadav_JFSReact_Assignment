package com.priyanka.yadav.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyanka.yadav.models.Order;
import com.priyanka.yadav.repositories.OrderRepository;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderRepository orepo;
	
	@PostMapping("/addData")
	public void addData() {
		orepo.save(new Order("100","1",400.76));
		orepo.save(new Order("101","2",600.80));
		orepo.save(new Order("102","3",200.76));
		orepo.save(new Order("100","4",890.76));
		orepo.save(new Order("102","5",200.76));
		orepo.save(new Order("100","6",900.76));
		orepo.save(new Order("100","7",4500));
		System.out.println("DATA ADDED TO DATABASE.....");
	}
	
	@PostMapping("/placeOrder/{userid}/{amt}")
	public String placeOrder(@PathVariable("userid") String userId, @PathVariable("amt") double amount) {
		orepo.save(new Order(userId, amount));
		return "Order PLaced!";
	}
	
	
	@PutMapping("/updateOrder/{orderid}/{amt}")
	public String uppdateOrder(@PathVariable("orderid") String orderId, @PathVariable("amt") double amount) {
		Order orderToUpdate = orepo.getOrderByOrderId(orderId);
		if(orderToUpdate != null) {
			orderToUpdate.setAmount(amount);
			orepo.save(orderToUpdate);
			return "Order Updated!";
		} else {
			return "Order Not Updated!";
		}
		
		
	}
}
