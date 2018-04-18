package com.lwl.boot.sharding.jdbc.algorithm;

import java.util.Collection;
import java.util.LinkedHashSet;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;

public class TradeRecordSingleKeyTableShardingAlgorithm implements SingleKeyTableShardingAlgorithm<Long>{  
  
    /** 
     * sql 中 = 操作时，table的映射 
     */  
    public String doEqualSharding(Collection<String> tableNames, ShardingValue<Long> shardingValue) { 
   	 	long modValue = shardingValue.getValue()%3;
        for (String each : tableNames) {  
            if (each.endsWith(modValue + "")) {  
                return each;  
            }  
        } 
        
        throw new IllegalArgumentException();  
    }  
  
    /** 
     * sql 中 in 操作时，table的映射 
     */  
    public Collection<String> doInSharding(Collection<String> tableNames, ShardingValue<Long> shardingValue) {  
    	
    	System.out.println("==========================================tableNames:"+tableNames.toString()+"========================================================");
    	System.out.println("==========================================shardingValue:"+shardingValue.toString()+"========================================================");
    	
        Collection<String> result = new LinkedHashSet<String>(tableNames.size());  
        long modValue = shardingValue.getValue()%3;
//        for (long value : shardingValue.getValues()) {  
            for (String tableName : tableNames) {  
                if (tableName.endsWith(modValue + "")) {  
                    result.add(tableName);  
                }  
            }  
//        }  
        return result;  
    }  
  
    /** 
     * sql 中 between 操作时，table的映射 
     */  
    public Collection<String> doBetweenSharding(Collection<String> tableNames,  
            ShardingValue<Long> shardingValue) {  
        Collection<String> result = new LinkedHashSet<String>(tableNames.size());  
//        
//        
//        Range<Long> range = (Range<Long>) shardingValue.getValueRange();  
//        for (Long i = range.lowerEndpoint(); i <= range.upperEndpoint(); i++) {  
//            for (String each : tableNames) {  
//                if (each.endsWith(i % 3 + "")) {  
//                    result.add(each);  
//                }  
//            }  
//        } 
        long modValue = shardingValue.getValue()%3;
      	 for (String each : tableNames) {
               if (each.endsWith(String.valueOf(modValue))) {
                   result.add(each);
               }
           }
       
       return result;
    }  
  
}  