package com.lwl.boot.sharding.jdbc.service;

import java.util.List;

import com.lwl.boot.sharding.jdbc.entity.Member;

public interface MemberService {

	void insert(Member member);
	
	void delById(String id);
	
	Member findById(String id);
	
	void upd(Member member);
	
	List<Member> findAll();
	
}
