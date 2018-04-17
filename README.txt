spring-boot 结合当当网sharding-jdbc 实现分库分表功能

项目导入
	1. eclipse、maven 导入pom
	2. 创建数据库sharding_0、sharding_1
	3. 初始化数据库：spring-boot-sharding-jdbc\src\main\resources\db 目录下执行sql文件导入数据库

功能实现说明
	
	单库操作：
		1. 插入数据时，多张表同时写入
		2. 插入数据时，固定格式写入巩固表中 ——————————> 参考 Order 实现
	
	多库操作：
		1. 插入数据时，多库中多个表同时写入  ——————————> 参考 User 、Student 实现
		2. 插入数据时，多库中固定格式同时写入多个巩固表中
		3. 插入数据时，多库中固定格式只写入一张表中
	
	1. Order  模拟订单功能
		实现单库  分表，数据根据ID落入对应的表中
		举例说明：
			数据库只有一个 A
			A数据库中有t_order_0、t_order_1、t_order_2 三张表
			当用户向t_order中插入一条数据，首先会判断Order对象中orderId%3 的值（为什么是取模3，因为数据库中有3张t_order的表），如果值为0 则插入t_order_0表中，如果值为1 则插入t_order_1表中，如果值为2 则插入t_order_2表中
		
	2. User 、Student 模板用户功能
		实现多个库 多张表 同时插入数据
		举例说明：
			假设有3个数据库，分别位于不同服务器上，A、B、C
			然后每个库里面都有t_user_0,t_user_1表，
			如果用户插入一条数据到t_user中，那么数据库A、B、C中的t_user_0,t_user_1都将有相同的数据
				
