package com.example.microservice.infrastructure.persistence.redis;

import java.util.Optional;
import com.example.microservice.domain.redis.Convenio;

public interface ConvenioRepository
{
    Optional<Convenio> findById(String id);
}