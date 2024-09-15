package com.example.microservice.infrastructure.dynamodb;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import com.example.microservice.domain.dynamodb.PrecoCalculado;
import com.example.microservice.infrastructure.persistence.dynamodb.PrecoRepository;

@Repository
public class DynamoDbRepository implements PrecoRepository
{
    private final DynamoDBMapper dynamoDBMapper;

    @Autowired
    public DynamoDbRepository(DynamoDBMapper dynamoDBMapper)
    {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    @Override
    public void save(PrecoCalculado preco) {
        dynamoDBMapper.save(preco);
    }
}