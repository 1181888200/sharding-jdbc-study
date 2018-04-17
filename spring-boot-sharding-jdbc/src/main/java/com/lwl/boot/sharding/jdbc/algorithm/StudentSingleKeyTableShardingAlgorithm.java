package com.lwl.boot.sharding.jdbc.algorithm;


import java.util.Collection;  
import java.util.LinkedHashSet;  
  
import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;  
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;  
import com.google.common.collect.Range;  
  
/** 
 * 因为t_student实际表在每个库中只有2个，所以 %2 
 * 
 */  
public class StudentSingleKeyTableShardingAlgorithm implements SingleKeyTableShardingAlgorithm<Integer>{  
  
    /** 
     * sql 中 = 操作时，table的映射 
     */  
    public String doEqualSharding(Collection<String> tableNames, ShardingValue<Integer> shardingValue) {  
        for (String each : tableNames) {  
            if (each.endsWith(shardingValue.getValue() % 2 + "")) {  
                return each;  
            }  
        } 
        
        throw new IllegalArgumentException();  
    }  
  
    /** 
     * sql 中 in 操作时，table的映射 
     */  
    public Collection<String> doInSharding(Collection<String> tableNames, ShardingValue<Integer> shardingValue) {  
        Collection<String> result = new LinkedHashSet<String>(tableNames.size());  
        for (Integer value : shardingValue.getValues()) {  
            for (String tableName : tableNames) {  
                if (tableName.endsWith(value % 2 + "")) {  
                    result.add(tableName);  
                }  
            }  
        }  
        return result;  
    }  
  
    /** 
     * sql 中 between 操作时，table的映射 
     */  
    public Collection<String> doBetweenSharding(Collection<String> tableNames,  
            ShardingValue<Integer> shardingValue) {  
        Collection<String> result = new LinkedHashSet<String>(tableNames.size());  
        Range<Integer> range = (Range<Integer>) shardingValue.getValueRange();  
        for (Integer i = range.lowerEndpoint(); i <= range.upperEndpoint(); i++) {  
            for (String each : tableNames) {  
                if (each.endsWith(i % 2 + "")) {  
                    result.add(each);  
                }  
            }  
        }  
        return result;  
    }  
  
}  