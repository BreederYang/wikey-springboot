package com.bgs.wikeyspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

public class ProvinceService {
    @Autowired
    StringRedisTemplate redisTemplate;
    public String getProvinceList(){
        return  redisTemplate.opsForValue().get("all-prvince");
    }
    public String getCityList(String provinceCode){
        return redisTemplate.opsForValue().get("province-city-"+provinceCode);
    }

}
