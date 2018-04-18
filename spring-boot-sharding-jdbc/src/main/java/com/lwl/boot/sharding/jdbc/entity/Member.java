package com.lwl.boot.sharding.jdbc.entity;

import java.io.Serializable;

/**
 * 实现 单库中  插入数据同时写入到多张表中
 *
 */
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	//ID 分布式下通过UUID生成唯一主键
	private String id;
	
	private String name;
	//策略，用于分库分表
	private Long strategy;
	
	private String card;

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getStrategy() {
		return strategy;
	}

	public void setStrategy(Long strategy) {
		this.strategy = strategy;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}
	
}
