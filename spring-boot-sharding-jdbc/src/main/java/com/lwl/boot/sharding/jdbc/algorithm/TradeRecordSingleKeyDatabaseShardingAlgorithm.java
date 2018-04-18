package com.lwl.boot.sharding.jdbc.algorithm;

import java.util.Collection;
import java.util.LinkedHashSet;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.database.SingleKeyDatabaseShardingAlgorithm;
import com.google.common.collect.Range;

/**
 * 这里为什么要 %2
 * 	因为现在存在2个数据库，而不是数据表的数量
 *
 */
public class TradeRecordSingleKeyDatabaseShardingAlgorithm implements SingleKeyDatabaseShardingAlgorithm<Long>{  
  
    /** 
     * sql 中关键字 匹配符为 =的时候，表的路由函数 
     */  
    public String doEqualSharding(Collection<String> availableTargetNames, ShardingValue<Long> shardingValue) {  
        for (String each : availableTargetNames) {  
            if (each.endsWith(shardingValue.getValue() % 2 + "")) {  
                return each;  
            }  
        }  
        throw new IllegalArgumentException();  
    }  
  
    /** 
     * sql 中关键字 匹配符为 in 的时候，表的路由函数 
     */  
    public Collection<String> doInSharding(Collection<String> availableTargetNames, ShardingValue<Long> shardingValue) {  
        Collection<String> result = new LinkedHashSet<String>(availableTargetNames.size());  
        for (Long value : shardingValue.getValues()) {  
            for (String tableName : availableTargetNames) {  
                if (tableName.endsWith(value % 2 + "")) {  
                    result.add(tableName);  
                }  
            }  
        }  
        return result;  
    }  
  
    /** 
     * sql 中关键字 匹配符为 between的时候，表的路由函数 
     */  
    public Collection<String> doBetweenSharding(Collection<String> availableTargetNames,  
            ShardingValue<Long> shardingValue) {  
        Collection<String> result = new LinkedHashSet<String>(availableTargetNames.size());  
        Range<Long> range = (Range<Long>) shardingValue.getValueRange();  
        for (long i = range.lowerEndpoint(); i <= range.upperEndpoint(); i++) {  
            for (String each : availableTargetNames) {  
                if (each.endsWith(i % 2 + "")) {  
                    result.add(each);  
                }  
            }  
        }  
        return result;  
    }  
  
}  