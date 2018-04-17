package com.lwl.boot.sharding.jdbc.service;

import java.util.List;

import com.lwl.boot.sharding.jdbc.entity.Order;

public interface OrderService {

	void insert(Order order);
	
	Order findById(Long id);
	
	List<Order> find();
	
}
