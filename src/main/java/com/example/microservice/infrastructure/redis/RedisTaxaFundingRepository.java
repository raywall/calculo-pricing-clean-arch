package com.example.microservice.infrastructure.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.example.microservice.config.RedisConfig;
import com.example.microservice.domain.redis.TaxaFunding;
import com.example.microservice.infrastructure.persistence.redis.TaxaFundingRepository;
import java.util.Optional;


@Repository
public class RedisTaxaFundingRepository implements TaxaFundingRepository 
{
    private final RedisTemplate<String, TaxaFunding> redisTemplate;

    public RedisTaxaFundingRepository(RedisTemplate<String, TaxaFunding> redisTemplate) 
    {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public Optional<TaxaFunding> findById(String id) {
        return Optional.ofNullable(redisTemplate.opsForValue().get(id));
    }
}