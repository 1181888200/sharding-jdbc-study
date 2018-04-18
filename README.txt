spring-boot 结合当当网sharding-jdbc 实现分库分表功能

项目导入
	1. eclipse、maven 导入pom
	2. 创建数据库sharding_0、sharding_1
	3. 初始化数据库：spring-boot-sharding-jdbc\src\main\resources\db 目录下执行sql文件导入数据库
	
版本说明：
	1. 所有功能实现是依赖sharding-jdbc 的1.0.0
		<dependency>  
            <groupId>com.dangdang</groupId>  
            <artifactId>sharding-jdbc-core</artifactId>  
            <version>1.0.0</version>  
        </dependency> 
		
	2. 分片说明
		2.1 表的分片 实现：SingleKeyTableShardingAlgorithm
		2.2 数据库的分片 实现：SingleKeyDatabaseShardingAlgorithm
		2.3 所有操作都根据分片字段来处理的

功能实现说明
	
	单库操作：
		1. 插入数据时，多张表同时写入		——————————> 参考 Member 实现
		2. 插入数据时，固定格式写入巩固表中 ——————————> 参考 Order 实现
		3. 其他根据分片策略而定
		作用：
			1.如果是多张表同时写入，就可以根据业务实现读写分离，写入的时候同时写入，读取的时候各自读取自己的对应数据表即可
			2.如果是固定格式写入固定表中，就可以根据业务实现数据库负载平衡，减少数据库存储量
	
	多库操作：
		1. 插入数据时，多库中多个表随机写入一个表  ——————————> 参考 User 、Student 实现
		2. 插入数据时，多库中固定格式写入多个巩固表中  ——————————> 参考 TradeRecord 实现
		3. 其他根据分片策略而定
		作用：
			同单库操作
	
	1. Order  模拟订单功能
		实现单库  分表，数据根据ID落入对应的表中
		举例说明：
			数据库只有一个 A
			A数据库中有t_order_0、t_order_1、t_order_2 三张表
			当用户向t_order中插入一条数据，首先会判断Order对象中orderId%3 的值（为什么是取模3，因为数据库中有3张t_order的表），如果值为0 则插入t_order_0表中，如果值为1 则插入t_order_1表中，如果值为2 则插入t_order_2表中
		
	2. User 、Student 模板用户功能
		实现多个库 多张表 随机写入一个表
		举例说明：
			假设有3个数据库，分别位于不同服务器上，A、B、C
			然后每个库里面都有t_user_0,t_user_1表，
			如果用户插入一条数据到t_user中，那么数据库A、B、C中的t_user_0,t_user_1将随机写入一个表
				
	3. Member  模拟会员功能
		实现单库  分表，数据落入多张表中
		举例说明：
			数据库只有一个 A
			A数据库中有t_member_0、t_member_1、t_member_2 三张表
			当用户向t_member中插入一条数据，那么t_member_0、t_member_1、t_member_2 三张表都将同时插入该条记录
			
	4. TradeRecord 模拟交易记录
		实现多个库 多张表 根据分片规则，将数据写入对应的库对应的表中
		举例说明：
			假设有3个数据库，分别位于不同服务器上，A、B、C
			然后每个库里面都有t_trade_record_0,t_trade_record_1,t_trade_record_2表，
			如果用户插入一条数据到t_trade_record中，那么会根据orderId %2的结果集找到对应的库，然后根据rderId %3的结果集找到对应的表，写入数据