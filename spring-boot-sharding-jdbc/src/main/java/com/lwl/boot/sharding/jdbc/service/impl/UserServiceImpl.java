package com.lwl.boot.sharding.jdbc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lwl.boot.sharding.jdbc.entity.Student;
import com.lwl.boot.sharding.jdbc.entity.User;
import com.lwl.boot.sharding.jdbc.mapper.StudentMapper;
import com.lwl.boot.sharding.jdbc.mapper.UserMapper;
import com.lwl.boot.sharding.jdbc.service.UserService;

@Service  
@Transactional(value="transactionManager",rollbackFor=java.lang.Exception.class)  
public class UserServiceImpl implements UserService {

	   @Resource  
	    public UserMapper userMapper;  
	      
	    @Resource  
	    public StudentMapper studentMapper;  
	  
	    public boolean insert(User u) {  
	        return userMapper.insert(u) > 0 ? true :false;  
	    }  
	  
	    public List<User> findAll() {  
	        return userMapper.findAll();  
	    }  
	  
	    public List<User> findByUserIds(List<Integer> ids) {  
	        return userMapper.findByUserIds(ids);  
	    }  
	  
	    @Transactional(propagation=Propagation.REQUIRED)  
	    public void transactionTestSucess() {  
	        User u = new User();  
	        u.setUserId(13);  
	        u.setAge(25);  
	        u.setName("war3 1.27");  
	        userMapper.insert(u);  
	          
	        Student student = new Student();  
	        student.setStudentId(21);  
	        student.setAge(21);  
	        student.setName("hehe");  
	        studentMapper.insert(student);  
	    }  
	  
	    public void transactionTestFailure() throws IllegalAccessException {  
	        User u = new User();  
	        u.setUserId(13);  
	        u.setAge(25);  
	        u.setName("异常....1111");  
	        userMapper.insert(u);  
	          
	        Student student = new Student();  
	        student.setStudentId(21);  
	        student.setAge(21);  
	        student.setName("异常....1111");  
	        studentMapper.insert(student);  
	        throw new IllegalAccessException();  
	    }  
	      
	
}
