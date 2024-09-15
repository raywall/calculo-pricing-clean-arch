package com.example.microservice.domain.redis;

import java.math.BigDecimal;

public class LimiteOperacional 
{
    private String limiteOperacionalId;
    private BigDecimal limite;

    
    public void setLimiteOperacionalId(String limiteOperacionalId) {
        this.limiteOperacionalId = limiteOperacionalId;
    }
    
    public String getLimiteOperacionalId() {
        return limiteOperacionalId;
    }
    
    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public BigDecimal getLimite() {
        return limite;
    }
}