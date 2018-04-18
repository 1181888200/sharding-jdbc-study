package com.lwl.boot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.boot.sharding.jdbc.entity.Member;
import com.lwl.boot.sharding.jdbc.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {

	@Resource
	private MemberService memberService;
	
	@RequestMapping("/add")
	public String insert(String name,String card,long strategy) {
		Member m = new Member();
		m.setCard(card);
		m.setName(name);
		m.setStrategy(strategy);
		memberService.insert(m);
		return "插入成功";
	}
	
	
	@RequestMapping("/del")
	public String del(String id) {
		memberService.delById(id);
		return "删除成功";
	}
	
	
	
	@RequestMapping("/upd")
	public String upd(String name,String card,String id) {
		Member m = new Member();
		m.setCard(card);
		m.setName(name);
		m.setId(id);
		memberService.upd(m);
		return "更新成功";
	}
	
	
	@RequestMapping("/id")
	public Member id(String id) {
		Member m = memberService.findById(id);
		return m;
	}
	
	
	@RequestMapping("/list")
	public List<Member> list() {
		List<Member> m = memberService.findAll();
		return m;
	}
	
	
	
	
}
