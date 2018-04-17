package com.lwl.boot;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

import com.lwl.boot.sharding.jdbc.entity.Student;
import com.lwl.boot.sharding.jdbc.entity.User;
import com.lwl.boot.sharding.jdbc.service.StudentService;
import com.lwl.boot.sharding.jdbc.service.UserService;
import org.junit.Assert;  


@RunWith(SpringRunner.class)
@ImportResource(locations = { "classpath*:config/spring/spring-database.xml",  
"classpath*:config/spring/spring-sharding.xml" })  
@SpringBootTest
//@SpringApplicationConfiguration(classes = SpringBootShardingJdbcApplication.class)
public class SpringBootShardingJdbcApplicationTests {

	 @Resource  
    public UserService userService;  
      
    @Resource  
    public StudentService studentService;  
	  
    @Test  
    public void testUserInsert() {  
        User u = new User();  
        u.setUserId(11);  
        u.setAge(25);  
        u.setName("github");  
        Assert.assertEquals(userService.insert(u), true);  
    }  
	      
//    @Test  
//    public void testStudentInsert() {  
//        Student student = new Student();  
//        student.setStudentId(21);  
//        student.setAge(21);  
//        student.setName("hehe");  
//        Assert.assertEquals(studentService.insert(student), true);  
//    }  
//	  
//    @Test  
//    public void testFindAll(){  
//        List<User> users = userService.findAll();  
//        if(null != users && !users.isEmpty()){  
//            for(User u :users){  
//                System.out.println(u);  
//            }  
//        }  
//    }  
//      
//    @Test  
//    public void testSQLIN(){  
//        List<User> users = userService.findByUserIds(Arrays.asList(2,10,1));  
//        if(null != users && !users.isEmpty()){  
//            for(User u :users){  
//                System.out.println(u);  
//            }  
//        }  
//    }  
//      
//    @Test  
//    public void testTransactionTestSucess(){  
//        userService.transactionTestSucess();  
//    }  
//      
//    @Test(expected = IllegalAccessException.class)  
//    public void testTransactionTestFailure() throws IllegalAccessException{  
//        userService.transactionTestFailure();  
//    }  
}
