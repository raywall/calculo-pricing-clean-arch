package com.example.microservice.application;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.example.microservice.domain.dynamodb.PrecoCalculado;
import com.example.microservice.domain.redis.Convenio;
import com.example.microservice.domain.redis.LimiteOperacional;
import com.example.microservice.domain.redis.TaxaFunding;
import com.example.microservice.domain.request.SolicitacaoCalculoRequest;
import com.example.microservice.infrastructure.persistence.dynamodb.PrecoRepository;
import com.example.microservice.infrastructure.persistence.redis.ConvenioRepository;
import com.example.microservice.infrastructure.persistence.redis.TaxaFundingRepository;
import com.example.microservice.infrastructure.persistence.redis.LimiteOperacionalRepository;
import com.example.microservice.infrastructure.hl3.Hl3ApiClient;

public class CalcularPrecoUseCase 
{

    private final ConvenioRepository convenioRepository;
    private final LimiteOperacionalRepository limiteOperacionalRepository;
    private final TaxaFundingRepository taxaFundingRepository;
    private final PrecoRepository precoRepository;
    private final Hl3ApiClient hl3ApiClient;

    public CalcularPrecoUseCase(
        ConvenioRepository convenioRepository,
        LimiteOperacionalRepository limiteOperacionalRepository,
        TaxaFundingRepository taxaFundingRepository,
        PrecoRepository precoRepository,
        Hl3ApiClient hl3ApiClient
    ) {
        this.convenioRepository = convenioRepository;
        this.limiteOperacionalRepository = limiteOperacionalRepository;
        this.taxaFundingRepository = taxaFundingRepository;
        this.precoRepository = precoRepository;
        this.hl3ApiClient = hl3ApiClient;
    }

    public PrecoCalculado execute(SolicitacaoCalculoRequest request) {
        Convenio convenio = convenioRepository.findById(request.getConvenioId())
                .orElseThrow(() -> new RuntimeException("Convenio não encontrado"));

        LimiteOperacional limite = limiteOperacionalRepository.findById(request.getLimiteId())
                .orElseThrow(() -> new RuntimeException("Limite Operacional não encontrado"));

        TaxaFunding taxa = taxaFundingRepository.findById(request.getTaxaFundingId())
                .orElseThrow(() -> new RuntimeException("Taxa Funding não encontrada"));

        // Realiza o cálculo do preço utilizando a API externa HL3
        BigDecimal precoCalculado = hl3ApiClient.calcularPreco(convenio, limite, taxa);

        // Cria o objeto PrecoCalculado
        PrecoCalculado preco = new PrecoCalculado();
        preco.setId(UUID.randomUUID().toString());
        preco.setSolicitacaoId(request.getSolicitacaoId());
        preco.setValor(precoCalculado);
        preco.setDataCalculo(LocalDateTime.now());

        // Grava no DynamoDB
        precoRepository.save(preco);

        return preco;
    }
}
