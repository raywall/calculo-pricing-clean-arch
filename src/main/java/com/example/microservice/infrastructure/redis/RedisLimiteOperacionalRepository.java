package com.example.microservice.infrastructure.redis;

import com.example.microservice.domain.redis.LimiteOperacional;
import com.example.microservice.infrastructure.persistence.redis.LimiteOperacionalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RedisLimiteOperacionalRepository implements LimiteOperacionalRepository {

    private final RedisTemplate<String, LimiteOperacional> redisTemplate;

    @Autowired
    public RedisLimiteOperacionalRepository(RedisTemplate<String, LimiteOperacional> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public Optional<LimiteOperacional> findById(String id) {
        LimiteOperacional limiteOperacional = redisTemplate.opsForValue().get(id);
        return Optional.ofNullable(limiteOperacional);
    }
}
