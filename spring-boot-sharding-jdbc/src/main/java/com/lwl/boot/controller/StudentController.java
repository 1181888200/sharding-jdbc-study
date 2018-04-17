package com.lwl.boot.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.boot.sharding.jdbc.entity.Student;
import com.lwl.boot.sharding.jdbc.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	
    @Resource  
    public StudentService studentService;  
	
    
    @RequestMapping("/add")
    public String add(String name,Integer age,Integer studentId) {  
        Student student = new Student();  
        student.setStudentId(studentId);  
        student.setAge(age);  
        student.setName(name);  
        
        try {
			studentService.insert(student);
		} catch (Exception e) {
			return e.getMessage();
		}
        
        return student.toString();
    } 
    
}
