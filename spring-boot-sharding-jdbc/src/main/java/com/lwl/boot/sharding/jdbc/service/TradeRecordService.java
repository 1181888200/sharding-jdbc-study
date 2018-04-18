package com.lwl.boot.sharding.jdbc.service;

import java.util.List;

import com.lwl.boot.sharding.jdbc.entity.TradeRecord;

public interface TradeRecordService {

	void add(TradeRecord record);
	
	void del(String id);
	
	List<TradeRecord> findAll();
	
	List<TradeRecord> findById(String id);
	
}
