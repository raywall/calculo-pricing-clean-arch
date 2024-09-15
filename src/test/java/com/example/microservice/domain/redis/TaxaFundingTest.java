package com.example.microservice.domain.redis;

import com.example.microservice.domain.redis.TaxaFunding;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class TaxaFundingTest {

    @Test
    void testTaxaFundingCreation() {
        // Arrange
        String taxaFundingId = "taxa123";
        BigDecimal taxa = new BigDecimal("5.00");
        
        // Act
        TaxaFunding taxaFunding = new TaxaFunding();
        taxaFunding.setTaxaFundingId(taxaFundingId);
        taxaFunding.setTaxa(taxa);
        
        // Assert
        assertEquals(taxaFundingId, taxaFunding.getTaxaFundingId());
        assertEquals(taxa, taxaFunding.getTaxa());
    }
}
