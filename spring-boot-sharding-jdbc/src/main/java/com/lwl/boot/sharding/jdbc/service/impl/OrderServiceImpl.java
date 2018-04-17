package com.lwl.boot.sharding.jdbc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lwl.boot.sharding.jdbc.entity.Order;
import com.lwl.boot.sharding.jdbc.mapper.OrderMapper;
import com.lwl.boot.sharding.jdbc.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Resource
	private OrderMapper orderMapper;
	
	@Override
	public void insert(Order order) {
		orderMapper.insert(order);
	}

	@Override
	public Order findById(Long id) {
		return orderMapper.findById(id);
	}

	@Override
	public List<Order> find() {
		return orderMapper.find();
	}

}
