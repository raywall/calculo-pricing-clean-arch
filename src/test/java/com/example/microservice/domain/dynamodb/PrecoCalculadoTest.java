package com.example.microservice.domain.dynamodb;

import com.example.microservice.domain.dynamodb.PrecoCalculado;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class PrecoCalculadoTest {

    @Test
    void testPrecoCalculadoCreation() {
        // Arrange
        String id = "1";
        String solicitacaoId = "sol123";
        BigDecimal valor = new BigDecimal("100.00");
        LocalDateTime dataCalculo = LocalDateTime.now();
        
        // Act
        PrecoCalculado preco = new PrecoCalculado();
        preco.setId(id);
        preco.setSolicitacaoId(solicitacaoId);
        preco.setValor(valor);
        preco.setDataCalculo(dataCalculo);
        
        // Assert
        assertEquals(id, preco.getId());
        assertEquals(solicitacaoId, preco.getSolicitacaoId());
        assertEquals(valor, preco.getValor());
        assertEquals(dataCalculo, preco.getDataCalculo());
    }
}
