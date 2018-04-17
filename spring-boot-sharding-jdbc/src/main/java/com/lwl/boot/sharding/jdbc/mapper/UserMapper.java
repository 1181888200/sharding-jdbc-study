package com.lwl.boot.sharding.jdbc.mapper;

import java.util.List;

import com.lwl.boot.sharding.jdbc.entity.User;

public interface UserMapper {

	Integer insert(User u);  
    
    List<User> findAll();  
      
    List<User> findByUserIds(List<Integer> userIds);  
      
	
}
