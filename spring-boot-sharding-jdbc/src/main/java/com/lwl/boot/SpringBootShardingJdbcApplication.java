package com.lwl.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ImportResource(locations={ "classpath*:config/spring/spring-database.xml", 
							"classpath*:config/spring/spring-sharding.xml", 
						})
@MapperScan("com.lwl.boot.sharding.jdbc.mapper")
@EnableTransactionManagement
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class SpringBootShardingJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootShardingJdbcApplication.class, args);
	}
}
