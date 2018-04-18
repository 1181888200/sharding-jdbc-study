package com.lwl.boot.sharding.jdbc.service;

import java.util.List;

import com.lwl.boot.sharding.jdbc.entity.Member;

public interface MemberService {

	void insert(Member member);
	
	void delById(String id);
	
	/**
	 * 通过ID 查询可能查询到多个相同的记录
	 * 	如果想查询出一条，请直接修改数据库中ID，使其在t_member三张表中唯一即可
	 * @param id
	 * @return
	 */
	Member findById(String id);
	
	void upd(Member member);
	
	List<Member> findAll();
	
}
