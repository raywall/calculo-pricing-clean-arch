package com.example.microservice.infrastructure.redis;

import com.example.microservice.infrastructure.persistence.redis.ConvenioRepository;
import com.example.microservice.domain.redis.Convenio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RedisConvenioRepository implements ConvenioRepository {

    private final RedisTemplate<String, Convenio> redisTemplate;

    @Autowired
    public RedisConvenioRepository(RedisTemplate<String, Convenio> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public Optional<Convenio> findById(String id) {
        Convenio convenio = redisTemplate.opsForValue().get(id);  // Busca a entidade Convenio no Redis
        return Optional.ofNullable(convenio);  // Retorna Optional.empty() se não encontrado
    }
}
