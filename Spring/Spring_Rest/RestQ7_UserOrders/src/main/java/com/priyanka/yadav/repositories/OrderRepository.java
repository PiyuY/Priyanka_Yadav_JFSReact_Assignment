package com.priyanka.yadav.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.priyanka.yadav.models.Order;

public interface OrderRepository extends MongoRepository<Order, String> {

	@Query("{_id:?0}")
	Order getOrderByOrderId(String id);
	
}
