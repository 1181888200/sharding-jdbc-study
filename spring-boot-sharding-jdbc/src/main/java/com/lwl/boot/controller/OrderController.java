package com.lwl.boot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.boot.sharding.jdbc.entity.Order;
import com.lwl.boot.sharding.jdbc.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Resource
	private OrderService orderService;
	
	@RequestMapping("/add")
	public String insert(Long userId,Long orderId) {
		Order order = new Order();
		order.setOrderId(orderId);
		order.setUserId(userId);
		orderService.insert(order );
		return "插入成功";
	}
	
	@RequestMapping("/id")
	public Order findById(Long orderId) {
		Order order = orderService.findById(orderId);
		return order;
	}
	
	@RequestMapping("/all")
	public List<Order> find() {
		List<Order> order = orderService.find();
		return order;
	}
	
}
