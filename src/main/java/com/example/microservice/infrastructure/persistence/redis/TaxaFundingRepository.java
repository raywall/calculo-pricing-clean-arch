package com.example.microservice.infrastructure.persistence.redis;

import java.util.Optional;
import com.example.microservice.domain.redis.TaxaFunding;

public interface TaxaFundingRepository 
{
    Optional<TaxaFunding> findById(String id);   
}