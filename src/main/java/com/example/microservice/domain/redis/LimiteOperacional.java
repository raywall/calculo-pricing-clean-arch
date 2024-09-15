package com.example.microservice.domain.redis;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LimiteOperacional 
{
    private String limiteOperacionalId;
    private BigDecimal limite;
}