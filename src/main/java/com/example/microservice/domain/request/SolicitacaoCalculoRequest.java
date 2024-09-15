package com.example.microservice.domain.request;

public class SolicitacaoCalculoRequest {
    private String solicitacaoId;
    private String convenioId;
    private String limiteId;
    private String taxaFundingId;

    public String getSolicitacaoId() {
        return solicitacaoId;
    }

    public void setSolicitacaoId(String solicitacaoId) {
        this.solicitacaoId = solicitacaoId;
    }

    public String getConvenioId() {
        return convenioId;
    }

    public void setConvenioId(String convenioId) {
        this.convenioId = convenioId;
    }

    public String getLimiteId() {
        return limiteId;
    }

    public void setLimiteId(String limiteId) {
        this.limiteId = limiteId;
    }

    public String getTaxaFundingId() {
        return taxaFundingId;
    }

    public void setTaxaFundingId(String taxaFundingId) {
        this.taxaFundingId = taxaFundingId;
    }
}
