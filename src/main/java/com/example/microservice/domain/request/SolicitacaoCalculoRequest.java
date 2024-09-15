package com.example.microservice.domain.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SolicitacaoCalculoRequest {
    private String solicitacaoId;
    private String convenioId;
    private String limiteId;
    private String taxaFundingId;

    // Getters e setters
}
