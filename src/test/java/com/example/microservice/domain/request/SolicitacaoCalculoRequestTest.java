package com.example.microservice.domain.request;

import com.example.microservice.domain.request.SolicitacaoCalculoRequest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolicitacaoCalculoRequestTest {

    @Test
    void testSolicitacaoCalculoRequestCreation() {
        // Arrange
        String solicitacaoId = "sol123";
        String convenioId = "conv123";
        String limiteId = "limite123";
        String taxaFundingId = "taxa123";
        
        // Act
        SolicitacaoCalculoRequest request = new SolicitacaoCalculoRequest();
        request.setSolicitacaoId(solicitacaoId);
        request.setConvenioId(convenioId);
        request.setLimiteId(limiteId);
        request.setTaxaFundingId(taxaFundingId);
        
        // Assert
        assertEquals(solicitacaoId, request.getSolicitacaoId());
        assertEquals(convenioId, request.getConvenioId());
        assertEquals(limiteId, request.getLimiteId());
        assertEquals(taxaFundingId, request.getTaxaFundingId());
    }
}
