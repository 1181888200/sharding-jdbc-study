package com.lwl.boot.sharding.jdbc.algorithm;

import java.util.Collection;
import java.util.LinkedHashSet;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;

public class OrderSingleKeyTableShardingAlgorithm  implements SingleKeyTableShardingAlgorithm<Long>  {

    /**
     * 对于分片字段的between操作都走这个方法。
     */
    public Collection<String> doBetweenSharding(Collection<String> tableNames, ShardingValue<Long> shardingValue) {
        Collection<String> result = new LinkedHashSet<>(tableNames.size());
        	 long modValue = shardingValue.getValue()%3;
        	 for (String each : tableNames) {
                 if (each.endsWith(String.valueOf(modValue))) {
                     result.add(each);
                 }
             }
        return result;
    }

    /**
     * 对于分片字段的等值操作 都走这个方法。(包括 插入 更新)
     */
    public String doEqualSharding(Collection<String> tableNames, ShardingValue<Long> shardingValue) {
    	
    	System.out.println("**************************************tableNames:"+tableNames.toString()+"************************************************************");
    	System.out.println("**************************************shardingValue:"+shardingValue.toString()+"************************************************************");
    	
        	 long modValue = shardingValue.getValue()%3;
        	 for (String each : tableNames) {
                 if (each.endsWith(String.valueOf(modValue))) {
                    return each;
                 }
             }
       throw  new IllegalArgumentException("无分表参数 无法定位具体数据表");
    }

    /**
     * 对于分片字段的in操作，都走这个方法。
     */
    public Collection<String> doInSharding(Collection<String> tableNames, ShardingValue<Long> shardingValue) {
        Collection<String> result = new LinkedHashSet<>(tableNames.size());
        
        long modValue = shardingValue.getValue()%3;
       	 for (String each : tableNames) {
                if (each.endsWith(String.valueOf(modValue))) {
                    result.add(each);
                }
            }
        
        return result;
    }
}