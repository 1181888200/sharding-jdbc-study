package com.lwl.boot.controller;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.boot.sharding.jdbc.entity.User;
import com.lwl.boot.sharding.jdbc.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Resource  
    public UserService userService;  
	
	@RequestMapping("/add")
    public String add(String name,Integer userId,Integer age) {  
	    User u = new User();  
	    u.setUserId(userId);  
	    u.setAge(age);  
	    u.setName(name);
	    
	    try {
			userService.insert(u);
		} catch (Exception e) {
			return e.getMessage();
		}
	    return u.toString();
    }  
	
	@RequestMapping("/all")
	public List<User> all(){
		 List<User> users = userService.findAll();  
		 return users;
	}
	
	@RequestMapping("/users")
	public List<User> users(){
		 List<User> users = userService.findByUserIds(Arrays.asList(2,10,1));  
		return users;
	}
	
	/**
	 * 事务成功
	 */
	@RequestMapping("/tx-yes")
	public String transactionTestSucess() {
		String msg = "事务成功";
		try {
			userService.transactionTestSucess();  
		} catch (Exception e) {
			e.printStackTrace();
			msg = e.getMessage();
		}  
		return msg;
	}
	
	/**
	 * 事务失败
	 */
	@RequestMapping("/tx-no")
	public String transactionTestFailure() {
		String msg = "事务成功";
		try {
			userService.transactionTestFailure();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			msg = e.getMessage();
		}  
		
		return msg;
	}
	
}
