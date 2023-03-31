package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  TestController
 */
@RestController
@SuppressWarnings("all")
public class TestController {
    // test redis server connection
    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("/redis/add")
    public String addRedis() {
        redisTemplate.opsForValue().set("liongogoRedisTest", "I am Lion GoGo");
        return "加入成功";
    }

    @GetMapping("/redis/get")
    public Object getRedis() {
        Object value = redisTemplate.opsForValue().get("liongogoRedisTest");
        return value;
    }

}
