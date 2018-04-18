package com.lwl.boot.sharding.jdbc.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lwl.boot.sharding.jdbc.entity.TradeRecord;
import com.lwl.boot.sharding.jdbc.mapper.TradeRecordMapper;
import com.lwl.boot.sharding.jdbc.service.TradeRecordService;

@Service
public class TradeRecordServiceImpl implements TradeRecordService {

	@Resource
	private TradeRecordMapper treadRecordMapper;
	
	@Override
	public void add(TradeRecord record) {
		//此处只做模拟
		record.setId(UUID.randomUUID().toString());
		treadRecordMapper.add(record);		
	}

	@Override
	public void del(String id) {
		treadRecordMapper.del(id);		
	}

	@Override
	public List<TradeRecord> findAll() {
		return treadRecordMapper.findAll();
	}

	@Override
	public List<TradeRecord> findById(String id) {
		return treadRecordMapper.findById(id);
	}

}
