package com.example.microservice.infrastructure.hl3;

import java.math.BigDecimal;

import com.example.microservice.domain.redis.Convenio;
import com.example.microservice.domain.redis.LimiteOperacional;
import com.example.microservice.domain.redis.TaxaFunding;

public interface Hl3ApiClient {
    BigDecimal calcularPreco(Convenio convenio, LimiteOperacional limite, TaxaFunding taxa);
}
