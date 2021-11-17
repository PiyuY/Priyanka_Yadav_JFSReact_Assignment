package com.priyanka.yadav.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	// for placing order
	// Ex. POST http://localhost:10003/order/placeOrder/104/5000
	@PostMapping("/placeOrder/{userid}/{amt}")
	public String placeOrder(@PathVariable("userid") String userId, @PathVariable("amt") double amount) {
		orepo.save(new Order(userId, amount));
		return "Order Placed!";
	}
	
	// Update Specific Order Amount
	// Ex. PUT http://localhost:10003/order/updateOrder/7/2000
	@PutMapping("/updateOrder/{orderid}/{amt}")
	public String updateOrder(@PathVariable("orderid") String orderId, @PathVariable("amt") double amount) {
		Order orderToUpdate = orepo.getOrderByOrderId(orderId);
		if(orderToUpdate != null) {
			orderToUpdate.setAmount(amount);
			orepo.save(orderToUpdate);
			return "Order Updated!";
		} else {
			return "Order Not Updated!";
		}
	}
	
	// View Order By Id
	// GET http://localhost:10003/order/viewOrder/7
	@GetMapping("/viewOrder/{orderid}")
	public Optional<Order> viewOrder(@PathVariable("orderid") String orderId) {
		return orepo.findById(orderId);
	}
	
	// view all orders
	// ex. GET http://localhost:10003/order/viewAll
	@GetMapping("/viewAll")
	public List<Order> viewAllOrders() {
		return orepo.findAll();
	}
	
	// for deleting specific order
	// ex. DELETE http://localhost:10003/order/delete/7
	@DeleteMapping("/delete/{orderid}")
	public String deleteOrder(@PathVariable("orderid") String orderId) {
		orepo.deleteById(orderId);
		return "Order deleted.";
	}
}
