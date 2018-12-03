package com.bgs.wikeyspringboot.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProvinceRedis implements CommandLineRunner{
    @Autowired
    private StringRedisTemplate redisTemplate;
    @Override
    public void run(String... args) throws Exception {
//        取得hash值
//        Object o = redisTemplate.opsForHash().get("demohash", "d1");

      //  System.out.println(o);
    }
}
