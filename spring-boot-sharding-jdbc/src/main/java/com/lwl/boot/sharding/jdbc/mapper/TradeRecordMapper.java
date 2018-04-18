package com.lwl.boot.sharding.jdbc.mapper;

import java.util.List;

import com.lwl.boot.sharding.jdbc.entity.TradeRecord;

public interface TradeRecordMapper {

	void add(TradeRecord record);
	
	void del(String id);
	
	List<TradeRecord> findAll();
	
	List<TradeRecord> findById(String id);
	
}
