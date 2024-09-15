package com.example.microservice.infrastructure.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.example.microservice.config.RedisConfig;
import com.example.microservice.domain.redis.LimiteOperacional;
import com.example.microservice.infrastructure.persistence.redis.LimiteOperacionalRepository;
import java.util.Optional;

@Repository
public class RedisLimiteOperacionalRepository implements LimiteOperacionalRepository 
{
    private final RedisTemplate<String, LimiteOperacional> redisTemplate;

    public RedisLimiteOperacionalRepository(RedisTemplate<String, LimiteOperacional> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public Optional<LimiteOperacional> findById(String id) {
        return Optional.ofNullable(redisTemplate.opsForValue().get(id));
    }
}