package com.example.microservice.infrastructure.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.example.microservice.config.RedisConfig;
import com.example.microservice.domain.redis.Convenio;
import com.example.microservice.infrastructure.persistence.redis.ConvenioRepository;
import java.util.Optional;

@Repository
public class RedisConvenioRepository implements ConvenioRepository 
{
    private final RedisTemplate<String, Convenio> redisTemplate;

    public RedisConvenioRepository(RedisTemplate<String, Convenio> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public Optional<Convenio> findById(String id) {
        return Optional.ofNullable(redisTemplate.opsForValue().get(id));
    }
}