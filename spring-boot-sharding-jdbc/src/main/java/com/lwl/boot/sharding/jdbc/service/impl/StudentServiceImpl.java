package com.lwl.boot.sharding.jdbc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lwl.boot.sharding.jdbc.entity.Student;
import com.lwl.boot.sharding.jdbc.mapper.StudentMapper;
import com.lwl.boot.sharding.jdbc.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Resource  
    public StudentMapper studentMapper;  
	
	@Override
	public boolean insert(Student student) {
		return studentMapper.insert(student) >0 ?true:false;
	}

}
