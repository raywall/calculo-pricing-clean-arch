package com.example.microservice.infrastructure.hl3;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.microservice.domain.redis.Convenio;
import com.example.microservice.domain.redis.LimiteOperacional;
import com.example.microservice.domain.redis.TaxaFunding;

@Service
public class Hl3ApiClientImpl implements Hl3ApiClient {

    private final RestTemplate restTemplate;

    public Hl3ApiClientImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public BigDecimal calcularPreco(Convenio convenio, LimiteOperacional limite, TaxaFunding taxa) {
        // Lógica para chamar a API do HL3
        String url = "https://api.hl3.com/calculoPreco";
        // Aqui você envia os dados necessários para a API HL3 e obtém o preço calculado
        // Exemplo fictício
        return restTemplate.postForObject(url, new Object[]{convenio, limite, taxa}, BigDecimal.class);
    }
}
