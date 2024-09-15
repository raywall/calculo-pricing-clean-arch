package com.example.microservice.domain.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;

import java.time.LocalDateTime;
import java.math.BigDecimal;

@DynamoDBTable(tableName = "PrecoCalculado")
public class PrecoCalculado 
{
    @DynamoDBHashKey(attributeName = "id")
    private String id;
    private BigDecimal valor;
    private String solicitacaoId;
    private LocalDateTime dataCalculo;

}