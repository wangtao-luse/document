package com.explore.member.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class TestRedis {
	@Autowired
private RedisTemplate<String, String> redisTemplate;
	@Test
public void testRedis() {
	redisTemplate.opsForValue().set("uname", "wangtao");
	Object object = redisTemplate.opsForValue().get("uname");
	System.out.println(object);
}
}
