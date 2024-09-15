package com.example.microservice.domain.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;

import java.time.LocalDate;
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

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setSolicitacaoId(String solicitacaoId) {
        this.solicitacaoId = solicitacaoId;
    }

    public String getSolicitacaoId() {
        return solicitacaoId;
    }

    public void setDataCalculo(LocalDateTime dataCalculo) {
        this.dataCalculo = dataCalculo;
    }

    public LocalDateTime getDataCalculo() {
        return dataCalculo;
    }
}