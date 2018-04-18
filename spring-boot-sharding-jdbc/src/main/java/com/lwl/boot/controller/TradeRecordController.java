package com.lwl.boot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.boot.sharding.jdbc.entity.TradeRecord;
import com.lwl.boot.sharding.jdbc.service.TradeRecordService;

@RestController
@RequestMapping("/tradeRecord")
public class TradeRecordController {

	@Resource
	private TradeRecordService tradeRecordService;
	
	@RequestMapping("/add")
	public String add(String name,long tradeId) {
		TradeRecord info = new TradeRecord();
		info.setName(name);
		info.setTradeId(tradeId);
		tradeRecordService.add(info);
		return "插入成功";
	}
	
	
	@RequestMapping("/del")
	public String del(String id) {
		tradeRecordService.del(id);
		return "删除成功";
	}
	
	
	@RequestMapping("/id")
	public List<TradeRecord> id(String id) {
		return tradeRecordService.findById(id);
	}
	
	@RequestMapping("/list")
	public List<TradeRecord> list() {
		return tradeRecordService.findAll();
	}
	
	
	
	
}
