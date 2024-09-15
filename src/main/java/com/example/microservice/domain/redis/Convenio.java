package com.example.microservice.domain.redis;


public class Convenio 
{
    private String codigoConvenio;
    private String nomeConvenio;   

    public void setCodigoConvenio(String codigoConvenio) {
        this.codigoConvenio = codigoConvenio;
    }

    public String getCodigoConvenio() {
        return codigoConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }
}