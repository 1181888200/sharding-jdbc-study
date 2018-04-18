package com.lwl.boot.sharding.jdbc.entity;

import java.io.Serializable;

/**
 * 交易记录
 *
 *	模拟多库中，根据交易流水号同时写入不同库的相同表中
 *
 */
public class TradeRecord implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//分布式中，通过UUID实现主键唯一
	private String id;
	
	private long tradeId;
	
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getTradeId() {
		return tradeId;
	}

	public void setTradeId(long tradeId) {
		this.tradeId = tradeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
