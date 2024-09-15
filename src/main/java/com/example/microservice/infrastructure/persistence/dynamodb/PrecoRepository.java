package com.example.microservice.infrastructure.persistence.dynamodb;

import com.example.microservice.domain.dynamodb.PrecoCalculado;

public interface PrecoRepository 
{
    void save(PrecoCalculado preco);
}