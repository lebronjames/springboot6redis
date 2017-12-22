package com.zhuowang.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
	
	private static final Logger logger = LoggerFactory.getLogger(RedisService.class);

	@Autowired
    private RedisTemplate<String, String> redisTemplate;
	
	public void test(){
		String key = "redisTestKey2";  
	    String value = "I am test value";  
	      
	    ValueOperations<String, String> opsForValue = redisTemplate.opsForValue();  
	    //数据插入测试：  
	    opsForValue.set(key, value);
	    String valueFromRedis = opsForValue.get(key);  
	    logger.info("redis value after set: {}", valueFromRedis);  
	}
}
