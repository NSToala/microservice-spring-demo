package com.nstoala.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void guardar(String clave, String valor) {
        redisTemplate.opsForValue().set(clave, valor);
    }

    public String obtener(String clave) {
        return (String) redisTemplate.opsForValue().get(clave);
    }
}