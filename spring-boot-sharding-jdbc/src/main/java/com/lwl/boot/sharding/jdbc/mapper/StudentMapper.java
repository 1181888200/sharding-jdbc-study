package com.lwl.boot.sharding.jdbc.mapper;

import java.util.List;

import com.lwl.boot.sharding.jdbc.entity.Student;

public interface StudentMapper {  
    
    Integer insert(Student s);  
      
    List<Student> findAll();  
      
    List<Student> findByStudentIds(List<Integer> studentIds);  
  
}  