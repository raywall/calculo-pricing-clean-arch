package com.example.microservice.domain.redis;

import com.example.microservice.domain.redis.LimiteOperacional;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class LimiteOperacionalTest {

    @Test
    void testLimiteOperacionalCreation() {
        // Arrange
        String limiteOperacionalId = "limite123";
        BigDecimal limite = new BigDecimal("10000.00");
        
        // Act
        LimiteOperacional limiteOperacional = new LimiteOperacional();
        limiteOperacional.setLimiteOperacionalId(limiteOperacionalId);
        limiteOperacional.setLimite(limite);
        
        // Assert
        assertEquals(limiteOperacionalId, limiteOperacional.getLimiteOperacionalId());
        assertEquals(limite, limiteOperacional.getLimite());
    }
}
