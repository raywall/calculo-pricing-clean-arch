package com.example.microservice.domain.redis;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Convenio 
{
    private String codigoConvenio;
    private String nomeConvenio;   
}