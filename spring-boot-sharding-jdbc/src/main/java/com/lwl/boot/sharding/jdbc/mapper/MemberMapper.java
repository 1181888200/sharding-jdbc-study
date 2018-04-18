package com.lwl.boot.sharding.jdbc.mapper;

import java.util.List;

import com.lwl.boot.sharding.jdbc.entity.Member;

public interface MemberMapper {
	
	void insert(Member member);
	
	void delById(String id);
	
	Member findById(String id);
	
	void upd(Member member);
	
	List<Member> findAll();
	
}
