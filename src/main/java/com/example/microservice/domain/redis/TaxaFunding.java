package com.example.microservice.domain.redis;

import java.math.BigDecimal;

public class TaxaFunding 
{
    private String taxaFundingId;
    private BigDecimal taxa;

    public void setTaxaFundingId(String taxaFundingId) {
        this.taxaFundingId = taxaFundingId;
    }

    public String getTaxaFundingId() {
        return taxaFundingId;
    }

    public void setTaxa(BigDecimal taxa) {
        this.taxa = taxa;
    }

    public BigDecimal getTaxa() {
        return taxa;
    }
}