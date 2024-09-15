package com.example.microservice.infrastructure.persistence.redis;

import java.util.Optional;
import com.example.microservice.domain.redis.LimiteOperacional;

public interface LimiteOperacionalRepository 
{
    Optional<LimiteOperacional> findById(String id);
}