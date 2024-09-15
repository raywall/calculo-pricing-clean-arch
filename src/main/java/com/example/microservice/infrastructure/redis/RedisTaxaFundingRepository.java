package com.example.microservice.infrastructure.redis;

import com.example.microservice.domain.redis.TaxaFunding;
import com.example.microservice.infrastructure.persistence.redis.TaxaFundingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RedisTaxaFundingRepository implements TaxaFundingRepository {

    private final RedisTemplate<String, TaxaFunding> redisTemplate;

    @Autowired
    public RedisTaxaFundingRepository(RedisTemplate<String, TaxaFunding> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public Optional<TaxaFunding> findById(String id) {
        TaxaFunding taxaFunding = redisTemplate.opsForValue().get(id);
        return Optional.ofNullable(taxaFunding);
    }
}
