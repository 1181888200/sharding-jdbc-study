package com.lwl.boot.sharding.jdbc.service.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lwl.boot.sharding.jdbc.entity.Member;
import com.lwl.boot.sharding.jdbc.mapper.MemberMapper;
import com.lwl.boot.sharding.jdbc.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Resource
	private MemberMapper memberMapper;
	
	@Override
	public void insert(Member member) {
		member.setId(UUID.randomUUID().toString());
		memberMapper.insert(member);
	}

	@Override
	public void delById(String id) {
		memberMapper.delById(id);
	}

	@Override
	public Member findById(String id) {
		return memberMapper.findById(id);
	}

	@Override
	public void upd(Member member) {
		memberMapper.upd(member);		
	}

	@Override
	public List<Member> findAll() {
		return memberMapper.findAll();
	}

}
