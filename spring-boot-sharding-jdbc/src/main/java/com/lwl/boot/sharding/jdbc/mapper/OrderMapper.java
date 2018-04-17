package com.lwl.boot.sharding.jdbc.mapper;

import java.util.List;

import com.lwl.boot.sharding.jdbc.entity.Order;

public interface OrderMapper {

	void insert(Order order);
	
	Order findById(Long orderId);
	
	List<Order> find();
	
}
